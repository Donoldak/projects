package org.masa.ayanoter.controllers;

import org.masa.ayanoter.service.AutherizationService;
import org.masa.ayanoter.service.IAutherizationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Controller
public class  AuthorizationController {

    private final IAutherizationService autherizationService;

    public AuthorizationController(IAutherizationService autherizationService){
        this.autherizationService = autherizationService;
    }


    @RequestMapping(path = "/auth/login", method = RequestMethod.GET)
    public String getLogin(){
        return "auth/login";
    }

    @RequestMapping(path = "/auth/login", method = RequestMethod.POST)
    public String postLogin(@RequestParam(name = "username") String username, @RequestParam(name = "password") String password, Model model, HttpServletResponse httpServletResponse) throws Exception {
        if (!autherizationService.isValid(username,password)){
            throw new Exception("BAD LOGIN AND PASSWORD");
        }

        int secret = autherizationService.getSecret(username, password);
        Cookie cookie = new Cookie("secret",String.valueOf(secret));
        cookie.setPath("/");
        httpServletResponse.addCookie(cookie);


        model.addAttribute("username", username);
        model.addAttribute("password", password);
        model.addAttribute("secret", secret);
        return "auth/succssful";
    }
}

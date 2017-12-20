package org.masa.ayanoter.controllers;

import org.masa.ayanoter.service.IAutherizationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    public HomeController(){

    }

    @RequestMapping("/home/news")
    public String getNews() throws Exception {

        return "home/news";
    }

    @RequestMapping("/home/settings")
    public String getSettings(){
        return "home/settings";
    }

    @RequestMapping("/home/newPost")
    public String getNewPost(Model model) throws Exception{
        List<Post> posts = new ArrayList<>();
        posts.add(new Post("User1", "fdafasfd"));
        posts.add(new Post("User2", "ewfwefws"));
        model.addAttribute("post", posts);
        return "home/newPost";
    }
}

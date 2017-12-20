package org.masa.ayanoter.controllers;

import org.masa.ayanoter.dataAccess.Post;
import org.masa.ayanoter.dataAccess.PostRepository;
import org.masa.ayanoter.dataAccess.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    private PostRepository postRepository;
    private UserRepository userRepository;

    @Autowired
    public HomeController(PostRepository postRepository, UserRepository userRepository){
        this.postRepository = postRepository;
        this.userRepository = userRepository;
    }



    @RequestMapping("/home/news")
    public String getNews(Model model) throws Exception {
        Iterable<Post> posts = postRepository.findAll();
        model.addAttribute("posts", posts);
        return "home/news";
    }

    @RequestMapping("/home/settings")
    public String getSettings(){
        return "home/settings";
    }

    @RequestMapping(path="/home/newPost", method = RequestMethod.GET)
    public String getNewPost(){
        return "home/newPost";
    }


    @Transactional
    @RequestMapping(path="/home/newPost", method = RequestMethod.POST)
    public String postNewPost(@RequestParam String postText) {
//        userRepository.findAll().

        postRepository.save(new Post("Vasya", postText));



        return "redirect:/home/news";
    }
}

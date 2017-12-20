package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @Autowired
    public A a;


    @Qualifier("second")
    @Autowired
    public INameCapitalizer nameCapitalizer;


    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        String nameCapitalized = nameCapitalizer.capitaloze(name);
        model.addAttribute("name", nameCapitalized);
        return "greeting";
    }

}
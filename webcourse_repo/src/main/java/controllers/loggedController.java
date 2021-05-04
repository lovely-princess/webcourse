package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class loggedController {
    @RequestMapping(value = "/userhome", method = RequestMethod.GET)
    public ModelAndView userhome() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("userhome");
        return modelAndView;
    }

    @RequestMapping(value = "/adminhome", method = RequestMethod.GET)
    public ModelAndView adminhome() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("adminhome");
        return modelAndView;
    }
}

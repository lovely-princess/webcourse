package controllers;

import DAO.usersDAO;
import classes.users;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.sql.SQLException;
import java.util.List;

@Controller
public class loggedController {
    @RequestMapping(value = "/userhome", method = RequestMethod.GET)
    public ModelAndView userhome() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("userhome");
        return modelAndView;
    }

    @RequestMapping(value = "/adminhome", method = RequestMethod.GET)
    public ModelAndView adminhome() throws SQLException {
        usersDAO usersdao = new usersDAO();
        List<users> allusers = usersdao.loadAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("adminhome");
        modelAndView.addObject("usersList", allusers);
        return modelAndView;
    }
}

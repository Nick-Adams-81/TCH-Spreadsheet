package com.example.tchspreadsheet.Controllers;


import com.example.tchspreadsheet.Models.User;
import com.example.tchspreadsheet.Repositories.UserRepository;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;


@Controller
public class HomeController {

    private final UserRepository userDao;


    public HomeController(UserRepository userDao) {
        this.userDao = userDao;
    }

    @GetMapping("/home")
    public String home(Model model) {
        User loginUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        User user = userDao.findById(loginUser.getId());
        model.addAttribute("homepage", user.getSpreadsheet());
        return "home";
    }
}

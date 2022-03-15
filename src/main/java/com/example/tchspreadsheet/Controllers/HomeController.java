package com.example.tchspreadsheet.Controllers;


import com.example.tchspreadsheet.Models.LoginTimes;
import com.example.tchspreadsheet.Models.User;
import com.example.tchspreadsheet.Repositories.LoginTimesRepository;
import com.example.tchspreadsheet.Repositories.UserRepository;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;


@Controller
public class HomeController {

    private final UserRepository userDao;
    private final LoginTimesRepository loginDao;

    public HomeController(UserRepository userDao, LoginTimesRepository loginDao) {
        this.userDao = userDao;
        this.loginDao = loginDao;
    }

    @GetMapping("/home")
    public String home(Model model) {
        User loginUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        User user = userDao.findById(loginUser.getId());
        model.addAttribute("homepage", user.getSpreadsheet());
        model.addAttribute("startTime", new LoginTimes());
        return "home";
    }
}

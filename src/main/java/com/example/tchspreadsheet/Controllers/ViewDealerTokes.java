package com.example.tchspreadsheet.Controllers;

import com.example.tchspreadsheet.Models.User;
import com.example.tchspreadsheet.Repositories.UserRepository;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewDealerTokes {


    private UserRepository userDao;

    public ViewDealerTokes(UserRepository userDao) {
        this.userDao = userDao;
    }

    @GetMapping("/viewDealerTokes")
    public String ViewTokes(Model model) {
        User loginUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        User user = userDao.findById(loginUser.getId());
        model.addAttribute("dealer", user.getDealer());
        model.addAttribute("tokes", user.getDealerTokes());
        return "viewTokes";

    }
}

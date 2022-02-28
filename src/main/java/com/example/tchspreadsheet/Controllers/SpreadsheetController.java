package com.example.tchspreadsheet.Controllers;


import com.example.tchspreadsheet.Models.User;
import com.example.tchspreadsheet.Repositories.UserRepository;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

@Controller
public class SpreadsheetController {

    private final UserRepository userDao;

    public SpreadsheetController(UserRepository userDao) {
        this.userDao = userDao;
    }


    @GetMapping("/spreadsheet")
    public String spreadsheet(Model model) {
        User loginUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Optional<User> user = userDao.findById(loginUser.getId());
        model.addAttribute("homepage", user.get());
        return "spreadsheet";
    }
}

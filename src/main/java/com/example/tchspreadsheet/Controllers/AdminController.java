package com.example.tchspreadsheet.Controllers;


import com.example.tchspreadsheet.Models.User;
import com.example.tchspreadsheet.Repositories.UserRepository;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    private UserRepository userDao;

    public AdminController(UserRepository userDao) {
        this.userDao = userDao;
    }

    @GetMapping("/admin")
    public String admin(Model model) {
        User loginUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        User user = userDao.findById(loginUser.getId());
        model.addAttribute("spreadsheet", user.getSpreadsheet());
        model.addAttribute("dealerTokes", user.getDealerTokes());
        return "/admin";
    }
}

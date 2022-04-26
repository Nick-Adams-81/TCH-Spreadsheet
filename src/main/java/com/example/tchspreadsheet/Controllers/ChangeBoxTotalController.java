package com.example.tchspreadsheet.Controllers;


import com.example.tchspreadsheet.Models.User;
import com.example.tchspreadsheet.Repositories.UserRepository;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChangeBoxTotalController {

    private UserRepository userDao;

    public ChangeBoxTotalController(UserRepository userDao) {
        this.userDao = userDao;
    }


    @GetMapping("/changeBoxTotal")
    public String boxTotal(Model model) {
        User loginUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        User user = userDao.findById(loginUser.getId());
        model.addAttribute("user", user.getId());
        return "changeBoxTotal";
    }
}

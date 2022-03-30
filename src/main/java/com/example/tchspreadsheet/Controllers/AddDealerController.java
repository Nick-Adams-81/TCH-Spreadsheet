package com.example.tchspreadsheet.Controllers;


import com.example.tchspreadsheet.Models.User;
import com.example.tchspreadsheet.Repositories.DealerRepository;
import com.example.tchspreadsheet.Repositories.UserRepository;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AddDealerController {


    private UserRepository userDao;
    private DealerRepository dealerDao;

    public AddDealerController(UserRepository userDao, DealerRepository dealerDao) {
        this.userDao = userDao;
        this.dealerDao = dealerDao;
    }

    @GetMapping("/addDealer")
    public String addDealer(Model model) {
        User loginUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        User user = userDao.findById(loginUser.getId());
        model.addAttribute("user", user.getId());
        return "add-dealer";
    }
}

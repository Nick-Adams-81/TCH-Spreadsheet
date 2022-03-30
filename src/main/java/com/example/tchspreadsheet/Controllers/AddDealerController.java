package com.example.tchspreadsheet.Controllers;


import com.example.tchspreadsheet.Models.Dealer;
import com.example.tchspreadsheet.Models.Spreadsheet;
import com.example.tchspreadsheet.Models.User;
import com.example.tchspreadsheet.Repositories.DealerRepository;
import com.example.tchspreadsheet.Repositories.UserRepository;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

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
        model.addAttribute("dealer", new Dealer());
        return "add-dealer";
    }

    @PostMapping("/addDealer")
    public String saveSpreadsheet(@ModelAttribute Dealer dealer) {
        User loginUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        User user = userDao.findById(loginUser.getId());
        List<Dealer> dealerList = user.getDealer();
        dealerList.add(dealer);
        user.setDealer(dealerList);
        userDao.save(user);
        return "/add-dealer";
    }
}

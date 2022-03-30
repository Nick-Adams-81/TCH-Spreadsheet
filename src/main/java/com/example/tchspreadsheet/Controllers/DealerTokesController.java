package com.example.tchspreadsheet.Controllers;

import com.example.tchspreadsheet.Models.DealerTokes;
import com.example.tchspreadsheet.Models.User;
import com.example.tchspreadsheet.Repositories.DealerTokesRepository;
import com.example.tchspreadsheet.Repositories.SpreadsheetRepository;
import com.example.tchspreadsheet.Repositories.UserRepository;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class DealerTokesController {

    private UserRepository userDao;
    private DealerTokesRepository dealerTokesDao;

    public DealerTokesController(UserRepository userDao, DealerTokesRepository dealerTokesDao) {
        this.userDao = userDao;
        this.dealerTokesDao = dealerTokesDao;
    }

    @GetMapping("/dealerTokes")
    public String dealerTokes(Model model) {
        User loginUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        User user = userDao.findById(loginUser.getId());
        model.addAttribute("user", user.getDealerTokes());
        model.addAttribute("dealerTokes", new DealerTokes());
        model.addAttribute("dealers", user.getDealer());
        return "dealer-tokes";
    }

    @PostMapping("/dealerTokes")
    public String saveDealerTokes(@ModelAttribute DealerTokes dealerTokes) {
        User loginUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        User user = userDao.findById(loginUser.getId());
        List<DealerTokes> dealerTokesList = user.getDealerTokes();
        dealerTokesList.add(dealerTokes);
        user.setDealerTokes(dealerTokesList);
        userDao.save(user);
        return "/dealer-tokes";
    }
}

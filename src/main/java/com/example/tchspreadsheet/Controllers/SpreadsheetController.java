package com.example.tchspreadsheet.Controllers;


import com.example.tchspreadsheet.Models.Spreadsheet;
import com.example.tchspreadsheet.Models.User;
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
public class SpreadsheetController {

    private  UserRepository userDao;
    private  SpreadsheetRepository spreadsheetDao;

    public SpreadsheetController(UserRepository userDao, SpreadsheetRepository spreadsheetDao) {
        this.userDao = userDao;
        this.spreadsheetDao = spreadsheetDao;
    }


    @GetMapping("/spreadsheet")
    public String spreadsheet(Model model) {
        User loginUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        User user = userDao.findById(loginUser.getId());
        model.addAttribute("homepage", user.getSpreadsheet());
        model.addAttribute("spreadsheet", new Spreadsheet());
        return "spreadsheet";
    }

    @PostMapping("/spreadsheet")
    public String saveSpreadsheet(@ModelAttribute Spreadsheet spreadsheet) {
        User loginUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        User user = userDao.findById(loginUser.getId());
        List<Spreadsheet> spreadsheetList = user.getSpreadsheet();
        spreadsheetList.add(spreadsheet);
        user.setSpreadsheet(spreadsheetList);
        userDao.save(user);
        return "/spreadsheet";
    }
}

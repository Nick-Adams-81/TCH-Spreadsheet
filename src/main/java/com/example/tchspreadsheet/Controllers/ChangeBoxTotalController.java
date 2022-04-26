package com.example.tchspreadsheet.Controllers;


import com.example.tchspreadsheet.Repositories.UserRepository;
import org.springframework.stereotype.Controller;

@Controller
public class ChangeBoxTotalController {

    private UserRepository userDao;

    public ChangeBoxTotalController(UserRepository userDao) {
        this.userDao = userDao;
    }


}

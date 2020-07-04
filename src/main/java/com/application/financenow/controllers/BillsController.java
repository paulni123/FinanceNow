package com.application.financenow.controllers;

import com.application.financenow.models.data.BillsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("bills")
public class BillsController {

    @Autowired
    private BillsDao billsDao;

    @GetMapping
    public String display(Model model){
        model.addAttribute("bills", billsDao.findAll());
        model.addAttribute("mainTitle", "List of Bills");


        return "display";
    }
}

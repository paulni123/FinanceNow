package com.application.financenow.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("bills")
public class BillsController {

    @RequestMapping("")
    @ResponseBody
    public String display(Model model){

        return "Hello World";
    }
}

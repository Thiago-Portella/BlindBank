package com.blindbank.Banking.controller;

import com.blindbank.Banking.dao.ContaDao;
import com.blindbank.Banking.model.Conta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class IndexController {
    @Autowired
    private ContaDao dao;

    @GetMapping({ "/", "/index" })
    public String homePage() {

        return "index"; // name of the View
    }

    @GetMapping("/buscarporconta")
    public String BuscaIndividual() {

        return "buscarporconta";
    }
}
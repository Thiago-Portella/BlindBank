package com.blindbank.Banking.controller;

import com.blindbank.Banking.dao.ContaDao;
import com.blindbank.Banking.model.Conta;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class ContaController {
  @Autowired
  private ContaDao dao;

        @GetMapping("/contas")
        public List<Conta> recuperarTodas() {
          return (List<Conta>) dao.findAll();
        }

        @GetMapping("/contas/{numero}")
        public Conta recuperarPeloNumero(@PathVariable int numero) {
          return dao.findById(numero).orElse(null);
        }
}

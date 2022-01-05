package com.blindbank.Banking.dao;

import org.springframework.data.repository.CrudRepository;

import com.blindbank.Banking.model.Conta;

public interface ContaDao extends CrudRepository<Conta,Integer> {

}

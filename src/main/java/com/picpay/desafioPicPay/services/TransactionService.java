package com.picpay.desafioPicPay.services;

import com.picpay.desafioPicPay.domain.transactional.Transaction;
import com.picpay.desafioPicPay.domain.transactional.TransactionRepository;
import com.picpay.desafioPicPay.dtos.TransactionDTO;
import com.picpay.desafioPicPay.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class TransactionService {
    @Autowired
    private UserService userService;
    @Autowired
    private TransactionRepository repository;


    public void createTransaction(TransactionDTO transaction){

    }

}

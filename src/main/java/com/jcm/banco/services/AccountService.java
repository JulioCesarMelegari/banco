package com.jcm.banco.services;

import com.jcm.banco.entities.Account;

import org.springframework.stereotype.Service;

@Service
public interface AccountService {

    Account findById(Long id);

    Account create(Account accountToCreate);

    void delete(Long id);

    Account update(Long id);
    
}

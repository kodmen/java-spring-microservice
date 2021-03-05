package com.haydikodlayal.m.accountservice.service;

import com.haydikodlayal.m.accountservice.entitiy.Account;
import com.haydikodlayal.m.accountservice.repo.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@RequiredArgsConstructor
@Service
public class AccountService {

    private final AccountRepository accountRepository;

    public Account get(String id){
        return accountRepository.findById(id).orElseThrow(() -> new IllegalArgumentException());
    }

    public Account save(Account account){
        return  accountRepository.save(account);
    }

    public Account update(String id, Account account){
        Assert.isNull(id, "Id cannot be null");
        return accountRepository.save(account);

    }

    public void delete(String id){

    }


}

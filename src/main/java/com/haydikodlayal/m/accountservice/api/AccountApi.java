package com.haydikodlayal.m.accountservice.api;

import com.haydikodlayal.m.accountservice.entitiy.Account;
import com.haydikodlayal.m.accountservice.service.AccountService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("account")
/**
 * localhost:8080/account
 * get put detele post
 */
public class AccountApi {

    private final AccountService accountService;

    public AccountApi(AccountService accountService) {
        this.accountService = accountService;
    }



    @GetMapping("/{id}")
    public ResponseEntity<Account> get(@PathVariable("id") String id){
       return ResponseEntity.ok(accountService.get(id));// http kodlarınya geri döndürüyor yani 200 döndürüyor
    }

    @PatchMapping
    public ResponseEntity<Account> save(@RequestBody Account account){
        return ResponseEntity.ok(accountService.save(account));
    }

    @PutMapping
    public ResponseEntity<Account> update(@PathVariable("id") String id, @RequestBody Account account){
        return ResponseEntity.ok(accountService.update(id, account));
    }

    @DeleteMapping
    public void delete(String id){
        accountService.delete(id);
    }


}

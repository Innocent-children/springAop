package org.example.service;

import org.example.pojo.Account;

import java.util.List;

public interface AccountService {
    int save();

    int update();

    int delete();

    Account findById(Integer id);

    List<Account> findAll();
}

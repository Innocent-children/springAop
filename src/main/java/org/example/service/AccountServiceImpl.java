package org.example.service;

import org.example.pojo.Account;

import java.util.List;

public class AccountServiceImpl implements AccountService {

    public int save() {
        System.out.println("------------------");
        System.out.println("模拟保存成功了");
        System.out.println("------------------");
        //int i=1/0;
        return 0;
    }

    public int update() {
        System.out.println("------------------");
        System.out.println("模拟修改成功了");
        System.out.println("------------------");
        return 0;
    }

    public int delete() {
        System.out.println("------------------");
        System.out.println("模拟删除成功了");
        System.out.println("------------------");
        return 0;
    }

    public Account findById(Integer id) {
        System.out.println("------------------");
        System.out.println("模拟查询成功了");
        System.out.println("------------------");
        return null;
    }

    public List<Account> findAll() {
        System.out.println("------------------");
        System.out.println("模拟查询成功了");
        System.out.println("------------------");
        return null;
    }
}

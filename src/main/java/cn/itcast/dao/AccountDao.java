package cn.itcast.dao;

import cn.itcast.domain.Account;

import java.util.List;

public interface AccountDao {

    List<Account> findAll();

    void saveAccount(Account account);
}

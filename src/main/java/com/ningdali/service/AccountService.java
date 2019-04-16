package com.ningdali.service;

import com.ningdali.pojo.Account;

import java.util.List;

public interface AccountService {
    /**
     * 查询所有信息
     * @return
     */
    public List<Account> findAll();

    /**
     * 保存账户
     * @param account
     */
    public void saveAccount(Account account);
}

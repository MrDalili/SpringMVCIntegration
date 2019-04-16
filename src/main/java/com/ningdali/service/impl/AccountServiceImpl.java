package com.ningdali.service.impl;

import com.ningdali.dao.AccountDao;
import com.ningdali.pojo.Account;
import com.ningdali.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired()
    private AccountDao accountDao;
    @Override
    public List<Account> findAll() {
        System.out.println("业务层查询所有的账户信息");
        List<Account> accounts = accountDao.findAll();
        return accounts;
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层保存账号");
        accountDao.saveAccount(account);
    }
}

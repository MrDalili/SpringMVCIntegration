package com.ningdali.controller;

import com.ningdali.pojo.Account;
import com.ningdali.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 账户web
 */
@Controller
@RequestMapping("account")
public class AccountController {
    @Autowired
    @Qualifier("accountService")
    private AccountService accountService;

    @RequestMapping("findAll")
    public String findAll(Model model) {
        System.out.println("表现层查询所有的账户信息");
        List<Account> list = accountService.findAll();
        System.out.println(list);
        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping("save")
    public String saveAccount(Model model,Account account, HttpServletRequest request) {
        System.out.println("表现层保存账号");
        accountService.saveAccount(account);
        return findAll(model);
    }
}

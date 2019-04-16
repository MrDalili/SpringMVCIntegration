package com.ningdali.test;

import com.ningdali.dao.AccountDao;
import com.ningdali.pojo.Account;
import com.ningdali.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestSpring {

    @Test
    public void run1(){
        //加载spring配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取对象
        AccountService accountService = (AccountService) ac.getBean("accountService");
        //加载类对象
        accountService.findAll();
    }

    @Test
    public void data() throws IOException {
        //读取配置文件
        InputStream in = Resources.getResourceAsStream("mybatisConfig.xml");
        //创建Sqlsession工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //使用工厂产生session对象
        SqlSession sqlSession = factory.openSession();
        //使用sqlsession代理dao对象
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
        //调用方法
        List<Account> accounts = accountDao.findAll();
        //遍历
        for (Account account : accounts) {
            System.out.println(account);
        }
        sqlSession.close();
        in.close();
    }
    @Test
    public void data1() throws IOException {
        //读取配置文件
        InputStream in = Resources.getResourceAsStream("mybatisConfig.xml");
        //创建Sqlsession工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //使用工厂产生session对象
        SqlSession sqlSession = factory.openSession();
        //使用sqlsession代理dao对象
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
        Account account = new Account();
        account.setMoney(200.0);
        account.setName("宁大力1");
        //调用方法
        accountDao.saveAccount(account);
        sqlSession.commit();
        //遍历
        sqlSession.close();
        in.close();
    }
}

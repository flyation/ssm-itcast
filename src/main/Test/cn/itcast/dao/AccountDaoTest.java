package cn.itcast.dao;

import cn.itcast.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class AccountDaoTest {

    @Test
    public void testFindAll() throws IOException {
        // 加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession session = factory.openSession();
        // 获取代理对象
        AccountDao mapper = session.getMapper(AccountDao.class);
        List<Account> all = mapper.findAll();
        all.forEach(System.out::println);
        session.close();
        in.close();
    }

    @Test
    public void testSaveAccount() throws IOException {
        // 加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        // 开启自动提交
        SqlSession session = factory.openSession(true);
        AccountDao mapper = session.getMapper(AccountDao.class);

        Account account = new Account();
        account.setName("熊大");
        account.setMoney(300D);
        mapper.saveAccount(account);

        session.close();
        in.close();
    }
}

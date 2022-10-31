package service.impl;

import dao.IAccountDao;
import dao.impl.AccountDaoImpl;
import service.IAccountService;

/**
 * 账户的业务层实现类
 */

public class AccountServiceImpl implements IAccountService {

    private IAccountDao accountDao=new AccountDaoImpl();
    public void saveAccount() {

        accountDao.saveAccount();
    }
}

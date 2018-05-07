package cn.intellif.serviec.impl;

import cn.intellif.service.IUserService;
import cn.intellif.base.ServerResult;
import cn.intellif.dao.UserDao;
import cn.intellif.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@com.alibaba.dubbo.config.annotation.Service(interfaceClass = IUserService.class)
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Object save(User user) {
        userDao.save(user);
        return ServerResult.sucess();
    }

    @Override
    public Object listAll() {
        return userDao.listAll();
    }
}

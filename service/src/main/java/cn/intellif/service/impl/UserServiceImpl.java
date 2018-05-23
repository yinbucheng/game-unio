package cn.intellif.service.impl;

import cn.intellif.dao.UserDao;
import cn.intellif.domain.User;
import cn.intellif.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@com.alibaba.dubbo.config.annotation.Service(interfaceClass = IUserService.class,version = "1.0",token = "123")
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public List<User> listAll() {
        return userDao.findAll();
    }

    @Override
    public List<User> findUserWithName(String name) {
        return userDao.findLikeField("name",name+"%");
    }

}

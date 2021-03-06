package cn.intellif.service;

import cn.intellif.domain.User;

import java.util.List;

public interface IUserService {
    void save(User user);
    List<User> listAll();
    List<User> findUserWithName(String name);
}

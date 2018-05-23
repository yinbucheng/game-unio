package cn.intellif.service;

import cn.intellif.domain.User;

import java.util.List;

public interface IUserService {
    Object save(User user);
    List<User> listAll();
}

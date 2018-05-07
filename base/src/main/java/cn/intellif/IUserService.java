package cn.intellif;

import cn.intellif.domain.User;

public interface IUserService {
    Object save(User user);
    Object listAll();
}

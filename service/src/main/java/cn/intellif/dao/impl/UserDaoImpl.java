package cn.intellif.dao.impl;

import cn.intellif.core.BaseDaoImpl;
import cn.intellif.domain.User;
import cn.intellif.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {
}

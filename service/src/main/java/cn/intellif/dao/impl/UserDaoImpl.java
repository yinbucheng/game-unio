package cn.intellif.dao.impl;

import cn.intellif.domain.User;
import cn.intellif.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private EntityManager em;


    @Override
    public void save(User entity) {
        em.persist(entity);
    }

    @Override
    public List<User> listAll() {
        return em.createQuery("select p from User p ").getResultList();
    }
}

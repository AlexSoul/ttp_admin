package dao.controllers;

import dao.entities.Users;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * Created by alex on 25.11.16.
 */
@Repository
public class UsersDAOImpl implements UsersDAO {

    @Autowired
    private SessionFactory sessionFactory;// = new Configuration().configure().buildSessionFactory();


    @Override
    public void createUser(Users user) {
        sessionFactory.getCurrentSession().save(user);
    }

    @Override
    public boolean authUser(Users user) {
        Query query = sessionFactory.getCurrentSession().createQuery("from Users where username = :username");
        query.setParameter("username",user.getUsername());
        return query.list().size()>0;
    }


}

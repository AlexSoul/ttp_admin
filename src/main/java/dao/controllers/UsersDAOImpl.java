package dao.controllers;

import dao.entities.Users;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.security.MessageDigest;


/**
 * Created by alex on 25.11.16.
 */
@Repository
public class UsersDAOImpl implements UsersDAO {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public void createUser(Users user) {
        sessionFactory.getCurrentSession().save(user);
    }

    @Override
    public Users authUser(Users user) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(("TTP"+user.getUsername() + user.getPassword()).getBytes());
            Query query = sessionFactory.getCurrentSession().createQuery("from Users where username = :username and password = :password");
            query.setParameter("username", user.getUsername());

            byte[] mdbytes = md.digest();
            StringBuffer hexString = new StringBuffer();
            for (int i=0;i<mdbytes.length;i++) {
                String hex=Integer.toHexString(0xff & mdbytes[i]);
                if(hex.length()==1) hexString.append('0');
                hexString.append(hex);
            }
            //System.out.println(new String(hexString.toString()));
            query.setParameter("password", hexString.toString());
            return (Users)query.list().get(0);
        }catch (Exception ex){
            return null;
        }
    }


}

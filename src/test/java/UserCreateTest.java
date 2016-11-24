/**
 * Created by alex on 24.11.16.
 */

import junit.framework.TestCase;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import dao.entities.Users;

public class UserCreateTest extends TestCase{
    public void testApp() {
        System.out.print("********************--------------------------------------------");
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Users user = new Users();
        user.setUsername("Test");
        session.save(user);
        Users user2 = new Users();
        user2.setUsername("Test2");
        session.save(user2);
        Users user3 = new Users();
        user3.setUsername("Test3");
        session.save(user3);

        session.getTransaction().commit();
        session.close();
    }
}

package dao.services;

import dao.controllers.UsersDAO;
import dao.entities.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by alex on 28.11.16.
 */
@Service
public class UsersServicesImpl implements UsersServices {

    @Autowired
    UsersDAO usersDAO;

    @Transactional
    public void createUser(Users user) {
        usersDAO.authUser(user);

    }

    @Transactional
    public Users authUser(Users user) {
        return usersDAO.authUser(user);
    }
}

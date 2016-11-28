package dao.services;

import dao.entities.Users;

/**
 * Created by alex on 28.11.16.
 */
public interface UsersServices {
    public void createUser(Users user);

    public boolean authUser (Users user);
}


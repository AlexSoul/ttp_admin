package dao.controllers;

/**
 * Created by alex on 25.11.16.
 */
import dao.entities.Users;

public interface UsersDAO {
    public void createUser(Users user);

    public Users authUser (Users user);
}

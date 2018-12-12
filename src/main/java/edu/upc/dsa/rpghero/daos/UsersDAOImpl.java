package edu.upc.dsa.rpghero.daos;

import edu.upc.dsa.rpghero.modelos.User;

public class UsersDAOImpl implements DAOUsers {
    @Override
    public void addUser() {
        System.out.println("addUSer OK");
    }

    @Override
    public void deleteUser() {

    }

    @Override
    public User getUser(int idUser) {
        return new User("Sergi");
    }
}

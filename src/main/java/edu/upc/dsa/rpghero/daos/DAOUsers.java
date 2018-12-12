package edu.upc.dsa.rpghero.daos;

import edu.upc.dsa.rpghero.modelos.User;

public interface DAOUsers {

        public void addUser();
        public void deleteUser();
        public User getUser(int idUser);

    }

}

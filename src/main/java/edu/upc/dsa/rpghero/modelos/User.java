package edu.upc.dsa.rpghero.modelos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class User {

    public String getIdUser() {
        return idUser;
    }
/*
*/
    
    private String idUser;
    private String mail;
    private String password;
    private List<Game> partidasGuardadas; 
     

    //Si hacemos un servicio siempre añadir el constructor vacio!!!!
    public User() {}

    public User(String idUser, String mail, String password) {
        this.idUser = idUser;
        this.mail = mail;
        this.password = password;
    }

    public void getIdUser(int idUser){
        return idUser;
    }
        
    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Game getGameById(int gameId) {

        for (int i = 0; i < games.size(); i++) {
            Game game = games.get(i);
            if (game.getIdGame().equals(gameId)){
                logger.info("Devolvemos game que corrsponde a la id " + game.getIdGame());
                return game;
            }
        }
        return null;
    }
    

}

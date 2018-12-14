package edu.upc.dsa.rpghero.modelos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class User {

/*
*/
    private int idUser;
    private String mail;
    private String password;
    private List<Game> partidasGuardadas;
     

    //Si hacemos un servicio siempre añadir el constructor vacio!!!!
    public User() {}

    public User(String mail, String password) {
        this.mail = mail;
        this.password = password;
        this.partidasGuardadas = new ArrayList<>();
    }

    public List<Game> getGamesFromUser() {
        return partidasGuardadas;
    }


    public int getIdUser(int idUser){
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

        for (int i = 0; i < partidasGuardadas.size(); i++) {
            Game game = partidasGuardadas.get(i);
            if (game.getIdGame() == (gameId)){
                return game;
            }
        }
        return null;
    }
    

}

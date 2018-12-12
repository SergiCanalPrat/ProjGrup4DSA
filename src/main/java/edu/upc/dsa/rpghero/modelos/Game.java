package edu.upc.dsa.modelo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
*/
    private int idGame;
    private int idUser;
    private int health;
    private int points;
    private int level;
    
    private Date hour;
    private String mail;
    private HashMap<int, Object> inventory;
    
    private Map mapa; 
    
    //Si hacemos un servicio siempre añadir el constructor vacio!!!!
    public Game() {}

    public Game(int idGame, int idUser, int health, int points, int level, 
            Date hour, String mail) {
        this.idGame = idGame;
        this.idUser = idUser;
        this.health = health;
        this.points = points;
        this.level = level;
        this.hour = hour;
        this.mail = mail;
        this.inventory = new HashMap<>();
    }

    public String getIdGame() {
        return idGame;
    }
    
    public void setIdGame(String idGame) {
        this.idGame = idGame;
    }

    public String getIdUser() {
        return idUser;
    }
    
    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public HashMap<int, Object> getInventory() {
        return inventory;
    }

    public void setInventory(HashMap<int, Object> inventory) {
        this.inventory = inventory;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }


}

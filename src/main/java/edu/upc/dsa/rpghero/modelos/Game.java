package edu.upc.dsa.rpghero.modelos;

import java.util.*;

/*
 */

public class Game {
    private int idGame;
    private int idUser;
    private int health;
    private int points;
    private int level;

    private Date hour;
    private String mail;
    private HashMap<Integer, Object> inventory;

    private Map mapa;

    //Si hacemos un servicio siempre añadir el constructor vacio!!!!
    public Game() {
    }

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

    public int getIdGame() {
        return idGame;
    }

    public void setIdGame(int idGame) {
        this.idGame = idGame;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Date getHour() {
        return hour;
    }

    public void setHour(Date hour) {
        this.hour = hour;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public HashMap<Integer, Object> getInventory() {
        return inventory;
    }

    public void setInventory(HashMap<Integer, Object> inventory) {
        this.inventory = inventory;
    }

    public Map getMap() {
        return mapa;
    }

    public void setMap(Map map) {
        this.mapa = map;
    }


}

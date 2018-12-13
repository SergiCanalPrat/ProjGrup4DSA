package edu.upc.dsa.rpghero.modelos;

import java.util.ArrayList;
import java.util.List;

public class Enemy{

    public Enemy(){

    }
    private int idEnemy;
    private int speed;
    private int pain;
    private String type;
    private int idPosition;


    public Enemy(int idEnemy, int speed, int pain, String type, int idPosition) {
        this.idEnemy= idEnemy;
        this.speed = speed;
        this.pain = pain;
        this.type = type;
        this.idPosition = idPosition;
    }

    public int getIdEnemy() {
        return idEnemy;
    }

    public void setIdEnemy(int idEnemy) {
        this.idEnemy = idEnemy;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPain() {
        return pain;
    }

    public void setPain(int pain) {
        this.pain = pain;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getIdPosition() {
        return idPosition;
    }

    public void setIdPosition(int idPosition) {
        this.idPosition = idPosition;
    }

}


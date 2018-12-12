package edu.upc.dsa.rpghero.modelos;

import java.util.ArrayList;
import java.util.List;

public class Enemy{

    public Enemy(){

    }
    private String idEnemy;
    private int speed;
    private String type;
    private double positionId;

    public String getidEnemy() {
        return idEnemy;
    }

    public int getspeed() {
        return speed;
    }

    public Enemy(String idEnemy, int type, int speed, int positionId) {
        this.idEnemy= idEnemy;
        this.type = type;
        this.speed = speed;
        this.positionId = positionId;
    }

    public void setIdEnemy(String idEnemy) {
        this.idEnemy= idEnemy;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPositionId() {
        return positionId;
    }

    public void setPositionId(double positionId) {
        this.positionId = positionId;
    }

}


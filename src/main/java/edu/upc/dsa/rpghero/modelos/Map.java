package edu.upc.dsa.rpghero.modelos;

import java.util.HashMap;

public class Map{

    public Map(){}

    private int numColumns;
    private int idMap;
    private int numObjects;
    private int numRows;
    private int numEnemies;
    private HashMap<Integer, Enemy> mapEnemies;
    private HashMap<Integer, Object> mapObjects;


    public Map(int idMap, int numEnemies, int numObjects, int numRows, int numColumns) {
        this.idMap= idMap;
        this.numEnemies = numEnemies;
        this.numObjects = numObjects;
        this.numRows = numRows;
        this.numColumns = numColumns;
        this.mapEnemies = new HashMap<>();
        this.mapObjects = new HashMap<>();
    }

    public void setIdMap(int idMap) {
        this.idMap = idMap;
    }

    public int getidMap() {
        return idMap;
    }

    public int getnumObjects() {
        return numObjects;
    }

    public void setnumObjects(int numObjects) {
        this.numObjects = numObjects;
    }

    public int getnumRows() {
        return numRows;
    }

    public void setnumRows(int numRows) {
        this.numRows = numRows;
    }

    public int getnumColumns() {
        return numColumns;
    }

    public void setnumColumns(int numColumns) {
        this.numColumns = numColumns;
    }

    public double getnumEnemies() {
        return numEnemies;
    }

    public void setnumEnemies(int numEnemies) {
        this.numEnemies = numEnemies;
    }

    public HashMap<Integer, Enemy> getMapEnemies() {
        return mapEnemies;
    }

    public void setMapEnemies(HashMap<Integer, Enemy> mapEnemies) {
        this.mapEnemies = mapEnemies;
    }

    public HashMap<Integer, Object> getMapObjects() {
        return mapObjects;
    }

    public void setMapObjects(HashMap<Integer, Enemy> mapObjects) {
        this.numObjects = numObjects;
    }

}
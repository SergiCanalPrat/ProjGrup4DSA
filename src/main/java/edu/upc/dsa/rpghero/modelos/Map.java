package edu.upc.dsa.rpghero.modelos;

public class Map{

    private String idMap;
    private int numObjects;
    private String numRows;
    private double numEnemies;
    private HashMap<int, Enemy> mapEnemies;
    private HashMap<int, Object> mapObjects;

    public Map(){}

    public Map(int idMap, int numEnemies, int numObjects, int numRows, int numColumns) {
        this.idMap= idMap;
        this.numEnemies = numEnemies;
        this.numObjects = numObjects;
        this.numRows = numRows;
        this.numColumns = numColumns;
        this.mapEnemies = new HashMap<>();
        this.mapObjects = new HashMap<>();
    }

    public void setIdMap(String idMap) {
        this.idMap= idMap;
    }

    public String getidMap() {
        return idMap;
    }

    public String getnumObjects() {
        return numObjects;
    }

    public void setnumObjects(int numObjects) {
        this.numObjects = numObjects;
    }

    public String getnumRows() {
        return numRows;
    }

    public void setnumRows(String numRows) {
        this.numRows = numRows;
    }

    public String getnumColumns() {
        return numColumns;
    }

    public void setnumColumns(String numColumns) {
        this.numColumns = numColumns;
    }

    public double getnumEnemies() {
        return numEnemies;
    }

    public void setnumEnemies(double numEnemies) {
        this.numEnemies = numEnemies;
    }

    public HashMap<int, Enemy> getMapEnemies() {
        return numEnemies;
    }

    public void setMapEnemies(HashMap<int, Enemy> mapEnemies) {
        this.mapEnemies = mapEnemies;
    }

    public double getMapObjects() {
        return mapObjects;
    }

    public void setMapObjects(HashMap<int, Enemy> mapObjects) {
        this.numObjects = numObjects;
    }

}
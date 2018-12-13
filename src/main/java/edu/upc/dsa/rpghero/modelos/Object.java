package edu.upc.dsa.rpghero.modelos;

public class Object {


    private int idObject;
    private String name;
    private int price;
    private int idPosition;
    private int idMap;
                
    //Si hacemos un servicio siempre añadir el constructor vacio!!!!
    public Object() {}
                
    public Object(int idObject, String name, int price, int idPosition, int idMap) {
        this.idObject = idObject;
        this.name = name;
        this.price = price;
        this.idPosition = idPosition;
        this.idMap = idMap;
    }

    public int getidObject() {
        return idObject;
    }

    public void setidObject(int idObject) {
        this.idObject = idObject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

      public int getIdPosition() {
        return idPosition;
    }

    public void setIdPosition(int idPosition) {
        this.idPosition = idPosition;
    }

    public int getIdMap() {
        return idMap;
    }

    public void setName(int idMap) {
        this.idMap = idMap;
    }
/* 
    public List<Bike> getBikesFromObject() {
        return bikesFromObject;
    }

    public void addBike(Bike b){
        this.bikesFromObject.add(b);
    }

    public void setBikesFromObject(List<Bike> bikesFromObject) {
        this.bikesFromObject = bikesFromObject;
    } */
}
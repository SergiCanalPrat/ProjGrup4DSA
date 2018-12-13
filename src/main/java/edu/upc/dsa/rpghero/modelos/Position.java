package edu.upc.dsa.rpghero.modelos;

public class Position {
    
    private int idPos;
    private int idMap;
    private int idGame;
    private int idPosition;
    
    private int x;
    private int y;

    //Si hacemos un servicio siempre añadir el constructor vacio!!!!
    public Position() {}
    
    public Position(int idPosition, int x, int y, int idGame, int idMap) {
        
        this.idPosition = idPosition;
        this.x = x;
        this.y = y;
        this.idGame = idGame;
        this.idMap = idMap;        
    }
    
    public int getidPosition() {
        return idPosition;
    }

    public void setIdPosition(int IdPosition) {
        this.idPosition = idPosition;
    }

    public int getX() {
        return x;
    }    

    public void setX(int x) {
        this.x = x;
    }


    public int getY() {
        return y;
    }    

    public void sety(int y) {
        this.y = y;
    }

    public int getidGame() {
        return idGame;
    }

    public void setidGame(int idGame) {
        this.idGame = idGame;
    }

    public int getidMap() {
        return idMap;
    }

    public void setidMap(int idMap) {
        this.idMap = idMap;
    }
    
}    
package edu.upc.dsa.rpghero.modelos;

import java.util.ArrayList;
import java.util.List;

public class PNJ{

    private String idPNJ;
    private int idMap;
    private String dialogue1;
    private int positionId;

    public PNJ(){}

    public PNJ(String idPNJ, int idMap, String dialogue1, String dialogue2,
                String dialogue3,String dialogue4, int idPosition ) {
        this.idPNJ= idPNJ;
        this.type = type;
        this.idMap = idMap;
        this.dialogue1 = dialogue1;
        this.dialogue2 = dialogue2;
        this.dialogue3 = dialogue3;
        this.dialogue4 = dialogue4;
        this.idPosition = idPosition;
    }

     public String getidPNJ() {
        return idPNJ;
    }

    public void setIdPNJ(String idPNJ) {
        this.idPNJ = idPNJ;
    }

    public int getidMap() {
        return idMap;
    }

    public void setDialogue1(int dialogue1) {
        this.dialogue1 = dialogue1;
    }

    public String getDialogue1() {
        return dialogue1;
    }

    public void setDialogue2(int dialogue2) {
        this.dialogue2 = dialogue2;
    }

    public String getDialogue2() {
        return dialogue2;
    }

    public void setDialogue3(int dialogue3) {
        this.dialogue3 = dialogue3;
    }

    public String getDialogue3() {
        return dialogue3;
    }

    public void setDialogue4(int dialogue4) {
        this.dialogue4 = dialogue4;
    }

    public String getDialogue4() {
        return dialogue4;
    }

    public void idPosition(int idPosition) {
        this.idPosition = idPosition;
    }

    public String idPosition() {
        return idPosition;

}
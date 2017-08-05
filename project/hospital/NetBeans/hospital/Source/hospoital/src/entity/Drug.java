/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Administrator
 */
public class Drug {
    private int drugID;
    private String drugName;
    private int drugPrice;
    private int drugTypeID;
    private String drugTypeName;
    private int drugStock;

    public int getDrugStock() {
        return drugStock;
    }

    public void setDrugStock(int drugStock) {
        this.drugStock = drugStock;
    }

    public String getDrugTypeName() {
        return drugTypeName;
    }

    public void setDrugTypeName(String drugTypeName) {
        this.drugTypeName = drugTypeName;
    }
    
    public int getDrugTypeID() {
        return drugTypeID;
    }

    public void setDrugTypeID(int drugTypeID) {
        this.drugTypeID = drugTypeID;
    }

    public int getDrugID() {
        return drugID;
    }

    public void setDrugID(int drugID) {
        this.drugID = drugID;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public int getDrugPrice() {
        return drugPrice;
    }

    public void setDrugPrice(int drugPrice) {
        this.drugPrice = drugPrice;
    }
     public String toString(){
     return drugName;
    }
    
}

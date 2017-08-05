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
public class PatientBuyExt extends PatientBuy{
    
    private String  drugName;
    private int drugStock;

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

  
    public String getDrugName() {
        return drugName;
    }

    public void setDrugStock(int drugStock) {
        this.drugStock = drugStock;
    }

    public int getDrugStock() {
        return drugStock;
    }

  
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Medicine;

import Business.UserAccount.UserAccount;

/**
 *
 * @author Administrator
 */
public class Medicine {
  //  private String medNumber;
    private String medName;
    private int quantity;
    private String status;
    //private String message;
    private UserAccount Salesman;
    private UserAccount AccountantName;
    private double price;

    public Medicine(){
    }
     public Medicine(String medName,int quantity,String status,UserAccount Salesman,UserAccount AccountantName,double price) {
      
       this.medName=medName;
       this.quantity=quantity;
       this.status=status;
       this.Salesman=Salesman;
       this.AccountantName=AccountantName;
       this.price=price;
    }
    
   

    public String getMedName() {
        return medName;
    }

    public void setMedName(String medName) {
        this.medName = medName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UserAccount getSalesman() {
        return Salesman;
    }

    public void setSalesman(UserAccount Salesman) {
        this.Salesman = Salesman;
    }

    public UserAccount getAccountantName() {
        return AccountantName;
    }

    public void setAccountantName(UserAccount AccountantName) {
        this.AccountantName = AccountantName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString(){
        return medName;
    }
    
}

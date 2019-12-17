/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Medicine;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class MedicineDirectory {
     private List<Medicine> medicinedirectory;
     
      public MedicineDirectory(){
        medicinedirectory=new ArrayList<>();

    }

    public List<Medicine> getMedicinedirectory() {
        return medicinedirectory;
    }

    public void setMedicinedirectory(List<Medicine> medicinedirectory) {
        this.medicinedirectory = medicinedirectory;
    }
     public Medicine addMedicine(String medName,int quantity,String status,UserAccount Salesman,UserAccount AccountantName,double price) {
        Medicine medicine=new Medicine(medName,quantity,status,Salesman,AccountantName,price);
        medicinedirectory.add(medicine);
        return medicine;
    }
    
    public void deleteMedicine(Medicine m){
        medicinedirectory.remove(m);
    }
     
}

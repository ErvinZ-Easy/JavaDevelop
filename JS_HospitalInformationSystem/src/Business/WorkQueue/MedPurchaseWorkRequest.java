/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Medicine.Medicine;

/**
 *
 * @author Administrator
 */
public class MedPurchaseWorkRequest extends WorkRequest {
        private Medicine medicine;
      // private String result;

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

  public String toString(){
      return this.getSender().getUsername();
  }

  

}

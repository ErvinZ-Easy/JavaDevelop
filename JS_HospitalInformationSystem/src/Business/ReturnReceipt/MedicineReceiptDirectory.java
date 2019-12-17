/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ReturnReceipt;

import Business.Patientaskmedicine.askformedicine;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author cheny
 */
public class MedicineReceiptDirectory {
     private ArrayList<MedicineReceipt> MedicineReceiptRecordSet;

    public MedicineReceiptDirectory() {
       MedicineReceiptRecordSet = new ArrayList<MedicineReceipt>();
    }

    public ArrayList<MedicineReceipt> getMedicineReceiptRecordSet() {
        return MedicineReceiptRecordSet;
    }

    public void setMedicineReceiptRecordSet(ArrayList<MedicineReceipt> MedicineReceiptRecordSet) {
        this.MedicineReceiptRecordSet = MedicineReceiptRecordSet;
    }
    
    public MedicineReceipt AddaMedicineReceiptRecord(String HospitalName,UserAccount DoctorName,UserAccount PatientName,String Medicine,int Quantity,int money,String medicinestatus){
        MedicineReceipt cr=new MedicineReceipt(HospitalName,DoctorName,PatientName,Medicine,Quantity,money,medicinestatus);
        MedicineReceiptRecordSet.add(cr);
        return cr;
    }
    
    public void DeleteMedicineReceiptRecord(MedicineReceipt cr){
        MedicineReceiptRecordSet.remove(cr);
    }
}

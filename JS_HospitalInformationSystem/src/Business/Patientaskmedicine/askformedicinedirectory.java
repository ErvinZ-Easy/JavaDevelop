/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patientaskmedicine;

import Business.Clinical.ClinicalRecord;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author cheny
 */
public class askformedicinedirectory {
     private ArrayList<askformedicine> askformedicineRecordSet;

    public askformedicinedirectory() {
       askformedicineRecordSet = new ArrayList<askformedicine>();
    }

    public ArrayList<askformedicine> getaskformedicineRecordSet() {
        return askformedicineRecordSet;
    }

    public void setaskformedicineRecordSet(ArrayList<askformedicine> askformedicineRecordSet) {
        this.askformedicineRecordSet = askformedicineRecordSet;
    }
    
    public askformedicine AddaskformedicineRecord(String HospitalName,UserAccount DoctorName,UserAccount PatientName,String Medicine,int Quantity,String medicinestatus){
        askformedicine cr=new askformedicine(HospitalName,DoctorName,PatientName,Medicine,Quantity,medicinestatus);
        askformedicineRecordSet.add(cr);
        return cr;
    }
    
    public void DeleteaskformedicineRecord(askformedicine cr){
        askformedicineRecordSet.remove(cr);
    }
}

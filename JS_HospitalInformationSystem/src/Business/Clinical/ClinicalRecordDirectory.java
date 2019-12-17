/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Clinical;

import Business.UserAccount.UserAccount;
import java.util.HashSet;

/**
 *
 * @author yizhe
 */
public class ClinicalRecordDirectory {
    private HashSet<ClinicalRecord> clinicalRecordSet;

    public ClinicalRecordDirectory() {
        clinicalRecordSet = new HashSet<ClinicalRecord>();
    }

    public HashSet<ClinicalRecord> getClinicalRecordSet() {
        return clinicalRecordSet;
    }

    public void setClinicalRecordSet(HashSet<ClinicalRecord> clinicalRecordSet) {
        this.clinicalRecordSet = clinicalRecordSet;
    }
    
    public ClinicalRecord AddClinicalRecord(String HospitalName,UserAccount DoctorName,UserAccount PatientName,String Condition,String Medicine,int Quantity,String remark,String status){
        ClinicalRecord cr=new ClinicalRecord(HospitalName,DoctorName,PatientName,Condition,Medicine,Quantity,remark,status);
        clinicalRecordSet.add(cr);
        return cr;
    }
    
    public void DeleteClinicalRecord(ClinicalRecord cr){
        clinicalRecordSet.remove(cr);
    }
}

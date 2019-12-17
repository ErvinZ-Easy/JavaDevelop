/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patientaskmedicine;

import Business.UserAccount.UserAccount;

/**
 *
 * @author cheny
 */
public class askformedicine {
    private String HospitalName;
    private UserAccount DoctorName;
    private UserAccount PatientName;
    private String Medicine;
    private int Quantity;
   
    private String medicinestatus;
    public askformedicine(String HospitalName,UserAccount DoctorName,UserAccount PatientName,String Medicine,int Quantity,String medicinestatus) {
        this.HospitalName=HospitalName;
        this.DoctorName=DoctorName;
        this.PatientName=PatientName;
        this.Medicine=Medicine;
        this.Quantity=Quantity;
        this.medicinestatus=medicinestatus;
    }

    public String getHospitalName() {
        return HospitalName;
    }

    public void setHospitalName(String HospitalName) {
        this.HospitalName = HospitalName;
    }

    public UserAccount getDoctorName() {
        return DoctorName;
    }

    public void setDoctorName(UserAccount DoctorName) {
        this.DoctorName = DoctorName;
    }

    public UserAccount getPatientName() {
        return PatientName;
    }

    public void setPatientName(UserAccount PatientName) {
        this.PatientName = PatientName;
    }

    public String getMedicine() {
        return Medicine;
    }

    public void setMedicine(String Medicine) {
        this.Medicine = Medicine;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public String getMedicinestatus() {
        return medicinestatus;
    }

    public void setMedicinestatus(String medicinestatus) {
        this.medicinestatus = medicinestatus;
    }
    public String toString(){
        return HospitalName;
    }
}

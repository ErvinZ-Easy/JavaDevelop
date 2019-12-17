/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ReturnReceipt;

import Business.UserAccount.UserAccount;

/**
 *
 * @author cheny
 */
public class MedicineReceipt {
    private String HospitalName;
    private UserAccount DoctorName;
    private UserAccount PatientName;
    private String Medicine;
    private int Quantity;
    private int money;
    private String medicinestatus;
    public MedicineReceipt(String HospitalName,UserAccount DoctorName,UserAccount PatientName,String Medicine,int Quantity,int money,String medicinestatus) {
        this.HospitalName=HospitalName;
        this.DoctorName=DoctorName;
        this.PatientName=PatientName;
        this.Medicine=Medicine;
        this.Quantity=Quantity;
        this.money=money;
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

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
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

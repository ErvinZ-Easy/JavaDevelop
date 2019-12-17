/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Clinical;

import Business.UserAccount.UserAccount;

/**
 *
 * @author yizhe
 */
public class ClinicalRecord {
    private String HospitalName;
    private UserAccount DoctorName;
    private UserAccount PatientName;
    private String Condition;
    private String Medicine;
    private int Quantity;
    private String remark;
    private  String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public ClinicalRecord(String HospitalName,UserAccount DoctorName,UserAccount PatientName,String Condition,String Medicine,int Quantity,String remark,String status) {
        this.HospitalName=HospitalName;
        this.DoctorName=DoctorName;
        this.PatientName=PatientName;
        this.Medicine=Medicine;
        this.Quantity=Quantity;
        this.remark=remark;
        this.Condition=Condition;
        this.status=status;
    }

    public String getHospitalName() {
        return HospitalName;
    }

    public UserAccount getDoctorName() {
        return DoctorName;
    }

    public UserAccount getPatientName() {
        return PatientName;
    }

    public String getCondition() {
        return Condition;
    }

    public String getMedicine() {
        return Medicine;
    }

    public int getQuantity() {
        return Quantity;
    }

    public String getRemark() {
        return remark;
    }

    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    public void setMedicine(String Medicine) {
        this.Medicine = Medicine;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    
    @Override
    public String toString(){
        return HospitalName;
    }
    
}

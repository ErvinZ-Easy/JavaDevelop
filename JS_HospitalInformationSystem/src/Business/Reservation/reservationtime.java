/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Reservation;

import Business.UserAccount.UserAccount;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author cheny
 */
public class reservationtime {
    private String Hospital;
    private UserAccount Doctor;
    private Date date;
    private String TimePeriod;
    private String status;
    private UserAccount PatientName;
    private String remark;
    public reservationtime(String Hospital, UserAccount Doctor, Date date,String TimePeriod,String status,UserAccount PatientName,String remark) {
  
        this.Hospital = Hospital;
        this.Doctor = Doctor;
        this.date=date;
        this.TimePeriod=TimePeriod;
        this.status=status;
        this.PatientName=PatientName;
        this.remark=remark;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    
    public UserAccount getPatientName() {
        return PatientName;
    }

    public void setPatientName(UserAccount PatientName) {
        this.PatientName = PatientName;
    }
    
    public String getHospital() {
        return Hospital;
    }

    public void setHospital(String Hospital) {
        this.Hospital = Hospital;
    }

    public UserAccount getDoctor() {
        return Doctor;
    }

    public void setDoctor(UserAccount Doctor) {
        this.Doctor = Doctor;
    }

    

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTimePeriod() {
        return TimePeriod;
    }

    public void setTimePeriod(String TimePeriod) {
        this.TimePeriod = TimePeriod;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString(){
        return this.Hospital;
    }
}

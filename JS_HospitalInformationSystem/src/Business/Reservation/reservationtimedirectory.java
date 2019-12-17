/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Reservation;

import Business.UserAccount.UserAccount;
import java.util.Date;
import java.util.HashSet;

/**
 *
 * @author cheny
 */
public class reservationtimedirectory {
    private HashSet<reservationtime> reservationtimeSet;

    public reservationtimedirectory() {
        reservationtimeSet=new HashSet<reservationtime>();
    }
    
    public HashSet<reservationtime> getReservationtimeSet() {
        return reservationtimeSet;
    }

    public void setReservationtimeSet(HashSet<reservationtime> reservationtimeSet) {
        this.reservationtimeSet = reservationtimeSet;
    }

    public void AddReservationTime(String Hospital, UserAccount Doctor,Date date,String TimePeriod,String status,UserAccount PatientName,String remark) {
        
        reservationtime rt=new reservationtime(Hospital,Doctor,date,TimePeriod,status,PatientName,remark);
        reservationtimeSet.add(rt);
    }

    
    public void deletereservationtime(reservationtime rt){
        reservationtimeSet.remove(rt);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Reservation.reservationtime;
import Business.Role.DoctorRole;
import java.util.Date;

/**
 *
 * @author cheny
 */
public class ReservationWorkRequest extends WorkRequest {
      private reservationtime rt;

    public reservationtime getRt() {
        return rt;
    }

    public void setRt(reservationtime rt) {
        this.rt = rt;
    }
      
    @Override
    public String toString(){
        return "rwr";
    }
        
}

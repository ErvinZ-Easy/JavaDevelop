package Business.WorkQueue;

import Business.Clinical.ClinicalRecord;
import Business.Medicine.Medicine;
import Business.People.People;
import Business.Reservation.reservationtime;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.Date;
import Business.WorkQueue.*;
import Business.Patientaskmedicine.askformedicine;


/**
 *
 *
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequestList;
    public WorkQueue() {
        workRequestList = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
     
    
      public ReservationWorkRequest createworkRequest(UserAccount sender, UserAccount receiver, String status,Date requestDate,Date resolveDate){
      
        ReservationWorkRequest rq=new ReservationWorkRequest();
        rq.setReceiver(receiver);
        rq.setSender(sender);
        rq.setStatus(status);
        //rq.setRequestDate(requestDate);
        rq.setResolveDate(resolveDate);
        
        workRequestList.add(rq);
        return rq;
   
    }
     public ReservationWorkRequest createReservationworkRequest(UserAccount sender, UserAccount receiver, String status,Date requestDate,Date resolveDate,reservationtime rt){
      
        ReservationWorkRequest rq=new ReservationWorkRequest();
        rq.setReceiver(receiver);
        rq.setSender(sender);
        rq.setStatus(status);
//     rq.setRequestDate(requestDate);
        rq.setResolveDate(resolveDate);
        rq.setRt(rt);
        workRequestList.add(rq);
        return rq;
   
    }
      public TestWorkRequest createtestworkRequest(UserAccount sender, UserAccount receiver, String status,Date requestDate,Date resolveDate){
      
        TestWorkRequest rq=new TestWorkRequest();
        rq.setReceiver(receiver);
        rq.setSender(sender);
        rq.setStatus(status);
//        rq.setRequestDate(requestDate);
        rq.setResolveDate(resolveDate);

        workRequestList.add(rq);
        return rq;
   
    }
      
    public ClinicalWorkRequest createclinicalWorkRequest(UserAccount sender,UserAccount receiver,ClinicalRecord record){
        ClinicalWorkRequest cwr=new ClinicalWorkRequest();
        cwr.setReceiver(receiver);
        cwr.setSender(sender);
        cwr.setClinicalrecord(record);
        cwr.setResolveDate(new Date());
        workRequestList.add(cwr);
        return cwr;
    }
    public askmedicineWorkRequest createaskformedicineWorkRequest(UserAccount sender,UserAccount receiver,askformedicine record){
        askmedicineWorkRequest cwr=new askmedicineWorkRequest();
        cwr.setReceiver(receiver);
        cwr.setSender(sender);
        cwr.setaskformedicinerecord(record);
        cwr.setResolveDate(new Date());
        workRequestList.add(cwr);
        return cwr;
    }
      public MedPurchaseWorkRequest createmedpurchaseworkRequest(UserAccount sender, UserAccount receiver, String status,Medicine medicine){
          MedPurchaseWorkRequest rq=new MedPurchaseWorkRequest();
          rq.setReceiver(receiver);
          rq.setSender(sender);
          rq.setStatus(status);
          rq.setMedicine(medicine);
          
          workRequestList.add(rq);
          return rq;
      }
}
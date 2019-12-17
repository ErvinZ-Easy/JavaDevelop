/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author yizhe
 */
public class FlightSchedule {
    private List<Flight> flightschedule;
    private List<Flight> filterflightschedule;
    
    public FlightSchedule(Flight f){
        flightschedule=new ArrayList<>();
        filterflightschedule=new ArrayList<>();
    }
    
    public FlightSchedule(){
        try{
        flightschedule=new ArrayList<>();
        filterflightschedule=new Vector<>();
       
        Flight flight1=new Flight("AA001","boeing999","PVG","BOS","evening","roundtrip",
        "2019.12.30-11:00:00","2019.12.29-21:00:00","2019.12.31-00:00:00","airlinerAA","planeNum1","On time");
        Flight flight2=new Flight("BB002","airbus999","PVG","NY","day time","roundtrip",
        "2019.12.31-04:00:00","2019.12.30-14:00:00","2019.12.31-00:00:00","airlinerBB","planeNum2","On time");
        Flight flight3=new Flight("CC003","bbq999","PVG","LA","morning","single",
        "2019.12.31-23:00:00","2019.12.31-09:00:00","","airlinerCC","planeNum3","On time");
        
        flightschedule.add(flight1);
        flightschedule.add(flight2);
        flightschedule.add(flight3);
        filterflightschedule.add(flight1);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Wrong Date format");
        }
    }

    public List<Flight> getFlightschedule() {
        return flightschedule;
    }

    public void setFlightschedule(List<Flight> flightschedule) {
        this.flightschedule = flightschedule;
    }

    public Flight addFlight(){
        Flight flight = new Flight();
        flightschedule.add(flight);
        return flight;
    }
    
    public Flight addFlight(Flight F){
        
        flightschedule.add(F);
        return F;
    }
    
    public void cancelFlight(Flight f)
    {
        flightschedule.remove(f);
    }

    public void addFilterflight(String flightNum,String airplaneNum,String arrivalLoc,String departLoc,String timePeriod,String tripType,
           String arrivalDate,String deptDate,String returnDate,String airliner,String planeNum,String status) {
        Flight f=new Flight(flightNum,airplaneNum,arrivalLoc,departLoc,timePeriod,tripType,arrivalDate,deptDate,
                returnDate,airliner,planeNum,status);
        filterflightschedule.add(f);
        
    }
    
    public void cancelFilterflight(Flight f){
        
        filterflightschedule.remove(f);
            
    }

    public void setFilterflightschedule(List<Flight> filterflightschedule) {
        this.filterflightschedule = filterflightschedule;
    }

    public List<Flight> getFilterflightschedule() {
        return filterflightschedule;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yizhe
 */
public class AirplaneFleet {
    
    private List<Airplane> airplanefleet;
    
    public AirplaneFleet(){
        airplanefleet=new ArrayList<>();
        Airplane airplane=new Airplane("AA001",2019,"SC","Large Plane","available");
        airplanefleet.add(airplane);
    }

    public List<Airplane> getAirplanefleet() {
        return airplanefleet;
    }

    public void setAirplanefleet(List<Airplane> airplanefleet) {
        this.airplanefleet = airplanefleet;
    }
    
    public Airplane addAirplane() {
        Airplane airplane = new Airplane();
        airplanefleet.add(airplane);
        return airplane;
    }

    public void deleteAirplane(Airplane airplane) {
       airplanefleet.remove(airplane);
    }
    
    public List<Airplane> getPlaneNum(String planeNum) {
    List<Airplane> airplanefleetplus=new ArrayList<>();
        for(Airplane airplane:airplanefleet){
            if(airplane.getPlaneNum().equals(planeNum)){
                airplanefleetplus.add(airplane);
            }
        }
        return airplanefleetplus;
    }
    
}

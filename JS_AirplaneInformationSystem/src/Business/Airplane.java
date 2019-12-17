/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author yizhe
 */
public class Airplane {
    private String planeNum;
    private int airplaneYear;
    private String airliner;
    private String planeType;
    private String planeStatus;

    public Airplane(String planeNum,int airplaneYear,String airliner,String planeType,String planeStatus){
        this.planeNum=planeNum;
        this.airplaneYear=airplaneYear;
        this.airliner=airliner;
        this.planeType=planeType;
        this.planeStatus=planeStatus;
    }
    
    public Airplane(){
        
    }
    
    public String getPlaneNum() {
        return planeNum;
    }

    public void setPlaneNum(String planeNum) {
        this.planeNum = planeNum;
    }


 
    public int getAirplaneYear() {
        return airplaneYear;
    }

    public void setAirplaneYear(int airplaneYear) {
        this.airplaneYear = airplaneYear;
    }

    public String getAirliner() {
        return airliner;
    }

    public void setAirliner(String airliner) {
        this.airliner = airliner;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public String getPlaneStatus() {
        return planeStatus;
    }

    public void setPlaneStatus(String planeStatus) {
        this.planeStatus = planeStatus;
    }
    
    public String toString(){
        return getAirliner();
    }
    
    
}

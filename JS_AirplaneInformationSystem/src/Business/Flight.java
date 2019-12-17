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
public class Flight {
    
    private String flightNum;
    private String airplaneNum;
    private String arrivalLoc;
    private String departLoc;
    private String timePeriod;
    private String tripType;
    private String arrivalDate;
    private String deptDate;
    private String returnDate;
    private String airliner;
    private String[][] seat;
    private String status;
    
    

    public Flight(){
        String[][] a=new String[25][6];
        for(int i=0;i<25;i++){
            for(int j=0;j<6;j++){
                a[i][j]="1";
            }
        }
        this.seat=a;
    }
    
    public Flight(String flightNum,String airplaneNum,String arrivalLoc,String departLoc,String timePeriod,String tripType,
           String arrivalDate,String deptDate,String returnDate,String airliner,String planeNum,String status){
        this.airliner=airliner;
        this.arrivalDate=arrivalDate;
        this.arrivalLoc=arrivalLoc;
        this.deptDate=deptDate;
        this.departLoc=departLoc;
        this.airplaneNum=airplaneNum;
        this.flightNum  =flightNum;
        this.timePeriod=timePeriod;
        this.tripType=tripType;
        this.returnDate=returnDate;
        this.status=status;
        
        String[][] a=new String[25][6];
        for(int i=0;i<25;i++){
            for(int j=0;j<6;j++){
                a[i][j]="1";
            }
        }
        this.seat=a;
    }

    public String getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(String flightNum) {
        this.flightNum = flightNum;
    }

    public String getAirplaneNum() {
        return airplaneNum;
    }

    public void setAirplaneNum(String airplaneNum) {
        this.airplaneNum = airplaneNum;
    }

    public String getArrivalLoc() {
        return arrivalLoc;
    }

    public void setArrivalLoc(String arrivalLoc) {
        this.arrivalLoc = arrivalLoc;
    }

    public String getDepartLoc() {
        return departLoc;
    }

    public void setDepartLoc(String departLoc) {
        this.departLoc = departLoc;
    }

    public String getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(String timePeriod) {
        this.timePeriod = timePeriod;
    }

    public String getTripType() {
        return tripType;
    }

    public void setTripType(String tripType) {
        this.tripType = tripType;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getDeptDate() {
        return deptDate;
    }

    public void setDeptDate(String deptDate) {
        this.deptDate = deptDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getAirliner() {
        return airliner;
    }

    public void setAirliner(String airliner) {
        this.airliner = airliner;
    }
    
    @Override
    public String toString(){
        return getAirliner();
    }

    public String[][] getSeat() {
        return seat;
    }

    public void setSeat(int row,int column) {
        seat[row][column]="0";
    }
    
    public String getDeptDateMD(){
        return String.valueOf(deptDate.charAt(5))+String.valueOf(deptDate.charAt(6))+String.valueOf(deptDate.charAt(8))+String.valueOf(deptDate.charAt(9));
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
    
    
}

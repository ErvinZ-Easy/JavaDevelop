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
public class Car {
    private boolean availCar;
    private String manufacturer;
    private int manufactureYear;
    private int seats;
    private int serialNo;
    private int modelNo;
    private String catalogTime;
    private String city;
    private boolean maintenanceCertificate;

    

    public Car(boolean availCar,String manufacturer,int manufactureYear,int seats,int serialNo,int modelNo,String catalogTime,String city,boolean maintenanceCertificate){
        this.availCar = availCar;
        this.manufacturer = manufacturer;
        this.manufactureYear = manufactureYear;
        this.seats = seats;
        this.serialNo = serialNo;
        this.modelNo = modelNo;
        this.catalogTime = catalogTime;
        this.city = city;
        this.maintenanceCertificate = maintenanceCertificate;
    }

    public Car() {
        
    }

    public boolean isAvailCar() {
        return availCar;
    }

    public void setAvailCar(boolean availCar) {
        this.availCar = availCar;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    
    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }
    
    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public int getModelNo() {
        return modelNo;
    }

    public void setModelNo(int modelNo) {
        this.modelNo = modelNo;
    }

    public String getCatalogTime() {
         return catalogTime;
    }
    
    public void setCatalogTime(String catalogTime) {
        this.catalogTime = catalogTime;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isMaintenanceCertificate() {
        return maintenanceCertificate;
    }

    public void setMaintenanceCertificate(boolean maintenanceCertificate) {
        this.maintenanceCertificate = maintenanceCertificate;
    }
    
    @Override
    public String toString(){
        return this.city;
    }    
    
}

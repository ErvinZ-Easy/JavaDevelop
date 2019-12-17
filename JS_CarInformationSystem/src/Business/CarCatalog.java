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
public class CarCatalog {
    private ArrayList<Car> carcatalog;
    
    public CarCatalog(){
        this.carcatalog=new ArrayList<Car>(); 
        
        Car car1 = new Car(true, "Ferrari", 2019, 2,100, 999,"2019/9/29", "Boston", true);
        Car car2 = new Car(false, "BMW", 2019, 3,200,111, "2019/9/28", "New York", true);
        Car car3 = new Car(true, "Toyota", 2018, 4,300, 222, "2019/9/27", "Boston", true);
        Car car4 = new Car(false, "GM", 2018, 5,400, 333, "2019/9/26", "New York", true);
        Car car5 = new Car(true, "Toyota", 2017, 2,500, 444, "2019/9/25", "Chicago", true);
        Car car6 = new Car(true, "GM", 2017, 3,600, 555, "2019/9/24", "Chicago", false);
        Car car7 = new Car(true, "Ferrari", 2016, 4,700, 999, "2019/9/23", "Seattle", true);
        Car car8 = new Car(true, "BMW", 2016, 5,800, 666, "2019/9/22", "Seattle", false);
        Car car9 = new Car(true, "Toyota", 2019, 2,900, 222, "2019/9/21", "Austin", true);
        Car car10 = new Car(true, "GM", 2019, 3,1000,777, "2019/9/20", "Austin", true);
        
        carcatalog.add(car1);
        carcatalog.add(car2);
        carcatalog.add(car3);
        carcatalog.add(car4);
        carcatalog.add(car5);
        carcatalog.add(car6);
        carcatalog.add(car7);
        carcatalog.add(car8);
        carcatalog.add(car9);
        carcatalog.add(car10);
    }

    public int getCarCatalogSize(){
        return carcatalog.size();
    }
    
    public ArrayList<Car> getCarCatalog() {
        return carcatalog;
    }

    public void setCarCatalog(ArrayList<Car> carcatalog) {
        this.carcatalog = carcatalog;
    }
    
    public Car addCar(){
        Car car =new Car();
        carcatalog.add(car);
        return car;
    }
    
    public void DeleteCar(Car car){
        carcatalog.remove(car);
    }
    
    public List<Car> getAvailCityList(String city){
        List<Car> aclist=new ArrayList<>();
        for(Car car:carcatalog)
        {
            if(  (car.getCity().equals(city))  &&  (car.isAvailCar()!=false)  ) 
                aclist.add(car);
            
        }
        return aclist;
    }
    
   public List<Car> getSeats(int max,int min){
        List<Car> abnList=new ArrayList<>();
        for(Car car:carcatalog){
            if(car.getSeats()<=max && car.getSeats()>=min){
                abnList.add(car);
            }
        }
        return abnList;
    }
   
   public List<Car> getSerialNo(int no){
       List<Car> abnList=new ArrayList<>();
        for(Car car:carcatalog){
            if(car.getSerialNo()==no){
                abnList.add(car);
            }
        }
        return abnList;
   }
   
   public List<Car> getMaintenanceCertificate(boolean e){
       List<Car> abnList=new ArrayList<>();
        for(Car car:carcatalog){
            if(car.isMaintenanceCertificate()==e){
                abnList.add(car);
            }
        }
        return abnList;
   }
   
   public List<Car> getManufacturer(String m){
       List<Car> abnList=new ArrayList<>();
        for(Car car:carcatalog){
            if(car.getManufacturer().equals(m)){
                abnList.add(car);
            }
        }
        return abnList;
   }
   
   public List<Car> getManufactureYear(int y){
       List<Car> abnList=new ArrayList<>();
        for(Car car:carcatalog){
            if(car.getManufactureYear()==y){
                abnList.add(car);
            }
        }
        return abnList;
   }
   
   public List<Car> getModelNo(int mn){
       List<Car> abnList=new ArrayList<>();
        for(Car car:carcatalog){
            if(car.getModelNo()==mn){
                abnList.add(car);
            }
        }
        return abnList;
   }
}

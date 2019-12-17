/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import Business.Traveloffice;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Administrator
 */
public class TravelofficeDirectory {

    public List<Traveloffice> getTravelofficedirectory() {
        return travelofficedirectory;
    }

    public void setTravelofficedirectory(List<Traveloffice> travelofficedirectory) {
        this.travelofficedirectory = travelofficedirectory;
    }
    private List<Traveloffice> travelofficedirectory;
    public TravelofficeDirectory(Traveloffice f)
    {
        travelofficedirectory=new ArrayList<>();
    }
    public TravelofficeDirectory(){
       
     travelofficedirectory=new ArrayList<>();
     Traveloffice f1=new Traveloffice("001","MAoffice","MA");
     Traveloffice f2=new Traveloffice("002","CAoffice","CA");
     travelofficedirectory.add(f1);
     travelofficedirectory.add(f2);
     }
    public Traveloffice addoffice()
    { 
        Traveloffice to = new Traveloffice();
        travelofficedirectory.add(to);
        return to;
    
    }
       public Traveloffice addoffice(Traveloffice to)
    { 
        
        travelofficedirectory.add(to);
        return to;
    
    }
    public void deletetraveloffice(Traveloffice T)
    {
    travelofficedirectory.remove(T);
    
    }
    
    
}
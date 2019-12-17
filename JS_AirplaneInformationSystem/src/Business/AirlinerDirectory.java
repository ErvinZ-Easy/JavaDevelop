/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Abstract.User;
import Business.Users.Airliner;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yizhe
 */
public class AirlinerDirectory {
    
    private List<User> airlinerdirectory;
    
    public AirlinerDirectory(){
        airlinerdirectory=new ArrayList<>();
        Airliner airliner=new Airliner("airliner.1","airliner.1","AAAA");
        airlinerdirectory.add(airliner);
    }

    public List<User> getAirlinerdirectory() {
        return airlinerdirectory;
    }

    public void setAirlinerdirectory(List<User> airlinerdirectory) {
        this.airlinerdirectory = airlinerdirectory;
    }
    
    public Airliner addAirlinerDirectory(){
        Airliner a =new Airliner("","","");
        airlinerdirectory.add(a);
        return a;
    }
    
    public void deleteAirliner(Airliner a)
    {
        airlinerdirectory.remove(a);
    }
    
    public void addAirliner(Airliner a)
    {
        airlinerdirectory.add(a);
    }
}

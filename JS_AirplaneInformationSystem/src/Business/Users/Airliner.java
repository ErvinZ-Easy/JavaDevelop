/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Users;

import Business.Abstract.User;

/**
 *
 * @author yizhe
 */
public class Airliner extends User implements Comparable<Airliner>{
    private String grade;
    public Airliner(String password, String userName,String grade) {
        super(password, userName, "Airliner");
        this.grade=grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    
    
    
    public boolean verify(String password){
        if(password.equals(getPassword()))
            return true;
        return false;
    }
    
    @Override
    public String toString() {
        return getUserName(); 
    }
    
    @Override
    public int compareTo(Airliner o) {
        return o.getUserName().compareTo(this.getUserName());
    }
    
}

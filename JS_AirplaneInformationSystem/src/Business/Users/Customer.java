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
public class Customer extends User implements Comparable<Customer>{
    
    
    public Customer(String password, String userName) {
        super(password, userName, "Customer");
        
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
    public int compareTo(Customer o) {
        return o.getUserName().compareTo(this.getUserName());
    }
}

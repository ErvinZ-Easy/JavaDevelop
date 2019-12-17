/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Abstract.User;
import Business.Users.Customer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yizhe
 */
public class CustomerDirectory {
    
    private List<User> customerdirectory;
    
    public CustomerDirectory(){
        customerdirectory=new ArrayList<>();
        Customer customer=new Customer("customer.1","customer.1");
        customerdirectory.add(customer);
    }

    public List<User> getCustomerdirectory() {
        return customerdirectory;
    }

    public void setCustomerdirectory(List<User> customerdirectory) {
        this.customerdirectory = customerdirectory;
    }
    
    
}

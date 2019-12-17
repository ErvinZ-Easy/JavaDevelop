package Business;

import Business.People.People;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author EZ
 */
public class ConfigureHIS {
    
    public static HIS configure(){
        
        HIS system = HIS.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        People people = system.getPeopleDirectory().createPeople("SA");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("SA", "SA", people, new SystemAdminRole());
        
        return system;
    }
    
}

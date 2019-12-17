package Business.Users;

import Business.Abstract.User;
import Business.AirlinerDirectory;
import Business.CustomerDirectory;

/**
 *
 * @author yizhe
 */
public class TravelAgency extends User{
private CustomerDirectory customerDir;
private AirlinerDirectory airlinerDir;
    public TravelAgency() {
        super("", "", "TravelAgency");
        customerDir=new CustomerDirectory();
        airlinerDir=new AirlinerDirectory();
    }

    public CustomerDirectory getCustomerDir() {
        return customerDir;
    }

    public void setCustomerDir(CustomerDirectory customerDir) {
        this.customerDir = customerDir;
    }

    public AirlinerDirectory getAirlinerDir() {
        return airlinerDir;
    }

    public void setAirlinerDir(AirlinerDirectory airlinerDir) {
        this.airlinerDir = airlinerDir;
    }

    public boolean verify(String password) {
        return true;
    }
    
    @Override
    public String toString() {
        return getUserName(); 
    }
    
}



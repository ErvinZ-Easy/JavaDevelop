package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author EZ
 */
public class Hospitals extends Enterprise {
    
    public Hospitals(String name){
        super(name,EnterpriseType.Hospitals);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}

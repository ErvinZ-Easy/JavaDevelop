package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author EZ
 */
public class MedicalInsurance extends Enterprise {
    
    public MedicalInsurance(String name){
        super(name,EnterpriseType.MedicalInsurance);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}

package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author EZ
 */
public class PharmacySupplier extends Enterprise {
    
    public PharmacySupplier(String name){
        super(name,EnterpriseType.PharmacySupplier);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}

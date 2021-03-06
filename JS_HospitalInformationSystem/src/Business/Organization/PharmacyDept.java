package Business.Organization;

import Business.Role.PharmacistRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author EZ
 */
public class PharmacyDept extends Organization{

    public PharmacyDept(String name) {
        super(name,Organization.OrganizationType.Pharmacist);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PharmacistRole());
        return roles;
    }
     
   
    
    
}

package Business.Organization;

import Business.Role.DoctorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author EZ
 */
public class ClinicalDept extends Organization{

    public ClinicalDept(String name) {
        super(name,Organization.OrganizationType.Doctor);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DoctorRole());
        return roles;
    }
     
   
    
    
}

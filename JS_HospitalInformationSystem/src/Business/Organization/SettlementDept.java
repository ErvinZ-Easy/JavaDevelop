package Business.Organization;

import Business.Role.MIpersonnelRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author EZ
 */
public class SettlementDept extends Organization{

    public SettlementDept(String name) {
        super(name,Organization.OrganizationType.MIpersonnel);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new MIpersonnelRole());
        return roles;
    }
     
   
    
    
}

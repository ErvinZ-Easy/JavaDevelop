package Business.Organization;

import Business.Role.AccountantRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author EZ
 */
public class FinancialDept extends Organization{

    public FinancialDept(String name) {
        super(name,Organization.OrganizationType.Accountant);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AccountantRole());
        return roles;
    }
     
   
    
    
}

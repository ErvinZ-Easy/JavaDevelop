package Business.Organization;

import Business.Role.Role;
import Business.Role.SalesmanRole;
import java.util.ArrayList;

/**
 *
 * @author EZ
 */
public class SalesDept extends Organization{

    public SalesDept(String name) {
        super(name,Organization.OrganizationType.Salesman);

    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SalesmanRole());
        return roles;
    }
     
}

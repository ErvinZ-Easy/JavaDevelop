package Business.Organization;

import Business.Role.Role;
import Business.Role.WarehousemanRole;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class Warehouse extends Organization{

    public Warehouse(String name) {
        super(name,Organization.OrganizationType.Warehouseman);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new WarehousemanRole());
        return roles;
    }
     
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;
import Business.Role.PatientRole;
import Business.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author cheny
 */

public class PatientDept extends Organization{

    public PatientDept(String name) {
        super(name,Organization.OrganizationType.Patient);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PatientRole());
        return roles;
    }
     
   
    
    
}
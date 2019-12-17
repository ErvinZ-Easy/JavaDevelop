package Business.Network;

import Business.Enterprise.EnterpriseDirectory;
import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author EZ
 */
public class Network extends Organization{
//    private String name;
    private EnterpriseDirectory enterpriseDirectory;
    
    public Network(String name){
        super(name);
//        this.name=name;
        enterpriseDirectory=new EnterpriseDirectory();
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }
    
    
//    @Override
//    public String toString(){
//        return name;
//    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}

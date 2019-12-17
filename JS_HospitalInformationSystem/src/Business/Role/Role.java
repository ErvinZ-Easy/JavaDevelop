package Business.Role;

import Business.HIS;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author EZ
 */
public abstract class Role {
    
    public enum RoleType{
        SystemAdmin("SystemAdmin"),PSAdmin("PSAdmin"),Salesman("Salesman"), Warehouseman("Warehouseman"), 
        HAdmin("HAdmin"),Doctor("Doctor"), Accountant("Accountant"), Pharmacist("Pharacist"), 
        MIAdmin("MIAdmin"),MIpersonnel("MIpersonnel"),
        Patient("Patient");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            Network network,
            HIS business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}
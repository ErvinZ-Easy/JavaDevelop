package Business.Role;

import Business.HIS;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.HAdminWorkArea.HAdminWorkAreaJPanel;

/**
 *
 * @author EZ
 */
public class HAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,Network network, HIS system) {
        return new HAdminWorkAreaJPanel(userProcessContainer, enterprise,system);
    }
    
    public String toString(){
        return "HAdmin";
    }
}

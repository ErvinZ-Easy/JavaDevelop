package Business.Role;

import Business.HIS;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.HAdminWorkArea.HAdminWorkAreaJPanel;
import userinterface.MIAdminWorkArea.MIAdminWorkAreaJPanel;

/**
 *
 * @author EZ
 */
public class MIAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,Network network, HIS system) {
        return new MIAdminWorkAreaJPanel(userProcessContainer, enterprise);
    }
    
    public String toString(){
        return "MIAdmin";
    }
    
}

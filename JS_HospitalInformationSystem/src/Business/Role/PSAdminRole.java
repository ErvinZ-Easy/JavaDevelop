package Business.Role;

import Business.HIS;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.PSAdminWorkArea.PSAdminWorkAreaJPanel;

/**
 *
 * @author EZ
 */
public class PSAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,Network network, HIS system) {
        return new PSAdminWorkAreaJPanel(userProcessContainer, enterprise);
    }
    
}

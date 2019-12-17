package Business.Role;

import Business.HIS;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.NetworkAdminWorkArea.NetworkAdminWorkAreaJPanel;

/**
 *
 * @author EZ
 */
public class NetworkAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,Network network, HIS system) {
        return new NetworkAdminWorkAreaJPanel(userProcessContainer,network,system);
    }
    
}

package Business.Role;

import Business.HIS;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.AccountantWorkArea.AccountantWorkAreaJPanel;

/**
 *
 * @author EZ
 */
public class AccountantRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,Network network, HIS business) {
        return new AccountantWorkAreaJPanel(userProcessContainer,enterprise,account,business,network,organization);
    }

    @Override
    public String toString(){
        return "Accountant";
    }
    
}

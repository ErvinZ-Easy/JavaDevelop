package Business.Role;

import Business.HIS;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.MIpersonnelWorkArea.MIpersonnelWorkAreaJPanel;

/**
 *
 * @author EZ
 */
public class MIpersonnelRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,Network network, HIS business) {
        return new MIpersonnelWorkAreaJPanel(userProcessContainer,organization,enterprise,account,business);
    }

       public String toString(){
        return "MIpersonnel";
    }
    
}

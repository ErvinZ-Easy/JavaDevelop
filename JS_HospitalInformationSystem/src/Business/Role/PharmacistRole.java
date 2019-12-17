package Business.Role;

import Business.HIS;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.PharmacistWorkArea.PharmacistWorkAreaJPanel;

/**
 *
 * @author EZ
 */
public class PharmacistRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,Network network, HIS business) {
        return new PharmacistWorkAreaJPanel(userProcessContainer,organization,enterprise,account,business);
    }

    @Override
    public String toString(){
        return "Pharmacist";
    }
    
}

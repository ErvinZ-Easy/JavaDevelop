package Business.Role;

import Business.HIS;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.DoctorWorkArea.DoctorWorkAreaJPanel;

/**
 *
 * @author EZ
 */
public class DoctorRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,Network network, HIS business) {
        return new DoctorWorkAreaJPanel(userProcessContainer, enterprise,organization,account,business);
    }

    @Override
    public String toString(){
        return "Doctor";
    }
    
}

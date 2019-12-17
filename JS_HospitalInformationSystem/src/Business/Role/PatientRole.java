package Business.Role;

import Business.HIS;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.PatientWorkArea.PatientWorkAreaJPanel;

/**
 *
 * @author EZ
 */
public class PatientRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,Network network, HIS business) {
       return new PatientWorkAreaJPanel(userProcessContainer,organization,enterprise,account,business);
    }
    public String toString(){
        return "Patient";
    }
    
    
}

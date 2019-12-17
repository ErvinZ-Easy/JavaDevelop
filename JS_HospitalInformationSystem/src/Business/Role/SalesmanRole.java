package Business.Role;

import Business.HIS;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.SalesmanWorkArea.SalesmanWorkAreaJPanel;

/**
 *
 * @author EZ
 */
public class SalesmanRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,Network network, HIS business) {
        return new SalesmanWorkAreaJPanel(userProcessContainer, enterprise,account,organization,network,business);
    }

    @Override
    public String toString(){
        return "Salesman";
    }
    
}

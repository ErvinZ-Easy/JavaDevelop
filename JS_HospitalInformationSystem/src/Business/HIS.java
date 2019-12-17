package Business;

import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author EZ
 */
public class HIS extends Organization{
    
    private static HIS business;
    private ArrayList<Network> networkList;
    public static HIS getInstance(){
        if(business==null){
            business=new HIS();
        }
        return business;
    }
    
    public Network createAndAddNetwork(String name){
        Network network=new Network(name);
        networkList.add(network);
        
        return network;
    }
    
    public void removeNetwork(Network nw){
        networkList.remove(nw);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private HIS(){
        super(null);
        networkList=new ArrayList<Network>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Network network:networkList){
            
        }
        return true;
    }
}

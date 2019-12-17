package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author EZ
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.PharmacySupplier){
            enterprise=new PharmacySupplier(name);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.Hospitals){
            enterprise=new Hospitals(name);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.MedicalInsurance){
            enterprise=new MedicalInsurance(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
    
    public void deleteEnterprise(Enterprise e){
        enterpriseList.remove(e);
    }
}

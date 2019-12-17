package Business.Organization;

import Business.Enterprise.Enterprise;
import Business.HIS;
import Business.Network.Network;
import java.util.ArrayList;

/**
 *
 * @author EZ
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public void deleteOrganization(Organization org){
        organizationList.remove(org);
    }
    
    public Organization createOrganization(Organization.OrganizationType type,String name){
        Organization organization = null;
        if (type==Organization.OrganizationType.Salesman){
            organization = new SalesDept(name);
            
            organizationList.add(organization);
        }
        else if (type==Organization.OrganizationType.Warehouseman){
            organization = new Warehouse(name);
            
            organizationList.add(organization);
        }
        else if (type==Organization.OrganizationType.Doctor){
            organization = new ClinicalDept(name);
            
            organizationList.add(organization);
        }
        else if (type==Organization.OrganizationType.Accountant){
            organization = new FinancialDept(name);
            
            organizationList.add(organization);
        }
        else if (type==Organization.OrganizationType.Pharmacist){
            organization = new PharmacyDept(name);
            
            organizationList.add(organization);
        }
        else if (type==Organization.OrganizationType.MIpersonnel){
            organization = new SettlementDept(name);
            
            organizationList.add(organization);
        }
        else if (type==Organization.OrganizationType.Patient){
            organization = new PatientDept(name);
            
            organizationList.add(organization);
        }
        return organization;
    }
    
    
}
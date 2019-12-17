package Business.Organization;

import Business.Clinical.ClinicalRecordDirectory;
import Business.People.PeopleDirectory;
import Business.Reservation.reservationtimedirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import Business.Patientaskmedicine.askformedicinedirectory;
import Business.ReturnReceipt.MedicineReceiptDirectory;
import Business.Storage.StorageDirectory;
import java.util.ArrayList;

/**
 *
 * @author EZ
 */
public abstract class Organization {
    private String name;
    private WorkQueue workQueue;
    private PeopleDirectory peopleDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private reservationtimedirectory rtd;
    private ClinicalRecordDirectory crd;
    private askformedicinedirectory afd;
    private MedicineReceiptDirectory mrd;
    StorageDirectory storageDir;
    
    
    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Organization.counter = counter;
    }

    public OrganizationType getOrgType() {
        return OrgType;
    }

    public void setOrgType(OrganizationType OrgType) {
        this.OrgType = OrgType;
    }
    private static int counter=0;
    OrganizationType OrgType;
    
    public enum OrganizationType{
        Salesman("SalesDept"), Warehouseman("Warehouse"), 
        Doctor("ClinicalDept"), Accountant("FinancialDept"), Pharmacist("PharmacyDept"), 
        MIpersonnel("SettlementDept"),Patient("PatientDept");
        
        private String value;
        private OrganizationType(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
        }
    }
    
    public OrganizationType getOrganizationType() {
        return OrgType;
    }
    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        peopleDirectory = new PeopleDirectory();
        userAccountDirectory = new UserAccountDirectory();
        rtd=new reservationtimedirectory();
        crd=new ClinicalRecordDirectory();
        afd=new askformedicinedirectory();
        mrd=new MedicineReceiptDirectory();
        storageDir=new StorageDirectory();
        organizationID = counter;
        ++counter;
    }
    
    public Organization(String name,Organization.OrganizationType type) {
        this.OrgType=type;
        this.name = name;
        workQueue = new WorkQueue();
        peopleDirectory = new PeopleDirectory();
        userAccountDirectory = new UserAccountDirectory();
        rtd=new reservationtimedirectory();
        crd=new ClinicalRecordDirectory();
        afd=new askformedicinedirectory();
        mrd=new MedicineReceiptDirectory();
        storageDir=new StorageDirectory();
        organizationID = counter;
        ++counter;
    }
    
    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public PeopleDirectory getPeopleDirectory() {
        return peopleDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }

    public reservationtimedirectory getRtd() {
        return rtd;
    }

    public void setRtd(reservationtimedirectory rtd) {
        this.rtd = rtd;
    }

    public ClinicalRecordDirectory getCrd() {
        return crd;
    }

    public void setCrd(ClinicalRecordDirectory crd) {
        this.crd = crd;
    }
    
    public askformedicinedirectory getAfd() {
        return afd;
    }

    public void setAfd(askformedicinedirectory afd) {
        this.afd = afd;
    }

    public MedicineReceiptDirectory getMrd() {
        return mrd;
    }

    public void setMrd(MedicineReceiptDirectory mrd) {
        this.mrd = mrd;
    }

    public StorageDirectory getStorageDir() {
        return storageDir;
    }

    public void setStorageDir(StorageDirectory storageDir) {
        this.storageDir = storageDir;
    }
    
    
}

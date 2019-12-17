/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


/**
 *
 * @author Administrator
 */
import java.util.Date;
public class Traveloffice {
   private String officeNum;
   private String officeName;
   private String officeLocation;
   private Date setuptime;
    public Traveloffice()
    {}
    public Traveloffice(String officeNum,String officeName, String officeLocation)
    {
      this.officeNum=officeNum;
      this.officeName=officeName;
      this.officeLocation=officeLocation;
      
    }

  
    public String getOfficeLocation() {
        return officeLocation;
    }

    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }

    public Date getSetuptime() {
        Date d=new Date();
        return d;
    }

    public void setSetuptime(Date setuptime) {
        this.setuptime = setuptime;
    }
  
    public String getOfficeNum() {
        return officeNum;
    }

    public void setOfficeNum(String officeNum) {
        this.officeNum = officeNum;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }
    
    public String toString(){
        return getOfficeNum();
    }
    
     
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Clinical.ClinicalRecord;
import Business.Patientaskmedicine.askformedicine;

/**
 *
 * @author cheny
 */
public class askmedicineWorkRequest extends WorkRequest {
    private askformedicine clinicalrecord;

    public askformedicine getaskformedicinerecord() {
        return clinicalrecord;
    }
    
    public void setaskformedicinerecord(askformedicine clinicalrecord) {
        this.clinicalrecord = clinicalrecord;
    }
}

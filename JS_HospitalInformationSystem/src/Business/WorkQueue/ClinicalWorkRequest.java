/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Clinical.ClinicalRecord;

/**
 *
 * @author yizhe
 */
public class ClinicalWorkRequest extends WorkRequest{
    
    private ClinicalRecord clinicalrecord;

    public ClinicalRecord getClinicalrecord() {
        return clinicalrecord;
    }
    
    public void setClinicalrecord(ClinicalRecord clinicalrecord) {
        this.clinicalrecord = clinicalrecord;
    }
    
}

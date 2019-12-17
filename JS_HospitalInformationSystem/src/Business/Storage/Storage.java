/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Storage;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author cheny
 */
public class Storage {
    
    private Map <String, Integer> m ;

    public Storage() {
        m=new HashMap<String, Integer>();
    }

    public Map<String, Integer> getM() {
        return m;
    }

    public void setM(Map<String, Integer> m) {
        this.m = m;
    }
    
}

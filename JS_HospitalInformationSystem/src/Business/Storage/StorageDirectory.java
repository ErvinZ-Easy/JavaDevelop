/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Storage;

import Business.Medicine.Medicine;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author cheny
 */
public class StorageDirectory {
    
    HashMap<String,Integer> storageDirectory;
 

    public StorageDirectory() {
        storageDirectory=new HashMap();
    }

    public HashMap<String, Integer> getStorageDirectory() {
        return storageDirectory;
    }

    public void setStorageDirectory(HashMap<String, Integer> storageDirectory) {
        this.storageDirectory = storageDirectory;
    }

    public void addStorage(String name,int quantity){
        if(storageDirectory.get(name)!=null){
        storageDirectory.put(name, quantity+storageDirectory.get(name));
        }else{
        storageDirectory.put(name, quantity);
        }
    }
}

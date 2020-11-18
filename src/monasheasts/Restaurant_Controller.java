/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monasheasts;

import monasheasts.entities.RestuarantEntity;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import static monasheasts.Owner_Controller.isValid;

/**
 *
 * @author prana
 */
public class Restaurant_Controller {
      private ArrayList<RestuarantEntity> restEntity;
    
    public Restaurant_Controller(){
       restEntity = new ArrayList<>();
    }
     public void registerRestaurant(String[] cust)
    {
        // Adding new customer object to the list
        int count = Integer.parseInt(cust[1]);
        int phone = 0;
       
        restEntity.add(new RestuarantEntity(1,count,cust[2],cust[3],0.0f,phone));
    }
     
     public String writeRestuarantRegistrationValues(String name,String address, String phone)
 {
     
         String ErrorMsg = "Restuarant created successfully.";
     
     if((!name.isEmpty()) && (!address.isEmpty()) && (!phone.isEmpty())) {
             
       
            
                try{
                       String rating ="" ;
                      int count = getCount() + 1;
                       String rest_data[] = new String[6];
                        rest_data[0] = getOwnerId();
                        rest_data[1] =String.valueOf(count);
                        rest_data[2] =name;
                        rest_data[3] =address;
                        rest_data[4] =rating;
                        rest_data[5] =phone;
                     
                        
                        
                        registerRestaurant(rest_data);
                       
                         for(RestuarantEntity o : restEntity)
                            {
                                FileWriter writer = new FileWriter(".//src//monasheasts//restuarant_data.txt", true);
                                writer.write(o.getOwnerId()+","+o.getRestId()+","+o.getRestName()+","+o.getRestSuburb()+","+o.getRestRating()+","+o.getRestPhoneNo()+"\n");
      
                                writer.close(); 
                             
                            }
                     
                  
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
   
        }
     else 
         ErrorMsg = "Mandatory fields cannot be empty!";

     return ErrorMsg;
      
 }
     public int getCount(){
    
    int count = 0;
    try {
        FileReader reader = new FileReader(".//src//monasheasts//restuarant_data.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
             count = count + 1;
             System.out.println(line);
            }  
        
    }
    catch(Exception e){
         e.printStackTrace();
    }
    return count;
    
}
     
     public String getOwnerId(){
         
         String id = ""; 
         try {
        FileReader reader = new FileReader(".//src//monasheasts//ownerId.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
           id = line;
            }  
        
    }
    catch(Exception e){
         e.printStackTrace();
    }
    return id;
         
     }
}

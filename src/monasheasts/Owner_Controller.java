/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monasheasts;

import monasheasts.entities.OwnerEntity;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author prana
 */
  
public class Owner_Controller {
    
    private ArrayList<OwnerEntity> ownerList;
    
    public Owner_Controller()
    {
        ownerList = new ArrayList<>();
    }
    
    
     public void registerOwner(String[] cust)
    {
        // Adding new customer object to the list
        int count = Integer.parseInt(cust[0]);
        ownerList.add(new OwnerEntity(count,cust[1],cust[2],cust[3],cust[4],cust[5],cust[6]));
    }
     
      public String writeOwnerRegistrationValues(String firstname,String lastname, String address, String password,String confirmPassword,String emailId, String phone)
 {
     
         String ErrorMsg = "Account created successfully.";
     
     if((!firstname.isEmpty()) && (!emailId.isEmpty()) && (!confirmPassword.isEmpty())&& (!password.isEmpty())) {
             
       
         if (confirmPassword.equals(password))
          {
           
            if (isValid(emailId)){
            
                try{
                   if(!validateExistingOwnerEmail(emailId)&& !validateExistingUserEmail(emailId)) {
                       
                 
                        
                       int count = getCount() + 1;
                       
                       String owner_data[] = new String[7];
                        owner_data[0] = String.valueOf(count);
                        owner_data[1] =firstname;
                        owner_data[2] =lastname;
                        owner_data[3] =emailId;
                        owner_data[4] =password;
                        owner_data[5] =address;
                        owner_data[6] =phone;
                         
                        
                        
                        registerOwner(owner_data);
                       
                         for(OwnerEntity o : ownerList)
                            {
                                FileWriter writer = new FileWriter(".//src//monasheasts//Owner_Registeration.txt", true);
                                writer.write(o.getOwnerId()+","+o.getFirstName()+","+o.getLastName()+","+o.getEmailId()+","+o.getPassword()+","+o.getAddress()+","+o.getPhone()+"\n");
                                
                                writer.close(); 
                                addCredentialData(o.getEmailId(),o.getPassword());
                            }
                     }
                   else
                       ErrorMsg = "Email Id is already registered";
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else
               ErrorMsg = "Not a Valid Email ID";
            
          }
          else
              ErrorMsg = "Confirm password and password dont match";
            
        }
     else 
         ErrorMsg = "Mandatory fields cannot be empty!";
     
     
    
     
     return ErrorMsg;
      
 }
    
    
public static boolean isValid(String email) {
   String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
   return email.matches(regex);
}  

public int getCount(){
    
    int count = 0;
    try {
        FileReader reader = new FileReader(".//src//monasheasts//Owner_Registeration.txt");
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

public boolean validateExistingOwnerEmail(String email){
    
    boolean flag = false;
    try {
        FileReader reader = new FileReader(".//src//monasheasts//owner_credential.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
             String data[] = line.split(",");
            if(data[0].equals(email)){
                flag = true;
                break;
            }  
        }
    }
    catch(Exception e){
         e.printStackTrace();
    }
    return flag;
}

public boolean validateExistingUserEmail(String email){
    
    boolean flag = false;
    try {
        FileReader reader = new FileReader(".//src//monasheasts//owner_credential.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
             String data[] = line.split(",");
            if(data[0].equals(email)){
                flag = true;
                break;
            }  
        }
    }
    catch(Exception e){
         e.printStackTrace();
    }
    return flag;
}



public void addCredentialData(String email, String password){
    
    try{
      FileWriter writer = new FileWriter(".//src//monasheasts//credential.txt", true);
      writer.write(email+","+password);
      writer.close(); 
    }
     catch(Exception e){
         e.printStackTrace();
    }
}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monasheasts;

import monasheasts.entities.CustomerEntity;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author prana
 */
public class Customer_Controller {
    
    
     private ArrayList<CustomerEntity> customerList;
     
     
     public  Customer_Controller(){
         
         customerList = new ArrayList<>();
     }
     
      public void registerCustomer(String[] cust)
    {
        // Adding new customer object to the list
          int count = Integer.parseInt(cust[0]);
        customerList.add(new CustomerEntity(count,cust[1],cust[2],cust[3],cust[4]));
    }
    
    public String writeCustomerRegistrationValues(String firstname,String address, String password,String confirmPassword,String emailId)
 {
     
         String ErrorMsg = "Account created successfully.";
     
     if((!firstname.isEmpty()) && (!emailId.isEmpty()) && (!confirmPassword.isEmpty())&& (!password.isEmpty())) {
             
         if (confirmPassword.equals(password))
          {
            
            if (isValid(emailId)){
               
                try{
                   if(!validateExistingEmail(emailId)) {
                       
                       int count = getCount() + 1;
                       
                     
                        String customer_data[] = new String[5];
                        customer_data[0] = String.valueOf(count);
                        customer_data[1] =firstname;
                        customer_data[2] =emailId;
                        customer_data[3] =password;
                        customer_data[4] =address;
                        
                       registerCustomer(customer_data);
                       
                         for(CustomerEntity c : customerList)
                            {
                                FileWriter writer = new FileWriter(".//src//monasheasts//userRegistration.txt", true);
                                writer.write(c.getCustId()+","+c.getcustName()+","+c.getEmailId()+","+c.getPassword()+","+c.getCustAddress()+"\n");
                                
                                writer.close(); 
                                addCredentialData(c.getEmailId(),c.getPassword());
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
        FileReader reader = new FileReader(".//src//monasheasts//CUstomer_register.txt");
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

public boolean validateExistingEmail(String email){
    
    boolean flag = false;
    try {
        FileReader reader = new FileReader(".//src//monasheasts//credential.txt");
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

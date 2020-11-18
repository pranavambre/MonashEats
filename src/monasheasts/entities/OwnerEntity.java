/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monasheasts.entities;

/**
 *
 * @author SRI
 */
public class OwnerEntity {
    
    int ownerId;
    String firstname;  
    String lastname;
    String emailId;
    String password;
    String address;
    String phone;
    
    public OwnerEntity(int ownerId, String firstname,String lastname, String emailId, String password,String address, String phone)
    {
        this.ownerId = ownerId;
        this.firstname = firstname;
        this.emailId = emailId;
        this.password = password;
        this.phone = phone;
        this.address = address;
        this.lastname = lastname;
        
    }
    
    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }
    
    public int getOwnerId(){
        return ownerId;
    }
    
    public void setFirstName(String lastname) {
        this.firstname = lastname;
    }
    
    public String getFirstName(){
        return firstname;
    }
    
     public void setLastName(String lastname) {
        this.lastname = lastname;
    }
    
    public String getLastName(){
        return lastname;
    }
    
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    
    public String getEmailId(){
        return emailId;
    }
    
    public void setPassword(String password) {
     this.password = password;
    }
    
    public String getPassword() {
        return password;
    }
    
    public String getAddress(){
     return address;   
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public void setPhone(String phone){
        this.phone = phone;
    }
    
    public String getPhone(){
        return phone;
    
}
}

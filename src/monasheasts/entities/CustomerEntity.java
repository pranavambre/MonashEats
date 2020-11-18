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
public class CustomerEntity {
    int custId;
    String custName;   
    String emailId;
    String password;
    String custAddress;
    
    public CustomerEntity(int custId, String custName,String emailId, String password, String custAddress)
    {
        this.custId = custId;
        this.custName = custName;
        this.emailId = emailId;
        this.password = password;
        this.custAddress = custAddress;
    }
    
    public void setCustId(int custId) {
        this.custId = custId;
    }
    
    public int getCustId(){
        return custId;
    }
    
    public void setCustName(String custName) {
        this.custName = custName;
    }
    
    public String getcustName(){
        return custName;
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
    
    public void setCustAddress(String custAddress) {
     this.custAddress = custAddress;
    }
    
    public String getCustAddress() {
        return custAddress;
    }

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monasheasts;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author prana
 */
public class UserCredentials {
    
    String emailId;
    String password;
    
     
    
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
   
    
}

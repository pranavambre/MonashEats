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
public class RestuarantEntity {
    private int ownerId;
    private int restId;
    private String restName;   
    private String restSuburb;
    private Float restRating;
    private int restPhoneNo;
    private int resMenu;
    
    public RestuarantEntity(){
    }
    
    public RestuarantEntity(int ownerId,int restId, String restName,String restSuburb,Float restRating, int restPhoneNo)
    {
        this.ownerId = ownerId;
        this.restId = restId;
        this.restName = restName;
        this.restSuburb = restSuburb;
        this.restRating = restRating;
        this.restPhoneNo = restPhoneNo;
        
    }
    

//    public RestuarantEntity() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
    public void setResMenu(int menuEntity){
        this.resMenu = menuEntity;
    }
    
    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }
    
    public int getResMenu(){
        return this.resMenu;
    }
    
    public int getOwnerId(){
        return ownerId;
    }
    public void setRestId(int restId) {
        this.restId = restId;
    }
    
    public int getRestId(){
        return restId;
    }
    
    public void setRestName(String restName) {
        this.restName = restName;
    }
    
    public String getRestName(){
        return restName;
    }
    
      
    public void setRestSuburb(String restSuburb) {
        this.restSuburb = restSuburb;
    }
    
    public String getRestSuburb(){
        return restSuburb;
    }
    
    public void setRestRating(Float restRating) {
        this.restRating = restRating;
    }
    
    public Float getRestRating(){
        return restRating;
    }
    
    public void setRestPhoneNo(int restPhoneNo) {
        this.restPhoneNo = restPhoneNo;
    }
    
    public int getRestPhoneNo(){
        return restPhoneNo;
    }
}
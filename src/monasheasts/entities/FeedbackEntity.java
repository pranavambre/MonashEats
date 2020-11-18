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
public class FeedbackEntity {
    int feedbackId;
    int restId;
    int custId;
    Float rateFood;
    Float rateRest;
    String comments;   
    Boolean rateDelivery;

    
    public void setFeedbackId(int feedbackId) {
        this.feedbackId = feedbackId;
    }
    
    public int getFeedbackId(){
        return feedbackId;
    }
    
    public void setRestId(int restId) {
        this.restId = restId;
    }
    
    public int getRestId(){
        return restId;
    }
    
    
    public void setCustId(int custId) {
        this.custId = custId;
    }
    
    public int getCustId(){
        return custId;
    }
    
     
    public void setRateFood(Float rateFood) {
        this.rateFood = rateFood;
    }
    
    public Float getRateFood(){
        return rateFood;
    }
    
    public void setRateRest(Float rateRest) {
        this.rateRest = rateRest;
    }
    
    public Float getRateRest(){
        return rateRest;
    }
    
    public void setComments(String comments) {
        this.comments = comments;
    }
    
    public String getComments(){
        return comments;
    }
    
    public void setRateDelivery(Boolean rateDelivery) {
        this.rateDelivery = rateDelivery;
    }
    
    public Boolean getRateDelivery(){
        return rateDelivery;
    }
}

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
public class FoodEntity {
    String foodID;
    String foodName;  
    double foodPrice;
    
     public void setFoodID(String foodID) {
        this.foodID = foodID;
    }
    
    public String getFoodID(){
        return foodID;
    }
     public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
    
    public String getFoodName(){
        return foodName;
    }
    
     public void setFoodPrice(double foodPrice) {
        this.foodPrice = foodPrice;
    }
    
    public double getFoodPrice(){
        return foodPrice;
    }
    
}

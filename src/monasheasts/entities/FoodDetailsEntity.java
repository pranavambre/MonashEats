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
public class FoodDetailsEntity {
    String foodID;
    int quantity;  
    double price;
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public int getQuantity(){
        return quantity;
    }
    
     public void setFoodID(String foodID) {
        this.foodID = foodID;
    }
    
    public String getFoodID(){
        return foodID;
    }
    
     public void setPrice(double price) {
        this.price = price;
    }
    
    public double getPrice(){
        return price;
    }
    
    
}

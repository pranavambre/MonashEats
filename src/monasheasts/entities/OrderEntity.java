/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monasheasts.entities;

import java.util.List;

/**
 *
 * @author SRI
 */
public class OrderEntity {
    int orderId;
    int restId;
    int custId;
    int receiptId;
    String paymentType; 
    String orderStatus;
    List <FoodDetailsEntity> foodDetailsList;

    
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    
    public int getOrderId(){
        return orderId;
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
    
    public void setReceiptId(int receiptId) {
        this.receiptId = receiptId;
    }
    
    public int getReceiptId(){
        return receiptId;
    }
    
    
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
    
    public String getPaymentType(){
        return paymentType;
    }
        
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
    
    public String getOrderStatus(){
        return orderStatus;
    }
        
}

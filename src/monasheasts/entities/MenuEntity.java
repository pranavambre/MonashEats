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
public class MenuEntity {
    String menuID;
    List <FoodEntity> foodList;
    
    
    
     public void setMenuID(String menuID) {
        this.menuID = menuID;
    }
    
    public String getMenuID(){
        return menuID;
    }
}

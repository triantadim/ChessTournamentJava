/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import interfaces.IClock;

/**
 *
 * @author George.Pasparakis
 */
public class Clock extends Naming implements IClock{


    public Clock() {
  
    }
    
    
    public int newClock(int timer){
        timer = timer - 15;
        
        return (timer);
    }
    
}

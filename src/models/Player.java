/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import interfaces.IPlayer;
/**
 *
 * @author George.Pasparakis
 */
public class Player extends Naming implements IPlayer {
    private int counter = 0;
    private int x = 600;
            
    public Player() {
        
    }
    
    public Player(String name) {
        this.setName(name);
        System.out.println(name);
    }
    
    /*
        In this method we need to figure out 
        for the specific game which move the player does
    */
    public String moves(Game game) {
        String result = "";
        if(counter>=40){
            counter = 0;
            result = Integer.toString(counter);
        } else{
            counter ++;
            result = Integer.toString(counter);
        }
//        String result = "";
//        counter++;
//        result = Integer.toString(counter);
        return(result);
    }
    public int startClock(Game game){
      if(x==0){
          x=600;
      }else {
          x=x-15;
      }
       
     return (x);   
    }


    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import interfaces.IGame;

/**
 *
 * @author George.Pasparakis
 */
public class Game extends Naming implements IGame {
    private Player[] players;
    
    public  Game() {
       System.out.println("Game 1");
    }
    
    public Game(String name, Player[] players) {
        this.setName(name);
        this.start(players);
    }
    
    public void start(Player[] players) {
        System.out.println(this.getName());
        System.out.println("Player " + players[0] + " plays against Player " + players[1]);
        this.players = players;
        this.playersMove(players, new Clock());
        
    }
    
    public void playersMove(Player[] players, Clock c) {
        //int timer = 600;
        
        for (int i = 0; i < 80; i++) {
            System.out.println("Player " + players[(i % 2 ==1)?1:0] + " plays move " +
                                       players[(i % 2 ==1)?1:0].moves(this) +
                                   " against Player " + players[(i % 2 ==1)?0:1]);
            
            
           System.out.println("Time is: " + players[(i % 2 ==1)?1:0].startClock(this));
//            System.out.println("Player " + players[1] + " plays move " +
//                                       players[1].moves(this) +
//                                   " against Player " + players[0]);
           //timer -= 15;
        }
    }


}

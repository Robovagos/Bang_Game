/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bang;

import java.util.List;

/**
 *
 * @author Deoll
 */
public class Arrow extends Dice{
    public static final int numberOfArrows = 9;
    protected static int arrowsLeft = 9;
    protected static boolean isLast = false;
    protected Player player;
    
    Arrow(Player other, List players){
        this.player = other;
        this.isLast = this.arrowAttack();
        this.indianAttack(players);
        
        System.out.println("remain arrows > " + arrowsLeft);    //For Testing
        
    }
    /**
     * Calls with the constractor and give an arrow to the Player
     * @return true if <i>arrowsLeft</i> < =0.
     */
    public boolean arrowAttack(){
        if(arrowsLeft <= 0){
            arrowsLeft = 9;
            return true;
            //skane indianoi
        }
        else{
            this.player.takeArrow();
            arrowsLeft--;
            if(arrowsLeft <= 0){
                arrowsLeft = 9;
                return true;
            }
            else{
                return false;
            }
        }
    }
    public void indianAttack(List players){ //NOT RDY
        if(isLast){
            for (int i = 0; i < 10; i++) {
                //Player user = players.get(i);
            }
             
            //newPlayer.arrowAttack();
        }
    }
}

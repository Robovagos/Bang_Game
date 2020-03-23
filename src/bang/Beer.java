/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bang;

/**
 *
 * @author Deoll
 */
public class Beer {
    
    Beer(Player other){
        this.giveBeer(other);
    }
    
    
    
    /**
     * Takes a Player obj as parameter and increase life by 1
     * if the Player is not full of life
     * @param Player
     */
    
    protected void giveBeer(Player other){
        if(other.getLife() < other.getMaxLife()){
            other.takeBeer();
        }
    }
    
}

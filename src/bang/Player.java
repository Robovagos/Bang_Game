/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bang;

/**
 *
 * @author Γιωργος
 */
public class Player {
    protected String userName;
    protected int life = 0;
    protected int numberOfArrows = 0;
    protected boolean isDead = false;
    protected boolean isMyTurn = false;
    //public Hero hero;
    //public Role role;
    
    Player(String userName){
        this.life = 0;
        this.userName = userName;
        this.isDead = false;
        this.isMyTurn = false;
        this.numberOfArrows = 0;
    }
    
    public int getLife(){
        return this.life;
    }
    public String getUserName(){
        return this.userName;
    }
    public boolean isDead(){
        return this.isDead;
    }
    public int getNumberOfArrows(){
        return this.numberOfArrows;
    }
    
    
    /**
     * Player get damage and life decrease by one.
     * @return true if the player dies 
     */
    public boolean takeDamage(){
        life--;
        if(life <= 0){
            this.isDead = true;
            return true;
        }   
        else{
            return false;
        }
    }
    
    /**
     * Player get an arrow from stack
     */
    public void takeArrow(){
        this.numberOfArrows++;
    }
    
    /**
     * 
     * @param other  Choose one other player
     * @return true  if the other player dies after the attack 
     */
    public boolean attack(Player other){
       return other.takeDamage();
    }
    
    
}

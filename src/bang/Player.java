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
    protected int maxLife = 0;
    protected int numberOfArrows = 0;
    protected int numberOfDynamite = 0;
    protected boolean isDead = false;
    protected boolean isMyTurn = false;
    protected boolean getHit = false;
    //public Hero hero;
    //public Role role;
    
    Player(String userName){
        this.life = 0;
        this.maxLife = 0;
        this.numberOfDynamite = 0;
        this.userName = userName;
        this.isDead = false;
        this.isMyTurn = false;
        this.numberOfArrows = 0;
        this.getHit = false;
    }
    
    public int getLife(){
        return this.life;
    }
    public int getMaxLife(){
        return this.maxLife;
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
     * Player get an arrow from stack and increase numberOfArrows
     * @return true
     */
    public boolean takeArrow(){
        this.numberOfArrows++;
        return true;
    }
    
    /**
     * Player get damage by gatling and life decrease by one.
     * @return true if Player get killed
     */
    public boolean takeGatling(){
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
     * Player take a beer and increase life by one.
     * @return true if life was increased
     */
    public boolean takeBeer(){
        if(this.isDead == true){
            this.isDead = false;
            this.life = 1;
            return true;
        }
        else{
            if(this.life < this.maxLife){
                this.life++;
                return true;
            }
            else{
                return false;
            }
            
        }  
    }
    /**
     * 
     * @return true if Player get killed
     */
    public boolean takeDynamite(){ //NOT SURE
        this.numberOfDynamite++;
        if(this.numberOfDynamite >= 3){
            //start dynamite attack
        }
        return false;
    }
    
    
    public boolean giveDamage(Player other){
           
        return other.takeDamage();
    }
    public boolean giveArrow(Player other){
           
        return other.takeArrow();
    }
    public boolean giveGatling(Player other){
           
        return other.takeGatling();
    }
    public boolean giveBeer(Player other){
           
        return other.takeBeer();
    }
    public boolean giveDynamite(Player other){  //NOT SURE
        return other.takeDynamite();
    }
    
    
    //public void dynamite()
    public void arrowAttack(){
        this.life -= numberOfArrows;
        this.numberOfArrows = 0;
        if(life <= 0){
            this.isDead = true;
            //return true;
        }   
        else{
            //return false;
        }
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

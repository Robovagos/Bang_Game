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
public class Sheriff extends Hero {
    
    
    
    Sheriff(String name) {
        super(name);
        this.life += 2;
        this.maxLife = this.life;
        
        
    }
    public boolean isDead(){
        if(this.life <= 0){
            return true;
        }
        else{
            return false;
        }
    }
    

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bang;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Γιωργος
 */
public class Bang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Hero myHero = new Hero("Vagelis");
        List<Player> playersList = new ArrayList<>();
        Player newPlayer = new Sheriff("Deoll");
        Player newPlayer2 = new Sheriff("Varch");
        Player newPlayer3 = new Sheriff("Nickel");
        Player newPlayer4 = new Sheriff("Raptis");
        
        playersList.add(newPlayer);
        playersList.add(newPlayer2);
        playersList.add(newPlayer3);
        playersList.add(newPlayer4);
        //(Player)playersList.get(0).arrowAttack(); For Testing
        
        /*newPlayer.arrowAttack();
        Dice A = new Arrow(newPlayer, playersList);
        Dice B = new Arrow(newPlayer, playersList); 
        Dice c = new Arrow(newPlayer2, playersList);
        Dice d = new Arrow(newPlayer, playersList);
        Dice e = new Arrow(newPlayer3, playersList);
        Dice f = new Arrow(newPlayer4, playersList); 
        Dice g = new Arrow(newPlayer4, playersList);
        Dice h = new Arrow(newPlayer2, playersList);
        Dice i = new Arrow(newPlayer3, playersList);
        Dice q = new Arrow(newPlayer, playersList);        
        System.out.println(newPlayer.getNumberOfArrows());*/
        
    }
    
}

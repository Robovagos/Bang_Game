/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bang;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Γιωργος
 */
public class Hero extends Player{
    /**When a hero object creating get a random ID number
     * Every number represent one Hero from the game and
     * has specific <i>method</i> and <i>life</i>.
     * 
     * Heros
     * 1) BartCassidy 8
     * 2) BlackJack 8 
     * 3) CalamityJanet 8 
     * 4) ElGringo 7 
     * 5) JesseJones 9 
     * 6) Jourdonnais 7
     * 7) KitCarlson 7
     * 8) LuckyDuke 8 
     * ...
     */
    private int hero;
    
    public static boolean[] heroList = {
        true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true};
    
    
    
    Hero(String name){
        super(name);
        hero = this.chooseHero();
        this.life += this.getLife();
        System.out.println(hero);
        this.getSpecialty();
    }
    /**
     * 
     * @return An available <i>int</i> number from heroList 
     */
    private int chooseHero(){
        Random random = new Random();
        boolean isOk = false;
        int number;
        
        do{
            number = random.nextInt(16);
            if(this.heroList[number] != false
                    ){
                this.heroList[number] = false;
                isOk = true;
            }else{
                isOk = false;
                continue;
            }
        }while(!isOk);
        
        return number;
    }
    
    public int getlife() {
        
        int lifePerHero=0;
        
        switch(hero){
            case 0 : {
                lifePerHero=8;
                break;
            }
            case 1 : {
                lifePerHero=8;
                break;
            }
            case 2 : {
                lifePerHero=8;
                break;
            }
            case 3 : {
                lifePerHero=7;
                break;
            }
            case 4 : {
                lifePerHero=9;
                break;
            }
            case 5 : {
                lifePerHero=7;
                break;
            }
            case 6 : {
                lifePerHero=7;
                break;
            }
            case 7 : {
                lifePerHero=8;
                break;
            }
            case 8 : {
                lifePerHero=9;
                break;
            }
            case 9 : {
                lifePerHero=8;
                break;
            }
            case 10 : {
                lifePerHero=9;
                break;
            }
            case 11 : {
                lifePerHero=8;
                break;
            }
            case 12 : {
                lifePerHero=8;
                break;
            }
            case 13 : {
                lifePerHero=8;
                break;
            }
            case 14 : {
                lifePerHero=9;
                break;
            }
            case 15 : {
                lifePerHero=8;
                break;
            }
            default :{
                
            }
        }
        return lifePerHero;
    }

    public void getSpecialty(){
        
        switch(hero){
            case 0: {
                System.out.println("You may take an arrow instead of losing a life point (except to Indians or Dynamite).\n" +
"You cannot use this ability if you lose a life point to Indian or Dynamite, only for (1), (2), or Gatling Guns. \nYou may not use this ability to take the last arrow remaining in the pile.");
                break;    
            }
            case 1:{
                System.out.println("You may re-roll dynamites(not if you roll three or more!).\n" +
"If you roll three or more Dynamite at once (or in\n" +
"total if you didn’t re-roll them), follow the usual\n" +
"rules (your turn ends, etc.).");
                break;
            }
            case 2:{
                System.out.println("You can use (1) as (2) and vice-versa.");
                break;
            }
            case 3:{
                System.out.println("When a player makes you lose one or more life\n" +
"points, he must take an arrow.\n" +
"Life points lost to Indians or Dynamite are not affected.");
                break;
            }
            case 4:{
                System.out.println("If you have four life points or less, you gain two if you\n" +
"use (beer) for yourself.\n" +
"For example, if you have four life points and use\n" +
"two beers, you get four life points.");
                break;
            }
            case 5:{
                System.out.println("You never lose more than one life point to Indians");
                break;
            }
            case 6:{
                System.out.println("For each (gatling) you may discard one arrow from\n" +
"any player.\n" +
"You may choose to discard your own arrows. If you\n" +
"roll three (gatling) , you discard all your own arrows,\n" +
"plus three from any player(s) (of course, you still\n" +
"deal one damage to each other player).");
                break;
            }
            case 7:{
                System.out.println("You may make one extra re-roll.\n" +
"You may roll the dice a total of four times on your turn.");
                break;
            }
            case 8:{
                System.out.println("You never lose life points to the Gatling Gun.");
                break;
            }
            case 9:{
                System.out.println("Each time you lose a life point, you may discard\n" +
"one of your arrows.\n" +
"You still lose the life point when you use this ability.");
                break;
            }
            case 10:{
                System.out.println("You may use (1) or (2) for players sitting one place\n" +
"further.\n" +
"With (1) you may hit a player sitting up to two\n" +
"places away, and with (2) you may hit a player\n" +
"sitting two or three places away.");
                break;
            }
            case 11:{
                System.out.println("At the beginning of your turn, any player of your\n" +
"choice gains one life point.\n" +
"You may also choose yourself");
                break;
            }
            case 12:{
                System.out.println("Once per turn, you can use a (beer) to double a (1) or (2) .\n" +
"The dice you double takes two life points away from\n" +
"the same player (you can’t choose two different\n" +
"players). The (beer) in this case does not provide any\n" +
"life points.");
                break;
            }
            case 13:{
                System.out.println("If you didn’t roll any (1) or (2) , you gain two life points.\n" +
"This only applies at the end of your turn, not during\n" +
"your re-rolls.");
                break;
            }
            case 14:{
                System.out.println("Each time another player is eliminated, you gain\n" +
"two life points.");
                break;
            }
            case 15:{
                System.out.println("You only need two (gatling) to use the Gatling Gun.\n" +
"You can activate the Gatling Gun only once per turn,\n" +
"even if you roll more than two results.");
                break;
            }
            default :{
                
            }      
        }
      
    }
    

}   


package com.company;

public class Kata {
    private Kata(){
        //constructor to instantiate
    }
    // we need to compare fighter 1 and fighter 2
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker){
        String winner = "";
        // check who the first fighter is
        if(fighter1.name.equals(firstAttacker)){
            System.out.println("here");
            //if fighter 1 is the first attacker
            while(fighter1.health>0 || fighter2.health>0){
                fighter2.health -= fighter1.damagePerAttack;
                fighter1.health -= fighter2.damagePerAttack;
                if(fighter2.health <= 0){
                    winner = fighter1.name;
                    break;
                }
                if(fighter1.health<=0){
                    winner = fighter2.name;
                    break;
                }
            }
        }
        else{
            // if fighter 2 starts attacking
            while(fighter1.health>0 || fighter2.health>0){
                fighter1.health -= fighter2.damagePerAttack;
                fighter2.health -= fighter1.damagePerAttack;
                if(fighter1.health <= 0){
                    winner = fighter2.name;
                    break;
                }
                if(fighter2.health<=0){
                    winner = fighter1.name;
                    break;
                }
            }
        }
        return winner;
    }
}

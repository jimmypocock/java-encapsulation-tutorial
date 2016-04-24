package com.completeJavaDeveloperCourse;

public class Main {

    public static void main(String[] args) {
//        Bad way of doing it.
//        Player player = new Player();
//        player.name = "Tim";
//        player.weapon = "Sword";
//        player.health = 20;
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health is " + player.healthRemaining());
//
//        damage = 11;
//        player.loseHealth(damage);
//        System.out.println("Remaining health is " + player.healthRemaining());


        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Tim", "Sword", 50);
        System.out.println("Initial health is " + enhancedPlayer.getHealth());

    }
}

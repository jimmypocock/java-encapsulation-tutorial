package com.completeJavaDeveloperCourse;

/**
 * Created by jimmypocock on 4/24/16.
 */
public class EnhancedPlayer {
    private String name;
    private String weapon;
    private int health;

    public EnhancedPlayer(String name, String weapon, int health) {
        this.name = name;
        this.weapon = weapon;
        if (health > 0 && health <= 100) {
            this.health = health;
        }
    }

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println("Player knocked out...");
            // Reduce number of lives for player.
        }
    }

    public int getHealth() {
        return health;
    }
}

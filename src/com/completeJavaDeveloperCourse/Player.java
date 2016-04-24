package com.completeJavaDeveloperCourse;

/**
 * Created by jimmypocock on 4/24/16.
 */
public class Player {
    public String name;
    public String weapon;
    public int health;

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println("Player knocked out...");
            // Reduce number of lives for player.
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}

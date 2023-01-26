package com.javalesson6;

public class GameEntity {
    private int health;
    private int damage;

    public GameEntity(int damage, int health) {
        this.damage = damage;
        this.health = health;
    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}

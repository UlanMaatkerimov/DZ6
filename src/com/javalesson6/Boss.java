package com.javalesson6;

public class Boss extends GameEntity {

    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;

    }

    public Boss(int damage, int health, Weapon weapon) {
        super(damage, health);
        this.weapon = weapon;
    }

    public String printlnfo() {
        return getClass().getSimpleName() + " health: " + getHealth() +
                " " + " Damage: [" + getDamage() + "]" + " Boss weapon: " + getWeapon().getWeaponType() + getWeapon().getGun();
    }
}
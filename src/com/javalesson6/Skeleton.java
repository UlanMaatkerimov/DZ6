package com.javalesson6;

public class Skeleton extends Boss {
    private int numbersOfArrows;

    public int getNumbersOfArrows() {
        return numbersOfArrows;
    }

    public Skeleton(int damage, int health, Weapon weapon, int numbersOfArrows) {
        super(damage, health, weapon);
        this.numbersOfArrows = numbersOfArrows;
    }

    @Override
    public String printlnfo() {
        return getClass().getSimpleName() + " health: " + getHealth() +
                " " + " Damage: [" + getDamage() + "]" + " Boss weapon: " + getWeapon().getWeaponType() + getWeapon().getGun() + " " + numbersOfArrows;
    }
}


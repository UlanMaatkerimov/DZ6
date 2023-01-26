package com.javalesson6;

public class Weapon {

    private String weaponType;
    private String gun;


    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public String getGun() {
        return gun;
    }

    public void setGun(String gun) {
        this.gun = gun;
    }

    public Weapon(String weaponType, String gun) {
        this.weaponType = weaponType;
        this.gun = gun;



    }
}

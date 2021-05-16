package com.geektech;

public class Boss extends GameEntity{

    Weapon weapon = new Weapon("Glove", "Infinity Stones");

    public Boss(String name, int health, int damage) {
        super(name, health, damage);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}

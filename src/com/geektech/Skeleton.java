package com.geektech;

public class Skeleton extends Boss{

    private int arrowQuantity;
    public Skeleton(String name, int health, int damage, int arrowQuantity) {
        super(name, health, damage);
        this.arrowQuantity = arrowQuantity;
    }

    public int getArrowQuantity() {
        return arrowQuantity;
    }

    @Override
    public String printInfo() {
        return getName() + "'s health = " + getHealth() + ", damage = " + getDamage() +
                ", arrow quantity = " + getArrowQuantity();
    }
}

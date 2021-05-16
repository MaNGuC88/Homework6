package com.geektech;

public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss("Thanos", 2000, 100);
        boss.setWeapon(boss.weapon);

        System.out.println(boss.getName() + "'s health = " + boss.getHealth()
                + ", damage = " + boss.getDamage() + ", Weapon type is " + boss.getWeapon().getWeaponName() +
                " " + boss.getWeapon().getWeaponType());
    }
}

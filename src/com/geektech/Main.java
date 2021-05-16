package com.geektech;

public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss("Thanos", 2000, 100);
        boss.setWeapon(boss.weapon);

        System.out.println(boss.printInfo());

        Skeleton skelet1 = new Skeleton("Skeleton 1", 400, 30, 70);
        Skeleton skelet2 = new Skeleton("Skeleton 2", 500, 40, 50);

        Skeleton[] skelets = {skelet1, skelet2};
        for (Skeleton skelet : skelets) {
            System.out.println(skelet.printInfo());
        }
    }
}

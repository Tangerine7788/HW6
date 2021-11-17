package com.company;

public class Main {

    public static void main(String[] args) {
	Boss boss = new Boss();
    boss.setDamage(700);
        System.out.println(boss.getDamage());
    boss.setHealth(500);
        System.out.println(boss.getHealth());
    boss.setName("Catana!");
        System.out.println(boss.getName());
    boss.setType("Sword:");
        System.out.println(boss.getType());



    }

}

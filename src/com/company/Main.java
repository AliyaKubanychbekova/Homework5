package com.company;

public class Main {

    public static void main(String[] args) {

        Boss boss=new Boss();
        boss.setDamage(70);
        boss.setHealth(600);
        boss.setDefenceType(" РЎСѓРїРµСЂ РїСЂС‹Р¶РѕРє ");

        System.out.println(  boss.getHealth()+" "+ boss.getDamage()+" "+ boss.getDefenceType());

    }
}

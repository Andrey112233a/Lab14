package com.company;


class HealthPoints {
    private static HealthPoints HP = new HealthPoints();
    private int Health;

    private HealthPoints(){
        this.Health = 100;
    }

    public static HealthPoints getInstance(){
        return HP;
    }

    public int getHealth(){
        return Health;
    }

    public void setHealth(int HP){
        this.Health = Health;
    }
}

public class Main {

    public static void main(String[] args) {
        HealthPoints Hp = HealthPoints.getInstance();

        System.out.println(Hp.getHealth());
        Hp.setHealth(125);
        HealthPoints Hp1 = HealthPoints.getInstance();
        System.out.println(Hp.getHealth());

        if (Hp1.hashCode()==Hp.hashCode()){
            System.out.println("Ok");
        }
        else {
            System.out.println("Error!");
        }
    }
}

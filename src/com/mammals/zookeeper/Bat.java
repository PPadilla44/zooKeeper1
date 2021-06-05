package com.mammals.zookeeper;

public class Bat extends Mammal {

    public Bat(){
        energyLevel = 300;
    }

    public void fly(){
        System.out.println("The bat is flying -50 energy");
        energyLevel-=50;
    }

    public void eatHumans(){
        System.out.println("The bat ate some humans +25 energy");
        energyLevel+=25;
    }

    public void attackTown() {
        System.out.println("The bat attacked a town -100 energy");
        energyLevel-=100;
    }

}

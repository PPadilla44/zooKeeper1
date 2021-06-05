package com.mammals.zookeeper;

public class Gorilla extends Mammal{

    public void throwSomething(){
        System.out.println("The gorilla has thrown something -5 energy");
        setEnergyLevel(getEnergyLevel()-5);
    }

    public void eatBananas(){
        System.out.println("The gorilla is very happy from the banana +10 energy");
        setEnergyLevel(getEnergyLevel()+10);
    }

    public void climb() {
        System.out.println("The gorilla climbed a tree -10 energy");
        setEnergyLevel(getEnergyLevel()-10);
    }
}

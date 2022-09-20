package com.company;

class AnimalThread extends Thread {
    AnimalThread(String name,int prioritet) {
        this.name = name;
        this.prioritet = prioritet;
    }
    int prioritet;
    String name;

    public void run() {
        Thread theard = new Thread();
        for(int i = 0; i <= 1000; i += 100){
            System.out.println( name + " пробежал(а): " + i + " метров");
            if(i == 500) {
                prioritet = NORM_PRIORITY;
                theard.setPriority(prioritet); //замена приоритета
            }
        }
    }
}
public class RabbitAndTurtle{
    public static void main(String args[]){
        AnimalThread rabbit = new AnimalThread("Кролик",Thread.MIN_PRIORITY);
        rabbit.start();
        AnimalThread turtle = new AnimalThread("Черепаха",Thread.MAX_PRIORITY);
        turtle.start();
    }
}

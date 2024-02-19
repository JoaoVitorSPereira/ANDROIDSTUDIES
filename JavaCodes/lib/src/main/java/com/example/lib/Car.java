package com.example.lib;

class Car{
    int year;
    int speed;

    void accelerate() {
        speed +=10;
        System.out.println("Your new speed is:" +speed);
    }

    void brake(){
        speed -=5;
        System.out.println("Your new speed is:" +speed);

    }

    //Constructor

    public Car(int carSpeed, int carYear) {
        year = carYear;
        speed = carSpeed;
    }
}
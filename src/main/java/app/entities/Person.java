package app.entities;

import java.util.*;

public class Person {

    private List<Car> list;

    public void startTheCar(){
        System.out.println("the car is started...");
    }

    public void pressThePedal(int maxSpeed){
        Scanner in = new Scanner(System.in);
        boolean a = true;

        while (a){
            System.out.println("enter your speed: ");
            int speed = in.nextInt();
            if(speed <= maxSpeed){
                System.out.println("your speed is " + speed);
                a = false;
            }
            else {
                System.out.println("you've exceeded the speed limit, speed limit is " + maxSpeed);
            }
        }


    }
    public Person(List<Car> list) {
        this.list = list;
    }

    public List<Car> getList() {
        return list;
    }
}

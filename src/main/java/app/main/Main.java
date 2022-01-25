package app.main;

import app.entities.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Person person = context.getBean("person", Person.class);
        List<Car> list = person.getList();

        Scanner in = new Scanner(System.in);

        System.out.println("Choose the car: ");
        System.out.println("1. BMW\n2. Audi ");
        int choice = in.nextInt();

        int maxSpeed = 0;

        for (Car car : list) {
            if (choice == 1 && car.getName().equals("BMW")) {
                maxSpeed = car.getMaxSpeed();
            }
            else if(choice == 2 && car.getName().equals("Audi")){
                maxSpeed = car.getMaxSpeed();
            }

        }

        person.startTheCar();
        person.pressThePedal(maxSpeed);

    }
}


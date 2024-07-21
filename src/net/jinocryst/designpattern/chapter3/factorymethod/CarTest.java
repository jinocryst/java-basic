package net.jinocryst.designpattern.chapter3.factorymethod;

public class CarTest {
    public static void main(String[] args) {
        CarFactory factory = new HyundaiCarFactory();
        Car newCar = factory.createCar("sonata");

        System.out.println(newCar);
    }
}

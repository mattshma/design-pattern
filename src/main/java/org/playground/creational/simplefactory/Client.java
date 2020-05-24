package org.playground.creational.simplefactory;

import org.playground.creational.Computer;
import org.playground.creational.pojo.CPU;

public class Client {

    public static void main(String[] args) {
        CPU cpu = CPUFactory.makeCPU("Intel");
        Computer computer = new Computer(cpu);
        System.out.println(computer.toString());;
    }
}

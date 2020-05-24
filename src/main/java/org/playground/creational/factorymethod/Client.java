package org.playground.creational.factorymethod;


import org.playground.creational.Computer;
import org.playground.creational.pojo.CPU;

public class Client {

    public static void main(String[] args) {
        CPUFactory cpuFactory = new IntelCPUFactory();
        CPU cpu = cpuFactory.makeCPU();
        Computer computer = new Computer(cpu);
        System.out.println(computer.toString());
    }
}

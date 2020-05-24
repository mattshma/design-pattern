package org.playground.creational.abstractfactory;

import org.playground.creational.Computer;
import org.playground.creational.pojo.CPU;
import org.playground.creational.pojo.Disk;
import org.playground.creational.pojo.MainBoard;

public class Client {

    public static void main(String[] args) {
        ComputerFactory computerFactory = new AmdFactory();
        CPU cpu = computerFactory.makeCPU();
        MainBoard mainBoard = computerFactory.makeMainBoard();
        Disk disk = computerFactory.makeDisk();
        Computer computer = new Computer(cpu, mainBoard, disk);
        System.out.println(computer.toString());
    }
}

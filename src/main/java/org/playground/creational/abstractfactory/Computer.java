package org.playground.creational.abstractfactory;

import org.playground.creational.abstractfactory.pojo.CPU;
import org.playground.creational.abstractfactory.pojo.Disk;
import org.playground.creational.abstractfactory.pojo.MainBoard;

public class Computer {
    private CPU cpu;
    private MainBoard mainBoard;
    private Disk disk;

    Computer(CPU cpu, MainBoard mainBoard, Disk disk) {
        this.cpu = cpu;
        this.mainBoard = mainBoard;
        this.disk = disk;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu=" + cpu.display() +
                ", mainBoard=" + mainBoard.display() +
                ", disk=" + disk.display() +
                '}';
    }

    public static void main(String[] args) {
        ComputerFactory computerFactory = new AmdFactory();
        CPU cpu = computerFactory.makeCPU();
        MainBoard mainBoard = computerFactory.makeMainBoard();
        Disk disk = computerFactory.makeDisk();
        Computer computer = new Computer(cpu, mainBoard, disk);
        System.out.println(computer.toString());
    }
}

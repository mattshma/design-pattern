package org.playground.creational;

import org.playground.creational.pojo.CPU;
import org.playground.creational.pojo.Disk;
import org.playground.creational.pojo.MainBoard;

public class Computer {

    private CPU cpu;
    private MainBoard mainBoard;
    private Disk disk;

    public Computer(CPU cpu) {
        this.cpu = cpu;
    }

    public Computer(CPU cpu, MainBoard mainBoard, Disk disk) {
        this.cpu = cpu;
        this.mainBoard = mainBoard;
        this.disk = disk;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu=" + cpu.display() +
                (mainBoard != null ? ", mainBoard=" + mainBoard.display() : "") +
                (disk != null ? ", disk=" + disk.display() : "") +
                '}';
    }
}

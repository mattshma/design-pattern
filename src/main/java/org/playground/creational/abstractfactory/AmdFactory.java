package org.playground.creational.abstractfactory;

import org.playground.creational.pojo.*;

public class AmdFactory implements ComputerFactory {

    public CPU makeCPU() {
        return new AmdCPU();
    }

    public MainBoard makeMainBoard() {
        return new AmdMainBoard();
    }

    public Disk makeDisk() {
        return new AmdDisk();
    }
}

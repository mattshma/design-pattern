package org.playground.creational.abstractfactory;

import org.playground.creational.pojo.*;

public class IntelFactory implements ComputerFactory {

    public CPU makeCPU() {
        return new IntelCPU();
    }

    public MainBoard makeMainBoard() {
        return new IntelMainBoard();
    }

    public Disk makeDisk() {
        return new IntelDisk();
    }
}

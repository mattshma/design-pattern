package org.playground.creational.abstractfactory;

import org.playground.creational.pojo.CPU;
import org.playground.creational.pojo.Disk;
import org.playground.creational.pojo.MainBoard;

public interface ComputerFactory {

    CPU makeCPU();

    MainBoard makeMainBoard();

    Disk makeDisk();
}

package org.playground.creational.abstractfactory;

import org.playground.creational.abstractfactory.pojo.CPU;
import org.playground.creational.abstractfactory.pojo.Disk;
import org.playground.creational.abstractfactory.pojo.MainBoard;

public interface ComputerFactory {

    CPU makeCPU();

    MainBoard makeMainBoard();

    Disk makeDisk();
}

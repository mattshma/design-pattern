package org.playground.creational.factorymethod;


import org.playground.creational.pojo.CPU;
import org.playground.creational.pojo.IntelCPU;

public class IntelCPUFactory implements CPUFactory {

    public CPU makeCPU() {
        return new IntelCPU();
    }
}

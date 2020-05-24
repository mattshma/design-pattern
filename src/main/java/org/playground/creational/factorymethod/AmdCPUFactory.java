package org.playground.creational.factorymethod;


import org.playground.creational.pojo.AmdCPU;
import org.playground.creational.pojo.CPU;

public class AmdCPUFactory implements CPUFactory {

    public CPU makeCPU() {
        return new AmdCPU();
    }
}

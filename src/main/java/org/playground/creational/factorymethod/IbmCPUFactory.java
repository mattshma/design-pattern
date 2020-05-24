package org.playground.creational.factorymethod;


import org.playground.creational.pojo.CPU;
import org.playground.creational.pojo.IbmCPU;

public class IbmCPUFactory implements CPUFactory {

    public CPU makeCPU() {
        return new IbmCPU();
    }
}

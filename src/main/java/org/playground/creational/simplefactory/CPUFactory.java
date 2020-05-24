package org.playground.creational.simplefactory;

import org.playground.creational.pojo.AmdCPU;
import org.playground.creational.pojo.CPU;
import org.playground.creational.pojo.IntelCPU;

public class CPUFactory {

    public static CPU makeCPU(String cpu) {
        if (cpu.equals("Intel")) {
            return new IntelCPU();
        } else if (cpu.equals("Amd")) {
            return new AmdCPU();
        } else {
            return null;
        }
    }
}

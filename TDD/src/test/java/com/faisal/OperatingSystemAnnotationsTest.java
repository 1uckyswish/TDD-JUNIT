package com.faisal;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class OperatingSystemAnnotationsTest {

    //enabled on mac only
    @Test
    @EnabledOnOs(OS.MAC)
    public void printHello() {
        System.out.println("Hello");
    }

    //disabled on windows
    // and enabled on all other platforms
    @Test
    @DisabledOnOs(OS.MAC)
    public void printHello2() {
        System.out.println("Hello");
    }

    //disabled on windows and mac
    //takes 1 or more params from OS
    @Test
    @DisabledOnOs({OS.WINDOWS, OS.MAC})
    public void printHello3() {
        System.out.println("Hello");
    }
}

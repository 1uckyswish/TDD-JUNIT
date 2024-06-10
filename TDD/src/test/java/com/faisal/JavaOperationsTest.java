package com.faisal;

import org.junit.jupiter.api.*;

class JavaOperationsTest {

    JavaOperations javaOperations;

    @BeforeAll
    public static void openDatabase() {
        // before all calls the initiation method
        System.out.println("openDatabase");
    }

    @AfterAll
    public static void closeDatabase() {
        System.out.println("closeDatabase");
    }

    @BeforeEach
    public void init() {
        javaOperations = new JavaOperations();
        System.out.println("init");
        // before each call the initiation method first before each test
    }

    @Test
    void addTest(){
        System.out.println("addTest");
    }

    @Test
    void multiplyTest(){
        System.out.println("multiplyTest");
    }

    @AfterEach
    void cleanUp(){
        // after each call the cleanup method first after each test
        // reminds of finally in try catch examples
        System.out.println("destroy");
    }
}

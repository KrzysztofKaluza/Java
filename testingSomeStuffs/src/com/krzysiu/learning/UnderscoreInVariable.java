package com.krzysiu.learning;

import java.util.Arrays;

public class UnderscoreInVariable {
    public static void main(String args[])
    {
        /*
        Can't use an underscore since Java SE 9
        int _ = 10;
        System.out.println(_);
        */
        //This will work
        int _a = 10;
        System.out.println(_a);

        // Binary search tests
        int arr[] = { 10, 20, 15, 22, 35, 12 };
        Arrays.sort(arr);

        int key = 21;
        int res = Arrays.binarySearch(arr, key);
        if (res >= 0)
            System.out.println(key + " found at index = "
                    + res);
        else
            System.out.println(key + " Not found");

        key = 40;
        res = Arrays.binarySearch(arr, key);
        if (res >= 0)
            System.out.println(key + " found at index = "
                    + res);
        else
            System.out.println(key + " Not found");
    }
}

// A Java program to demonstrate that we can use wrapper
// classes to swap to objects

// A car with model and no.
class Car
{
    int model, no;

    // Constructor
    Car(int model, int no)
    {
        this.model = model;
        this.no = no;
    }

    // Utility method to print object details
    void print()
    {
        System.out.println("no = " + no +
                ", model = " + model);
    }
}

// A Wrapper over class that is used for swapping
class CarWrapper
{
    Car c;

    // Constructor
    CarWrapper(Car c)   {this.c = c;}
}

// A Class that use Car and swaps objects of Car
// using CarWrapper
class Main
{
    // This method swaps car objects in wrappers
    // cw1 and cw2
    public static void swap(CarWrapper cw1,
                            CarWrapper cw2)
    {
        Car temp = cw1.c;
        cw1.c = cw2.c;
        cw2.c = temp;
    }

    // Driver method
    public static void main(String[] args)
    {
        Car c1 = new Car(101, 1);
        Car c2 = new Car(202, 2);
        CarWrapper cw1 = new CarWrapper(c1);
        CarWrapper cw2 = new CarWrapper(c2);
        swap(cw1, cw2);
        cw1.c.print();
        cw2.c.print();
    }
} 


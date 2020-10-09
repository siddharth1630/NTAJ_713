package com.nt.test;

import com.nt.comp.Car;
import com.nt.comp.Tyre;
import com.nt.factory.CarFactory;

public class FactoryPatternTest 
{
    public static void main( String[] args )
    {
        Car car=null;
        
        car=CarFactory.getInstance("luxary");
        car.Drive();
        System.out.println("==========================================");
        car=CarFactory.getInstance("sports");
        car.Drive();
        System.out.println("==========================================");
        car=CarFactory.getInstance("noidea");
        car.Drive();
    }
}

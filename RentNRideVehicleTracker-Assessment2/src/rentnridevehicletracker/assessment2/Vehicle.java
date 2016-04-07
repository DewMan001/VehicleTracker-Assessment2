/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentnridevehicletracker.assessment2;

/**
 *
 * @author dewey
 */
public class Vehicle {
    static String manufacturer;
    static String model;
    static int make_Year;
    static double kilometers;
    static int services;
    
    //setting up the default values
    Vehicle()
    {
    manufacturer = "No manufacturer name given";
    model = "No model set";
    make_Year = 0;
    kilometers = 0.00;
    services = 0;
    }
    //a copy constructor
    Vehicle(Vehicle First)
    {
        manufacturer = Vehicle.manufacturer;
        model = Vehicle.model;
        make_Year = Vehicle.make_Year;
        kilometers = Vehicle.kilometers;
        services = Vehicle.services;
    }
}

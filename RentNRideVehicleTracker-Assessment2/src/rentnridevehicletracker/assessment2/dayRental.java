/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentnridevehicletracker.assessment2;

/**
 *
 * @author James
 */
//setting up the fields for the dayRental class
public class dayRental
{
    private double rentalLength; //length in days
    private double rentalCost; //determined by length (in days) * 100 (default = 100)
    private Vehicle rentalVehicle;
    private double rentalDistance; //here for the distance total on the vehicle
    
    //setting default values
    dayRental()
    {
       rentalLength = 0;
       rentalCost = 100;
       rentalDistance = 0;
    }
    
    //setters for the dayRental class
    public void setRentalLength(double Length)
    {
        rentalLength = Length;
    }
    
    public void calculateRentalCost(double duration, double rate, double cost)
    {
        duration = rentalLength;
        rate = 100;
        cost = (duration * rate);
        rentalCost = cost;
    }

    public void setRentalVehicle(Vehicle vehicle)
    {
        rentalVehicle = vehicle;
    }

    public void setRentalDistance(double distance)
    {
        rentalDistance = distance;
    }
    
    //getters for the dayRental class
    public double getRentalLength() 
    {
        return rentalLength;
    }

    public double getRentalCost() 
    {
        return rentalCost;
    }

    public Vehicle getRentalVehicle() 
    {
        return rentalVehicle;
    }

    public double getRentalDistance() 
    {
        return rentalDistance;
    }
    
//experiments with a class to add the kilometers of the journey
//to the kilometers of the vehicle
    public void addDistance()
    {
        double distanceNew;
        distanceNew = 0;

        double distanceCurrent;
        distanceCurrent = 0;
        distanceCurrent = rentalVehicle.getKilometers();

        distanceNew = (distanceNew + distanceCurrent);

        rentalVehicle.setKM(distanceNew);
        rentalVehicle.getKilometers();
    }



}

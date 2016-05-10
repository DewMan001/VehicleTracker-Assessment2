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
public class kmRental
{
  private double rentalDistance; //length in kilometers
  private double rentalCost; //determined by $1*length
  private Vehicle rentalVehicle;
  
  kmRental()
  {
    rentalDistance = 0;
    rentalCost = 1;
  }
    
    //setters for the kmRental class

    public void setRentalDistance (double distance)
    {
      rentalDistance = distance;
    }
    
    public void calculateRentalCost(double distance, double rate, double cost)
    {
        distance = rentalDistance;
        rate = 1;
        cost = (distance * rate);
        rentalCost = cost;
    }
    
    public void setRentalVehicle (Vehicle vehicle)
    {
      rentalVehicle = vehicle;
    }
    
    //getters for the kmRental class

    public double getRentalDistance()
    {
      return rentalDistance;
    }

    public double getRentalCost()
    {
      return rentalCost;
    }

    public Vehicle getRentalVehicle()
    {
      return rentalVehicle;
    }
    
    //print method for kmRental class
    public void printKMRental()
    {
      System.out.println("Rental Distance: " + rentalDistance);
      System.out.println("Total Cost: " + rentalCost);
      System.out.println("Rented vehicle: " + rentalVehicle);
    }
    
        //experiments with a class to add the distance of the rental
    //to the distance meter of the car
    public void addDistance()
    {
        double distanceNew;
        distanceNew = 0;

        double distanceCurrent;
        distanceCurrent = rentalVehicle.getKilometers();

        distanceNew = distanceNew + distanceCurrent;

        rentalVehicle.setKM(distanceNew);
    }
}

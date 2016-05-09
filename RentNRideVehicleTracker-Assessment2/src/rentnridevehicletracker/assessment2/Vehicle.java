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
    private String manufacturer;
    private String model;
    private int make_Year;
    private double kilometers;
    private int services;
    
    
    private Journey[] journiesArray = new Journey[10];
    private int jArrayIndex = 0;

  
    
    Journey noJourney = new Journey();

//    noJourney.carUsed("No car set for this journey");
//    noJourney.startLocation("No start location set");
//    noJourney.endLocation("No end location set");
//    noJourney.totalDistance(0.00);
//    noJourney.usedFuel(0.00);
//   
    //setting up the default values
    Vehicle()
    {
        manufacturer = "No manufacturer name given";
        model = "No model set";
        make_Year = 0;
        kilometers = 0.00;
        services = 0; 
    }
    
     public void AddJourney(Journey journey1)
   {
     for (int elementCounter = 0; elementCounter < journiesArray.length; elementCounter++)
     {
       journiesArray[jArrayIndex] = journey1;
       jArrayIndex++;       
     }

     //if (jArrayIndex >= 10)
     //{
       //jArrayIndex = 0;
     //}
   }
    
    //Setting values for things
    public void setManufacturer (String Manu)
    {
        manufacturer = Manu;
    }
    public void setModel (String Model)
    {
        model = Model;
    }
    public void setMakeYear (int MakeYr)
    {
        make_Year = MakeYr;
    }
    public void setKM (double setKM)
    {
        kilometers = setKM;
    }
    public void setServices (int Services)
    {
        services = Services;
    }

    //Getting those values back out
    public String getManufacturer()
    {
        return manufacturer;
    }
    public String getModel()
    {
        return model;
    }
    public int getMake_Year()
    {
        return make_Year;
    }
    public double getKilometers()
    {
        return kilometers;
    }
    public int getService()
    {
        return services;
    }
      
        
    public void printVehicle()
    {
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Model: " + model);
        System.out.println("Make Year: " + make_Year);
        System.out.println("Kilometers: " + kilometers);
        System.out.println("Number of Services: " + services);
        
        System.out.println("\n" + "This vehicle is tied to these journies: " + "\n");
        
        for (int counter_num = 0; counter_num < journiesArray.length; counter_num++)
            if (journiesArray[counter_num].elementFilled == true)
            {
              System.out.println("    " + journiesArray[counter_num].toString());
            }
    }    
    
    
    //toString method for the vehicle class
    @Override
    public String toString()
    {
        String vehicleString;
        
        vehicleString = "Manufacturer: " + manufacturer + "\n";
        vehicleString += "Model: " + model;
        vehicleString += "Make Year: " + make_Year;
        vehicleString += "Kilometers: " + kilometers;
        vehicleString += "Number of Services: " + services;

        return vehicleString;
    }
}        

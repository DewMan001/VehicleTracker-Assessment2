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
public class Service
{
   public int addService(int Services, int currentServices)
   {
     int currentServices;
     currentServices = Vehicle.getService();

     int newTotal;
     newTotal = currentServices + 1;

     //setting the new figure as the vehicle's new number of services
     Car1.setServices(newTotal);
   }

   //method to compare the number of services the car has
   //and the number of services the car needs
   public void checkServices()
   {
     int currentJournies;


     int currentServices;
     currentServices = Vehicle.getService();

     double currentDistance;
     currentDistance = 0;
     currentDistance = Car1.getDistance;

     int servicesNeeded;
     servicesNeeded = currentDistance / 100;

     //checking if the vehicle has enough services
     if (servicesNeeded > currentServices)
     {
       System.out.println("Vehicle needs to be serviced before we can process
       +this request");

       if (journies = journies + 1)
       {
         System.out.println("Vehicle needs to be serviced before we can process this request");
       }

     }
   }
}


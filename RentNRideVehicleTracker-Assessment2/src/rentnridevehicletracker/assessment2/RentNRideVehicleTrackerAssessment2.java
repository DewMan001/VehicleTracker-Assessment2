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
public class RentNRideVehicleTrackerAssessment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //This is for git stuff
        
        
   
        Journey[] journey1 = new Journey[10];
        
        Journey journeyx = new Journey();
        
        journeyx.setCar("Holden HQ");
        journeyx.setStartLocation("Tuscon, Arizona");
        journeyx.setEndLocation("Las Vegas, Nevada");
        journeyx.setTotalDistance(360);
        journeyx.setUsedFuel(48);
        
        journey1[0] = journeyx;
        
        journey1[0].printJourney();
        
      
        
        System.out.println(" ");
        System.out.println(" ");
        
        Vehicle Car1 = new Vehicle();
        
        //setting up all of the variables
        Car1.setManufacturer("Holden");
        Car1.setModel("HQ");
        Car1.setServices(2);
        Car1.setMakeYear(1987);
        Car1.setKM(0.05);
        Car1.AddJourney(journey1[0]);
        
        //printing out the vehicle details
        Car1.printVehicle();
        
    }
    
}

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
        
        Vehicle Car1 = new Vehicle();
        
        //setting up all of the variables
        Car1.setManufacturer("Holden");
        Car1.setModel("DEFEAT");
        Car1.setServices(2);
        Car1.setMakeYear(2015);
        Car1.setKM(0.05);
        
        //printing out the vehicle details
        Car1.printVehicle();
    }
    
}

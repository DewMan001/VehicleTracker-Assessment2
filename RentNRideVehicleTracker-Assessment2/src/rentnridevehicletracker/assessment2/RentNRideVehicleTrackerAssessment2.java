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

        journeyx.setElementFilled(true);
        journeyx.setCar("Holden HQ");
        journeyx.setStartLocation("Tuscon, Arizona");
        journeyx.setEndLocation("Las Vegas, Nevada");
        journeyx.setTotalDistance(360);
        journeyx.setUsedFuel(48);

        Journey journeyZ = new Journey();

        journeyZ.setElementFilled(false);
        journeyZ.setCar("Mazda BallPit");
        journeyZ.setStartLocation("Perth, Australia");
        journeyZ.setEndLocation("Sydney, Australia");
        journeyZ.setTotalDistance(3938.1);
        journeyZ.setUsedFuel(48);

        journey1[0] = journeyx;

        journey1[1] = journeyZ;

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
        Car1.AddJourney(journey1[1]);
        
        
        //setting up a new kilometer rental
        dayRental JohnBeckham = new dayRental();
        
        //putting values into that new kilometer
        //based rental
        JohnBeckham.setRentalLength(4);
        JohnBeckham.setRentalVehicle(Car1);
        JohnBeckham.setRentalDistance(44.4);
        
        //adding the distance from the rental to the
        //set rental vehicle's distance
        JohnBeckham.addDistance();
        
        //printing out the vehicle details again to see
        //if it worked
        Car1.printVehicle();
        
        
        
        
    }
    
}

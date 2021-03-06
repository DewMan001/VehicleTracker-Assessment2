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
public class Journey {
    
    public boolean elementFilled;
    private String carUsed;
    private String startLocation;
    private String endLocation;
    private double totalDistance;
    private double usedFuel;
    
    //the channel through which you can set your own values
public void setElementFilled(boolean filled)
{
  elementFilled = filled;
}
    
public void setCar (String Car)
{
	carUsed = Car;	
}
public void setStartLocation (String StartPlace)
{
	startLocation = StartPlace;	
}
public void setEndLocation (String EndPlace)
{
	endLocation = EndPlace;	
}
public void setTotalDistance (double TotalDistance)
{
	totalDistance = TotalDistance;	
}
public void setUsedFuel (double UsedFuel)
{
	usedFuel = UsedFuel;	
}

//the channel through which you can retrieve your own values
public boolean getElementFilled()
{
  return elementFilled;
}

public String getCar()
{
	return carUsed;
}
public String getStartLocation()
{
	return startLocation;
}
public String getEndLocation()
{
	return endLocation;
}
public double getTotalDistance()
{
	return totalDistance;
}
public double getUsedFuel()
{
	return usedFuel;
}

    public void printJourney()
    {
        System.out.println("Car used: " + carUsed);
        System.out.println("Journey started at: " + startLocation);
        System.out.println("Journey ended at: " + endLocation);
        System.out.println("Total length of journey: " + totalDistance);
        System.out.println("Amount of fuel used: " + usedFuel);
        }

    @Override
    public String toString()
    {
      String journeyString;
      journeyString = "";
      
       journeyString = "Car used: " + carUsed + "\n";
       journeyString += "Journey started at: " + startLocation + "\n";
       journeyString += "Journey ended at: " + endLocation + "\n";
       journeyString += "Total length of journey: " + totalDistance + "\n";
       journeyString += "Amount of fuel used: " + usedFuel + "\n";
       
       return journeyString;
    }

}
    

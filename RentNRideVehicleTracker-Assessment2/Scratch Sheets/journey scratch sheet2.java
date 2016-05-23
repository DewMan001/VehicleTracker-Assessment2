private String carUsed;
private String startLocation;
private String endLocation;
private double totalDistance;
private double usedFuel;

//the channel through which you can set your own values
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
}

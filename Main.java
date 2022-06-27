import java.util.Scanner;

class Main 
{
	public static void main(String[] args) 
	{
    double RADIUS = 3963.1676;
    double latitude;
    double longtitude;
    double latitude2;
    double longtitude2;
    double distance;
    // Create a Scanner object to read input.
      Scanner console = new Scanner(System.in);

		//ask user for starting latitude and longitude for starting location
		System.out.println("hello! Enter the starting latitude for location 1: ");
    latitude = console.nextDouble();
    System.out.println("Enter the starting longtitude for location 1: ");
		longtitude = console.nextDouble();


		//Create starting GeoLocation Object
    GeoLocation location1 = new GeoLocation(latitude,longtitude);
	
		//ask user for ending latitude and longitude for starting location
		System.out.println("Next, Enter the ending latitude for location 2: ");
		latitude2= console.nextDouble();
    System.out.println("Lastly, Enter the ending lotitude for location 2:");
    longtitude2 = console.nextDouble();

		//Create ending GeoLocation Object
		GeoLocation location2 = new GeoLocation(latitude2, longtitude2);

    //Distance calculation
    location1.distanceFrom(location2);
    distance = location1.distanceFrom(location2);
    System.out.println("The distance is " + distance + " miles apart.");

	  	//print distance HINT: use end Object as argument
	  	
	}

/* A sample program run should match exactly as below:

Enter the latitude of the starting location: 48.8567
Enter the longitude of the starting location: 2.3508
Enter the latitude of the ending location: 51.5072
Enter the longitude of the ending location: 0.1275
The distance is 208.08639358288565 miles. */
}
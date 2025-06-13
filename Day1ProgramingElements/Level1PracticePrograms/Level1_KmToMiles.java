class KmToMiles {
    public static void main(String[] args) {
        // Define distance in kilometers
        double kilometers = 10.8;
        double milesPerKilometer = 0.621371;
        
        // Calculate distance in miles
        double miles = kilometers * milesPerKilometer;
        
        // Display result
        System.out.println("The distance " + kilometers + " km in miles is " + miles);
    }
}
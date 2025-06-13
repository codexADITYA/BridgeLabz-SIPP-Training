class EarthVolume {
    public static void main(String[] args) {
        // Define radius of Earth and conversion factor
        double earthRadiusKm = 6378.0;
        double kmToMiles = 0.621371;
        
        // Calculate volume in cubic kilometers
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(earthRadiusKm, 3);
        
        // Convert radius to miles and calculate volume in cubic miles
        double earthRadiusMiles = earthRadiusKm * kmToMiles;
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(earthRadiusMiles, 3);
        
        // Display result
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3);
    }
}
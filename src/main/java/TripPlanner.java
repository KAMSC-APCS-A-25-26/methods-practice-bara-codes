import java.util.Scanner;

public class TripPlanner {


    public static double calculateTravelTime(double distance, double averageSpeed) {
        return distance / averageSpeed;
    }


    public static double calculateFuelNeeded(double distance, double fuelEfficiency) {
        return distance / fuelEfficiency;
    }

    // Calculates and returns the total trip cost
    public static double calculateTripCost(double fuelNeeded, double fuelPrice) {
        return fuelNeeded * fuelPrice;
    }


    public static void displayResults(double travelTime, double fuelNeeded, double tripCost) {
        System.out.println("\nResults:");
        System.out.printf("Travel Time: %.2f hours%n", travelTime);
        System.out.printf("Fuel Needed: %.2f gallons%n", fuelNeeded);
        System.out.printf("Trip Cost: $%.2f%n", tripCost);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter trip distance (miles): ");
        double distance = scanner.nextDouble();

        System.out.print("Enter average speed (mph): ");
        double averageSpeed = scanner.nextDouble();

        System.out.print("Enter fuel efficiency (miles per gallon): ");
        double fuelEfficiency = scanner.nextDouble();

        System.out.print("Enter fuel price per gallon ($): ");
        double fuelPrice = scanner.nextDouble();


        double travelTime = calculateTravelTime(distance, averageSpeed);
        double fuelNeeded = calculateFuelNeeded(distance, fuelEfficiency);
        double tripCost = calculateTripCost(fuelNeeded, fuelPrice);


        displayResults(travelTime, fuelNeeded, tripCost);


        scanner.close();
    }
}
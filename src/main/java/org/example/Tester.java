package org.example;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        House house = new House();

        // Get values from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of floors: ");
        int floorsNumber = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter the address: ");
        String address = scanner.nextLine();

        System.out.print("Enter the names of residents separated by comma: ");
        String residentsInput = scanner.nextLine();
        String[] residentsNames = residentsInput.split(",");

        // Set the values using setters
        house.setFloorsNumber(floorsNumber);
        house.setAddress(address);
        house.setResidentsNames(residentsNames);

        // Print the house details
        String houseDetails = String.format("House Details:%nFloors: %d%nAddress: %s%nResidents: %s",
                house.getFloorsNumber(), house.getAddress(), String.join(", ", house.getResidentsNames()));
        System.out.println(houseDetails);
    }
}

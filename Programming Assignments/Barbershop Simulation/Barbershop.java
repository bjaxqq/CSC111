import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Barbershop {
    public static void main(String[] args) {
        int numChairs = 3; // Number of available chairs
        Queue<Customer> arrivalQueue = new LinkedList<>(); // Queue to hold arriving customers
        Queue<Customer> waitingQueue = new LinkedList<>(); // Circular queue to hold waiting customers

        // Read customer data from file
        List<Customer> customers = readCustomerData("CustomerData.txt");

        int currentTime = 0;
        System.out.println("--------------------Configuration: <Default>--------------------");
        System.out.println("Opening and reading CustomerData.txt");
        System.out.println("Finished reading file");
        System.out.println("Time = " + currentTime);
        System.out.println("Barber takes a break");
        System.out.println("Chairs are empty");
        System.out.println("Barber's chair is empty");

        while (!customers.isEmpty() || !arrivalQueue.isEmpty() || !waitingQueue.isEmpty()) {
            currentTime++;
            // Process arriving customers
            while (!customers.isEmpty() && customers.get(0).getArrivalTime() == currentTime) {
                Customer customer = customers.remove(0);
                arrivalQueue.add(customer);
                System.out.println("------------------------------");
                System.out.println("Time = " + currentTime);
                System.out.println("Arrival List");
                System.out.println(" " + customer.getName() + ": arrival = " + customer.getArrivalTime() +
                        ": service = " + customer.getServiceTime());
            }

            // Process customer service
            if (!arrivalQueue.isEmpty()) {
                System.out.println("------------------------------");
                System.out.println("Time = " + currentTime);
                Customer customer = arrivalQueue.poll();

                if (waitingQueue.size() < numChairs) {
                    waitingQueue.add(customer);
                    System.out.println("A chair is available");
                    System.out.println(" " + customer.getName() + " sits");
                } else {
                    System.out.println("All chairs are full");
                    System.out.println(" " + customer.getName() + " leaves");
                }
            }

            // Process waiting customers
            if (!waitingQueue.isEmpty()) {
                Customer customer = waitingQueue.poll();
                System.out.println("------------------------------");
                System.out.println("Time = " + currentTime);
                System.out.println("Chairs");

                for (Customer waitingCustomer : waitingQueue) {
                    System.out.println(
                            " " + waitingCustomer.getName() + ": arrival = " + waitingCustomer.getArrivalTime() +
                                    ": service = " + waitingCustomer.getServiceTime());
                }

                System.out.println("Barber");
                System.out.println(" " + customer.getName() + " is chair " + waitingQueue.size() + " left");
            }

            try {
                Thread.sleep(1000); // Delay for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("------------------------------");
        System.out.println("Process completed.");
    }

    private static List<Customer> readCustomerData(String filename) {
        List<Customer> customers = new ArrayList<>();

        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(" ");

                if (parts.length == 3) {
                    int arrivalTime = Integer.parseInt(parts[0]);
                    int serviceTime = Integer.parseInt(parts[1]);
                    String name = parts[2];
                    customers.add(new Customer(arrivalTime, serviceTime, name));
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return customers;
    }
}
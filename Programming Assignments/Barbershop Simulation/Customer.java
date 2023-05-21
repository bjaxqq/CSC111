public class Customer {
    private int arrivalTime;
    private int serviceTime;
    private String name;

    public Customer(int arrivalTime, int serviceTime, String name) {
        this.arrivalTime = arrivalTime;
        this.serviceTime = serviceTime;
        this.name = name;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public int getServiceTime() {
        return serviceTime;
    }

    public String getName() {
        return name;
    }
}
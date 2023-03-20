public abstract class Vehicle {
private String _manufacturer;
public abstract void move();
public String getManufacturer() {...}
}
public class Car extends Vehicle {
protected java.awt.Color _color;
}
public class SportsCar extends Car implements NoiseMaker {
public void move() {...}
public void makeNoise() {...}
}
public class Bus extends Vehicle {
private int _numberOfPassengers;
public void move() {...}
}
public class RaceTrack {
private Car _car1, _car2;
public RaceTrack(Car car1, Car car2) {...}
public Car startRace() {...}
}
public class TrafficCop implements NoiseMaker {
public void writeTicket(Vehicle v) {...}
public void makeNoise() {...}
}
public interface NoiseMaker {
void makeNoise();
}
import java.util.Random;

public class Monster {
    private double strength;
    private double health;
    
    // Constructor
    public Monster(double strength, double health) {
        this.strength = strength;
        this.health = health;
    }
    
    // Getters
    public double getHealth() {
        return health;
    }
    
    // Helper methods
    public boolean isAlive() {
        return health > 0;
    }
    
    public double attack() {
        Random random = new Random();
        return random.nextDouble() * strength;
    }
    
    public void takeDamage(double damage) {
        health -= damage;
    }
}
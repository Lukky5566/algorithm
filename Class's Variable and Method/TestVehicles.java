/**
 * Abstract class representing a Vehicle.
 */
abstract class Vehicle {
    protected String brand;
    protected String color;
    protected float currentSpeed;
    protected float maxSpeed;

    public Vehicle(String brand, String color, float maxSpeed) {
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public abstract void accelerate();

    public abstract void deaccelerate();
}

/**
 * Class representing a Car that extends Vehicle.
 */
class Car extends Vehicle {
    private float fuel;
    private float maxFuel;
    private float fuelPerKM;

    public Car(String brand, String color, float maxSpeed, float maxFuel, float fuelPerKM) {
        super(brand, color, maxSpeed);
        this.maxFuel = maxFuel;
        this.fuel = maxFuel; // Car starts with a full tank
        this.fuelPerKM = fuelPerKM;
    }

    @Override
    public void accelerate() {
        if (currentSpeed < maxSpeed) {
            currentSpeed += 1;
        }
    }

    @Override
    public void deaccelerate() {
        if (currentSpeed > 0) {
            currentSpeed -= 1;
        }
    }

    /**
     * Drive the car for a specified number of minutes.
     * @param minutes Number of minutes to drive.
     */
    public void drive(float minutes) {
        float distance = (currentSpeed / 60) * minutes;
        float requiredFuel = distance * fuelPerKM;

        if (fuel >= requiredFuel) {
            fuel -= requiredFuel;
            System.out.println("Drove for " + minutes + " minutes.");
        } else {
            System.out.println("Not enough fuel to drive.");
        }
    }

    /**
     * Add fuel to the car.
     * @param fuelAmount Amount of fuel to add.
     */
    public void addFuel(float fuelAmount) {
        if (fuel + fuelAmount > maxFuel) {
            fuel = maxFuel;
        } else {
            fuel += fuelAmount;
        }
    }

    public float getFuel() {
        return fuel;
    }
}

/**
 * Class representing a Boat that extends Vehicle.
 */
abstract class Boat extends Vehicle {
    public Boat(String brand, String color, float maxSpeed) {
        super(brand, color, maxSpeed);
    }
}

/**
 * Class representing a Speedboat that extends Boat.
 */
class Speedboat extends Boat {
    public Speedboat(String brand, String color, float maxSpeed) {
        super(brand, color, maxSpeed);
    }

    @Override
    public void accelerate() {
        if (currentSpeed + 5 <= maxSpeed) {
            currentSpeed += 5;
        }
    }

    @Override
    public void deaccelerate() {
        if (currentSpeed >= 5) {
            currentSpeed -= 5;
        }
    }
}

/**
 * Class representing a Fishing Boat that extends Boat.
 */
class FishingBoat extends Boat {
    private int numberOfFish;

    public FishingBoat(String brand, String color, float maxSpeed) {
        super(brand, color, maxSpeed);
        this.numberOfFish = 0;
    }

    /**
     * Catch a specified number of fish.
     * @param n Number of fish to catch.
     */
    public void fishing(int n) {
        numberOfFish += n;
    }

    /**
     * Sell a specified number of fish.
     * @param n Number of fish to sell.
     */
    public void sellFish(int n) {
        if (n <= numberOfFish) {
            numberOfFish -= n;
        } else {
            System.out.println("Not enough fish to sell.");
        }
    }

    public int getNumberOfFish() {
        return numberOfFish;
    }

    @Override
    public void accelerate() {
        if (currentSpeed < maxSpeed) {
            currentSpeed += 1;
        }
    }

    @Override
    public void deaccelerate() {
        if (currentSpeed > 0) {
            currentSpeed -= 1;
        }
    }
}

/**
 * Test class for the Vehicle hierarchy.
 */
public class TestVehicles {
    public static void main(String[] args) {
        // Test Car
        Car car = new Car("Toyota", "Red", 200, 50, 0.2f);
        car.accelerate();
        car.drive(30);
        car.addFuel(10);
        car.drive(60);

        // Test Speedboat
        Speedboat speedboat = new Speedboat("Yamaha", "Blue", 100);
        speedboat.accelerate();
        System.out.println("Speedboat speed: " + speedboat.currentSpeed);

        // Test FishingBoat
        FishingBoat fishingBoat = new FishingBoat("Fisher", "White", 50);
        fishingBoat.fishing(10);
        fishingBoat.sellFish(5);
        fishingBoat.sellFish(10);
        System.out.println("Remaining fish: " + fishingBoat.getNumberOfFish());
    }
}

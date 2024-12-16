public class Car {
    private String brand;
    private String color;
    private float currentSpeed;
    private float maxSpeed;
    private float fuel;
    private float maxFuel;
    private float fuelPerKM;

    public Car(String brand, String color, float maxSpeed, float maxFuel, float fuelPerKM) {
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.maxFuel = maxFuel;
        this.fuelPerKM = fuelPerKM;
        this.currentSpeed = 0;
        this.fuel = maxFuel;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public void accelerate() {
        if (currentSpeed < maxSpeed) {
            currentSpeed++;
        } else {
            System.out.println("ความเร็วถึงขีดจำกัดแล้ว!");
        }
    }

    public void deaccelerate() {
        if (currentSpeed > 0) {
            currentSpeed--;
        } else {
            System.out.println("รถหยุดนิ่งแล้ว!");
        }
    }

    public void drive(float minute) {
        float distance = (currentSpeed * (minute / 60));
        float requiredFuel = distance * fuelPerKM;

        if (fuel >= requiredFuel) {
            fuel -= requiredFuel;
            System.out.printf("ขับรถได้ %.2f กม. น้ำมันคงเหลือ: %.2f ลิตร\n", distance, fuel);
        } else {
            System.out.println("น้ำมันไม่พอที่จะขับได้ในระยะเวลานี้!");
        }
    }
    public void addFuel(float additionalFuel) {
        if (fuel + additionalFuel <= maxFuel) {
            fuel += additionalFuel;
            System.out.printf("เติมน้ำมันสำเร็จ! น้ำมันคงเหลือ: %.2f ลิตร\n", fuel);
        } else {
            fuel = maxFuel;
            System.out.printf("น้ำมันเต็มถังแล้ว! น้ำมันคงเหลือ: %.2f ลิตร\n", fuel);
        }
    }

    public void showStatus() {
        System.out.printf("แบรนด์: %s, สี: %s, ความเร็ว: %.2f km/hr, น้ำมัน: %.2f ลิตร\n", 
                          brand, color, currentSpeed, fuel);
    }

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Red", 180, 50, 0.15f);

        myCar.showStatus();
        myCar.accelerate();
        myCar.drive(30);
        myCar.addFuel(10);
        myCar.deaccelerate();
        myCar.showStatus();
    }
} 

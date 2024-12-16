public class Running {
    private double totalDistance;
    private double totalCal; 
    private final double weight;
    private double speed;

    // Constructor
    public Running(double weight) {
        this.weight = weight;
        this.speed = 0.0;
        this.totalDistance = 0;
        this.totalCal = 0;
    }

    public double getTotalDistance() {
        return totalDistance;
    }

    public double getTotalCal() {
        return totalCal;
    }

    public double getSpeed() {
        return speed;
    }

    public void increaseSpeed() {
        speed += 0.1;
        System.out.printf("เพิ่มความเร็ว: %.1f km/hr\n", speed);
    }

    public void decreaseSpeed() {
        if (speed >= 0.1) {
            speed -= 0.1;
            System.out.printf("ลดความเร็ว: %.1f km/hr\n", speed);
        } else {
            System.out.println("ไม่สามารถลดความเร็วต่ำกว่า 0 ได้!");
        }
    }

    public void run(int minutes) {
        if (minutes <= 0) {
            System.out.println("กรุณากรอกเวลาที่มากกว่า 0!");
            return;
        }

        double distance = (speed / 60) * minutes;
        totalDistance += distance;

        double calBurned = speed * 3.5 * weight / 200 * minutes;
        totalCal += calBurned;

        System.out.printf("คุณวิ่งไป %.2f กิโลเมตร และเผาผลาญ %.2f แคลอรี่\n", distance, calBurned);
    }

    public static void main(String[] args) {
        Running runner = new Running(70);

        runner.increaseSpeed();
        runner.increaseSpeed();
        runner.run(10);
        runner.decreaseSpeed();
        runner.run(5);
        runner.decreaseSpeed();
        runner.decreaseSpeed();

        System.out.printf("ระยะทางสะสม: %.2f กิโลเมตร\n", runner.getTotalDistance());
        System.out.printf("แคลอรี่ที่เผาผลาญสะสม: %.2f กิโลแคลอรี่\n", runner.getTotalCal());
    }
}

public class ElonsToyCar {
    private int distance = 0;
    private int battery = 100;

    public int getDistance() {
        return this.distance;
    }
    public int getBattery() {
        return this.battery;
    }
    public void setDistance(int distance) {
        this.distance = distance;
    }
    public void setBattery(int battery) {
        this.battery = battery;
    }

    public static ElonsToyCar buy() {
        return new ElonsToyCar(); // Create una nueva instancia de la clase
    }

    public String distanceDisplay() {
        return "Driven "+this.getDistance()+" meters";
    }

    public String batteryDisplay() {
        return (this.battery != 0) ? "Battery at "+this.getBattery()+"%" : "Battery empty";
    }

    public void drive() {
        if (this.getBattery() == 0) return;
        int defautlDrive = 20;
        int defautlBatteryUsage = 1;
        
        this.setDistance(this.getDistance() + defautlDrive);
        this.setBattery(this.getBattery() - defautlBatteryUsage);
    }
}

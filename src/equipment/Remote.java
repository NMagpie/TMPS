package equipment;

public class Remote {

    private Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public void turnOn() {
        this.device.turnOn();
    }

    public void turnOff() {
        this.device.turnOff();
    }

    public Device getDevice() {
        return device;
    }
}

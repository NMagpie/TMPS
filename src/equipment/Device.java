package equipment;

public abstract class Device {

    private String name = "LG";

    private boolean turnedOn = false;

    public Device() {
    }

    public Device(String name) {
        this.name = name;
    }

    public void turnOn() {
        this.turnedOn = true;
        System.out.println("The " + this.getClass().getSimpleName() + " named " + name + " was turned on!\n");
    }

    public void turnOff() {
        this.turnedOn = false;
        System.out.println("The " + this.getClass().getSimpleName() + " named " + name + " was turned off!\n");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public abstract class Device {
    protected String name;
    protected boolean isOn;

    public Device(String name) {
        this.name = name;
        this.isOn = false;
    }

    public abstract void turnOn();
    public abstract void turnOff();
    public boolean isOn() { return isOn; }
    public String getName() { return name; }
}

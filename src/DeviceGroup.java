import java.util.ArrayList;
import java.util.List;

public class DeviceGroup extends Device {
    private List<Device> devices;

    public DeviceGroup(String name) {
        super(name);
        this.devices = new ArrayList<>();
    }

    public void addDevice(Device device) {
        devices.add(device);
    }

    public void removeDevice(Device device) {
        devices.remove(device);
    }

    @Override
    public void turnOn() {
        devices.forEach(Device::turnOn);
        System.out.println(name + " Group is turned on");
    }

    @Override
    public void turnOff() {
        devices.forEach(Device::turnOff);
        System.out.println(name + " Group is turned off");
    }
}

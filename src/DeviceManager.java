import java.util.ArrayList;
import java.util.List;

public class DeviceManager {
    private static DeviceManager instance;
    private List<Device> devices;

    private DeviceManager() {
        devices = new ArrayList<>();
    }

    public static synchronized DeviceManager getInstance() {
        if (instance == null) {
            instance = new DeviceManager();
        }
        return instance;
    }

    public void addDevice(Device device) {
        devices.add(device);
    }

    public void removeDevice(Device device) {
        devices.remove(device);
    }

    public void turnAllOn() {
        devices.forEach(Device::turnOn);
    }

    public void turnAllOff() {
        devices.forEach(Device::turnOff);
    }

    public List<Device> getDevices() {
        return devices;
    }
}

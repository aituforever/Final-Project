public class Main {

    public static void main(String[] args) {
        DeviceManager manager = DeviceManager.getInstance();

        DeviceView view = new DeviceView(manager);

        // Examples
        Light light1 = new Light.Builder().setName("Living Room Light").setBrightness(80).build();
        Thermostat thermostat1 = new Thermostat.Builder().setName("Bedroom Thermostat").setTemperature(22).build();

        manager.addDevice(light1);
        manager.addDevice(thermostat1);

        // UI
        view.userInteraction();
    }
}

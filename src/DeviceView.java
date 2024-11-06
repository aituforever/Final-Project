import java.util.Scanner;

public class DeviceView {

    private DeviceManager deviceManager;

    public DeviceView(DeviceManager deviceManager) {
        this.deviceManager = deviceManager;
    }

    public void displayMainMenu() {
        System.out.println("------ Device Control System ------");
        System.out.println("1. Turn On All Devices");
        System.out.println("2. Turn Off All Devices");
        System.out.println("3. View Devices Status");
        System.out.println("4. Add Device");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");
    }

    public void showDeviceStatus() {
        System.out.println("------ Device Status ------");
        for (Device device : deviceManager.getDevices()) {
            System.out.println(device.getName() + " is " + (device.isOn() ? "ON" : "OFF"));
        }
    }

    public void addDeviceMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select Device Type to Add:");
        System.out.println("1. Light");
        System.out.println("2. Thermostat");
        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        if (choice == 1) {
            System.out.print("Enter Light Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Brightness (0-100): ");
            int brightness = scanner.nextInt();
            Light light = new Light.Builder().setName(name).setBrightness(brightness).build();
            deviceManager.addDevice(light);
            System.out.println(name + " Light added successfully!");
        } else if (choice == 2) {
            System.out.print("Enter Thermostat Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Temperature: ");
            int temp = scanner.nextInt();
            Thermostat thermostat = new Thermostat.Builder().setName(name).setTemperature(temp).build();
            deviceManager.addDevice(thermostat);
            System.out.println(name + " Thermostat added successfully!");
        } else {
            System.out.println("Invalid choice!");
        }
    }

    public void userInteraction() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            displayMainMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    deviceManager.turnAllOn();
                    break;
                case 2:
                    deviceManager.turnAllOff();
                    break;
                case 3:
                    showDeviceStatus();
                    break;
                case 4:
                    addDeviceMenu();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
                    break;
            }
        }
    }
}

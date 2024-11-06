public class Thermostat extends Device {
    private int temperature;

    private Thermostat(String name, int temperature) {
        super(name);
        this.temperature = temperature;
    }

    public void turnOn() {
        isOn = true;
        System.out.println(name + " Thermostat is set to " + temperature + "°C");
    }

    public void turnOff() {
        isOn = false;
        System.out.println(name + " Thermostat is turned off");
    }

    public static class Builder {
        private String name;
        private int temperature = 22;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setTemperature(int temperature) {
            this.temperature = temperature;
            return this;
        }

        public Thermostat build() {
            return new Thermostat(name, temperature);
        }
    }
}

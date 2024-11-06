public class Light extends Device {
    private int brightness;

    private Light(String name, int brightness) {
        super(name);
        this.brightness = brightness;
    }

    public void turnOn() {
        isOn = true;
        System.out.println(name + " Light is turned on with brightness " + brightness);
    }

    public void turnOff() {
        isOn = false;
        System.out.println(name + " Light is turned off");
    }

    public static class Builder {
        private String name;
        private int brightness = 50;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setBrightness(int brightness) {
            this.brightness = brightness;
            return this;
        }

        public Light build() {
            return new Light(name, brightness);
        }
    }
}

abstract class SmartDevice {
    String deviceId;
    String location;

    SmartDevice(String deviceId, String location) {
        this.deviceId = deviceId;
        this.location = location;
    }

    void turnOn() {
        System.out.println(deviceId + " in " + location + " is turned ON.");
    }

    void turnOff() {
        System.out.println(deviceId + " in " + location + " is turned OFF.");
    }

    abstract void performAction();
}

interface VoiceControllable {
    void voiceCommand(String cmd);
}

interface PowerSavable {
    void enablePowerSaving();
}

interface NetworkConnected {
    void connectWiFi(String ssid);
}

class SmartSpeaker extends SmartDevice implements VoiceControllable, NetworkConnected {
    SmartSpeaker(String deviceId, String location) {
        super(deviceId, location);
    }

    @Override
    void performAction() {
        System.out.println(deviceId + " is playing audio playlist.");
    }

    @Override
    public void voiceCommand(String cmd) {
        System.out.println("Processing voice command: \"" + cmd + "\" on " + deviceId);
    }

    @Override
    public void connectWiFi(String ssid) {
        System.out.println(deviceId + " connected to WiFi network: " + ssid);
    }
}

class SmartAirConditioner extends SmartDevice implements VoiceControllable, PowerSavable, NetworkConnected {
    int temperature;

    SmartAirConditioner(String deviceId, String location, int temperature) {
        super(deviceId, location);
        this.temperature = temperature;
    }

    @Override
    void performAction() {
        System.out.println(deviceId + " cooling room to " + temperature + " C.");
    }

    @Override
    public void voiceCommand(String cmd) {
        System.out.println("AC voice command executed: \"" + cmd + "\"");
    }

    @Override
    public void enablePowerSaving() {
        System.out.println(deviceId + " Eco-mode enabled. Power consumption reduced by 30%.");
    }

    @Override
    public void connectWiFi(String ssid) {
        System.out.println(deviceId + " connected to WiFi: " + ssid);
    }
}

public class SmartHomeSystem {
    public static void main(String[] args) {
        SmartSpeaker speaker = new SmartSpeaker("Echo-01", "Living Room");
        speaker.turnOn();
        speaker.connectWiFi("HomeNet_5G");
        speaker.voiceCommand("Play jazz music");
        speaker.performAction();
        speaker.turnOff();

        System.out.println();

        SmartAirConditioner ac = new SmartAirConditioner("AC-02", "Bedroom", 22);
        ac.turnOn();
        ac.connectWiFi("HomeNet_5G");
        ac.performAction();
        ac.enablePowerSaving();
        ac.turnOff();
    }
}

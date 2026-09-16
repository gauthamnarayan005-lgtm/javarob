class Device {
    String brand;
    String model;

    Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    void showDevice() {
        System.out.println("Device: " + brand + " " + model);
    }
}

interface Camera {
    void takePhoto();
    void recordVideo();
}

interface MusicPlayer {
    void playMusic(String song);
    void pauseMusic();
}

interface GPS {
    void navigateTo(String location);
}

class SmartPhone extends Device implements Camera, MusicPlayer, GPS {
    SmartPhone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void takePhoto() {
        System.out.println("Taking high resolution photo");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording 4K video");
    }

    @Override
    public void playMusic(String song) {
        System.out.println("Playing song: " + song);
    }

    @Override
    public void pauseMusic() {
        System.out.println("Music paused");
    }

    @Override
    public void navigateTo(String location) {
        System.out.println("Navigating to: " + location);
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone("Apple", "iPhone 15");
        phone.showDevice();

        Camera cam = phone;
        cam.takePhoto();
        cam.recordVideo();

        MusicPlayer player = phone;
        player.playMusic("Shape of You");
        player.pauseMusic();

        GPS gps = phone;
        gps.navigateTo("City Center");
    }
}

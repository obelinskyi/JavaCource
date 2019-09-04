package designpatterns.c02_strategy;

public class BasicCameraApp extends PhoneCameraApp{

    public BasicCameraApp() {
        this.setShareStrategy(new ShareByTextAndEmail());
    }

    void edit() {
        System.out.println("Edit in BasicCameraApp");
    }
}

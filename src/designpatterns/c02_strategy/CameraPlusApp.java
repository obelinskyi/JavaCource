package designpatterns.c02_strategy;

public class CameraPlusApp extends PhoneCameraApp{

    public CameraPlusApp() {
        this.setShareStrategy(new ShareBySocialMedia());
    }

    void edit() {
        System.out.println("Edit in CameraPlusApp");
    }
}

package designpatterns.c02_strategy;

public abstract class PhoneCameraApp {
    private ShareStrategy shareStrategy;

    public ShareStrategy getShareStrategy() {
        return shareStrategy;
    }

    public void setShareStrategy(ShareStrategy shareStrategy) {
        this.shareStrategy = shareStrategy;
    }

    void take() {
        System.out.println("take()");
    }

    abstract void edit();

    void save() {
        System.out.println("save()");
    }

    void share() {
        this.shareStrategy.share();
    }
}

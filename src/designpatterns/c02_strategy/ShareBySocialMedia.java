package designpatterns.c02_strategy;

public class ShareBySocialMedia implements ShareStrategy {
    public void share() {
        System.out.println("Share through social media");
    }
}

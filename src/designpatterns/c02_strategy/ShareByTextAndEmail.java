package designpatterns.c02_strategy;

public class ShareByTextAndEmail implements ShareStrategy {
    public void share() {
        System.out.println("Share through text and email");
    }
}

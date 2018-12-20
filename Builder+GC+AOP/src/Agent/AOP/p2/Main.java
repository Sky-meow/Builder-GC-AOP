package Agent.AOP.p2;

public class Main {
    public static void main(String[] args) {
        Sleepable g = new Girl();
        g.sleep();

        System.out.println("==============");

        Sleepable gp = new GirlProxy(g);
        gp.sleep();
    }
}

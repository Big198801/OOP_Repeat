import Classes.Market;
import Classes.OrdinaryClient;
import Classes.SpecialClient;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello world");

        Market market = new Market();
        OrdinaryClient client1 = new OrdinaryClient("Boris");
        OrdinaryClient client2 = new OrdinaryClient("Dasha");
        market.acceptToMarket(client1);
        market.acceptToMarket(client2);
        SpecialClient vipClient1 = new SpecialClient("Oleg", 1);
        market.acceptToMarket(vipClient1);
    }
}

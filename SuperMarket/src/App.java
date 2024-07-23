import Classes.Market;
import Classes.OrdinaryClient;
import Classes.PromotionClient;
import Classes.SpecialClient;
import Interfaces.iActorBehaviour;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello world");

//        Market market = new Market();
//        OrdinaryClient client1 = new OrdinaryClient("Boris");
//        OrdinaryClient client2 = new OrdinaryClient("Dasha");
//        SpecialClient vipClient1 = new SpecialClient("Oleg", 1);
//        //SpecialClient vipClient2 = new SpecialClient("Leslie" , 11);
//        market.acceptToMarket(client1);
//        market.acceptToMarket(client2);
//        market.acceptToMarket(vipClient1);
//        //market.acceptToMarket(vipClient2);
//        market.update();

        Market market = new Market();
        iActorBehaviour item1 = new OrdinaryClient("Boris");
        iActorBehaviour item2 = new SpecialClient("Fedor", 1000);
        iActorBehaviour item3 = new OrdinaryClient("Dasha");
        iActorBehaviour item4 = new PromotionClient("promo1");
        iActorBehaviour item5 = new PromotionClient("promo2");
        iActorBehaviour item6 = new PromotionClient("promo3");
        iActorBehaviour item7 = new PromotionClient("promo4");
        market.acceptToMarket(item1);
        market.acceptToMarket(item4);
        market.acceptToMarket(item5);
        market.acceptToMarket(item6);
        market.acceptToMarket(item7);
        market.update();

    }
}

package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iMarketBehaviour;
import Interfaces.iPromotionInfo;
import Interfaces.iQueueBehaviour;
import java.util.ArrayList;
import java.util.List;

public class Market implements iMarketBehaviour, iQueueBehaviour, iPromotionInfo {
    private List<iActorBehaviour> queue;
    private final int maxPromoClients = 2;
    private final String currentPromoName = "-10%";


    public Market(){
        this.queue = new ArrayList<iActorBehaviour>();
    }

    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        //this.queue.add(actor);
        if (actor.getActor().isPromoClient){
            System.out.println(actor.getActor().getName() + " пришел в магазин по акции: "+ currentPromoName);
            takeInQueue(actor);
        } else {
            System.out.println(actor.getActor().getName() + " пришел в магазин");
            takeInQueue(actor);
        }
    }



    @Override
    public void takeInQueue(iActorBehaviour actor) {
        if(actor.getActor().isPromoClient){
            if(actor.getActor().getCurrentClientCount() > getMaxPromoClients()){
                System.out.println(actor.getActor().getName() + " !!! Акционные места отсутствуют.");

            }else {
                this.queue.add(actor);
                System.out.println(actor.getActor().getName() + " Акционный клиент добавлен в очередь");
            }

        }
        else {
            this.queue.add(actor);
            System.out.println(actor.getActor().getName() + " добавлен в очередь");
        }

    }



    @Override
    public void takeOrder() {
        for (iActorBehaviour actor :
                queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName() + "клиент сделал заказ");

            }
    }}

    @Override
    public void giveOrder() {
        for (iActorBehaviour actor: queue){
            if (actor.isMakeOrder()){
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName() + "клиент получил свой заказ");
            }
        }
    }
    @Override
    public void releasefromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehaviour actor :
                queue) {
            if (actor.isTakeOrder()){
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName() + "клиент ушел из очереди");
            }


        }releaseFromMarket(releaseActors);

    }
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor: actors){
            System.out.println(actor.getActor().getName() +" клиент ушел из магазина");
            this.queue.remove(actor);
        }
    }


    @Override
    public void promoName() {

    }

    @Override
    public int getMaxPromoClients() {
        return this.maxPromoClients;
    }

    public String getCurrentPromoName() {
        return currentPromoName;
    }
    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releasefromQueue();

    }
}

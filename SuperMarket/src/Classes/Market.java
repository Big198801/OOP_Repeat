package Classes;

import Interfaces.iMarketBehaviour;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Market implements iMarketBehaviour {
    private List<Actor> queue;

    public Market(){
        this.queue = new ArrayList<Actor>();
    }

    @Override
    public void acceptToMarket(Actor actor) {
        this.queue.add(actor);
        System.out.println(actor.getName() + " пришел в магазин");
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor: actors){
            System.out.println(actor.getName() +" клиент ушел из магазина");
            this.queue.remove(actor);
        }
    }

    @Override
    public void update() {

    }
}

package Interfaces;

import Classes.Actor;

public interface iQueueBehaviour {
    void takeInQueue(Actor actor);
    void releasefromQueue();
    void  takeOrder();
    void  giveOrder();

}

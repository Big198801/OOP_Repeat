package Interfaces;

import Classes.Actor;

public interface iQueueBehaviour {
    void takeInQueue(iActorBehaviour actor);
    void releasefromQueue();
    void  takeOrder();
    void  giveOrder();

}
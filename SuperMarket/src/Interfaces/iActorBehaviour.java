package Interfaces;

import Classes.Actor;

public interface iActorBehaviour {
    void setMakeOrder(boolean MakeOrder);
    void setTakeOrder(boolean pickUpOrder);
    boolean isMakeOrder();
    boolean isTakeOrder();



    Actor getActor();
}

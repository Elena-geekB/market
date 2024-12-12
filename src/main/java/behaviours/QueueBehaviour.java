package behaviours;

import actors.Actor;

public interface QueueBehaviour {
    void addToQueue(Actor actor);
    void removeFromQueue();
    void takeOrder(Actor actor);
    void giveOrder(Actor actor);
}

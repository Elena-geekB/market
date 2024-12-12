package behaviours;

import actors.Actor;

public interface MarketBehaviour {
    void acceptToMarket(Actor actor);
    void releaseFromMarket(Actor actor);

    void customerArrives(Actor actor);

    void customerLeaves(Actor actor);

    // Метод для обновления состояния магазина
    void update();
}

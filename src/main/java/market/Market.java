package market;

import actors.Actor;
import behaviours.MarketBehaviour;
import behaviours.QueueBehaviour;

import java.util.LinkedList;
import java.util.Queue;

public class Market implements QueueBehaviour, MarketBehaviour {
    private Queue<Actor> queue;

    public Market() {
        this.queue = new LinkedList<>();
    }

    // Метод для добавления клиента в магазин
    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " arrives at the market.");
        addToQueue(actor);
    }

    // Метод для удаления клиента из магазина
    @Override
    public void releaseFromMarket(Actor actor) {
        System.out.println(actor.getName() + " leaves the market.");
        removeFromQueue();
    }

    // Метод для добавления клиента в очередь
    @Override
    public void addToQueue(Actor actor) {
        queue.add(actor);
        System.out.println(actor.getName() + " added to the queue.");
    }

    // Метод для удаления клиента из очереди
    @Override
    public void removeFromQueue() {
        if (!queue.isEmpty()) {
            Actor actor = queue.poll();
            System.out.println(actor.getName() + " removed from the queue.");
        } else {
            System.out.println("Queue is empty.");
        }
    }

    // Метод для принятия заказа
    @Override
    public void takeOrder(Actor actor) {
        actor.setReadyToMakeOrder(true);
        System.out.println(actor.getName() + " is ready to make an order.");
    }

    // Метод для выдачи заказа
    @Override
    public void giveOrder(Actor actor) {
        actor.setReceivedOrder(true);
        System.out.println(actor.getName() + " has received their order.");
    }

    @Override
    public void customerArrives(Actor actor) {
        acceptToMarket(actor);
    }

    @Override
    public void customerLeaves(Actor actor) {
        releaseFromMarket(actor);
    }

    // Метод для обновления состояния магазина
    @Override
    public void update() {
        if (!queue.isEmpty()) {
            Actor actor = queue.peek();
            if (!actor.isReadyToMakeOrder()) {
                takeOrder(actor);
            } else if (!actor.hasReceivedOrder()) {
                giveOrder(actor);
            } else {
                releaseFromMarket(actor);
            }
        }
    }
}

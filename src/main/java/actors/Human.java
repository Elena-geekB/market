package actors;

public class Human extends Actor {
    public Human(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Human{name='" + getName() + "', readyToMakeOrder=" + isReadyToMakeOrder() +
                ", receivedOrder=" + hasReceivedOrder() + "}";
    }
}

package actors;

public abstract class Actor implements ActorBehaviour {
    private String name;
    private boolean readyToMakeOrder;
    private boolean receivedOrder;

    public Actor(String name) {
        this.name = name;
        this.readyToMakeOrder = false;
        this.receivedOrder = false;
    }

    public String getName() {
        return name;
    }

    @Override
    public void setReadyToMakeOrder(boolean ready) {
        this.readyToMakeOrder = ready;
    }

    @Override
    public void setReceivedOrder(boolean received) {
        this.receivedOrder = received;
    }

    @Override
    public boolean isReadyToMakeOrder() {
        return readyToMakeOrder;
    }

    @Override
    public boolean hasReceivedOrder() {
        return receivedOrder;
    }
}

package actors;

public interface ActorBehaviour {
    void setReadyToMakeOrder(boolean ready);
    void setReceivedOrder(boolean received);
    boolean isReadyToMakeOrder();
    boolean hasReceivedOrder();
}

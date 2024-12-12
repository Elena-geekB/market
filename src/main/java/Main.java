import actors.Actor;
import actors.Human;
import market.Market;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Actor human1 = new Human("John");
        Actor human2 = new Human("Jane");

        market.customerArrives(human1); // Клиент приходит в магазин
        market.customerArrives(human2);

        market.update(); // Обработка John
        market.update(); // Завершение обработки John, он уходит
        market.update(); // Обработка Jane
        market.update(); // Завершение обработки Jane, она уходит
    }
}

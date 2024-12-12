# Market Simulation

## Описание
Этот проект представляет собой симуляцию работы магазина с очередями, заказами и клиентами.
Клиенты приходят в магазин, становятся в очередь, делают заказы, получают их и уходят.

## Структура проекта
- `actors/`: классы, описывающие актеров (покупателей).
- `behaviours/`: интерфейсы для описания поведения очереди и магазина.
- `market/`: реализация магазина.
- `test/`: тесты для проверки логики проекта.

```
MarketSimulation/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── actors/
│   │   │   │   ├── Actor.java               # Абстрактный класс, описывающий актора
│   │   │   │   ├── ActorBehaviour.java      # Интерфейс, описывающий поведение актора
│   │   │   │   └── Human.java               # Класс человека, наследующий Actor
│   │   │   ├── behaviours/
│   │   │   │   ├── QueueBehaviour.java      # Интерфейс для управления очередью
│   │   │   │   └── MarketBehaviour.java     # Интерфейс для управления поведением магазина
│   │   │   ├── market/
│   │   │   │   └── Market.java              # Класс магазина, реализующий QueueBehaviour и MarketBehaviour
│   │   │   └── Main.java                    # Главный класс для тестирования системы
├── build/                                   # Папка для скомпилированных файлов (создается автоматически)
├── lib/                                     # Сторонние библиотеки (если нужны)
├── test/                                    # Папка для тестов
│   └── java/
│       └── MarketTest.java                  # Класс для тестирования логики Market
└── README.md                                # Документация проекта
```
## Как запустить
1. Склонируйте репозиторий на вашу локальную машину.
2. Скомпилируйте проект с помощью Maven:
```
mvn install
```
3. Выполните команду Maven:
```
mvn test
```
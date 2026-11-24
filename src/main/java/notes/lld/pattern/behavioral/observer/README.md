# Observer Design Pattern

> Behavioral Design Pattern

## 1. Introduction

The Observer pattern defines a **one-to-many dependency** between objects so that when one object changes state, its registered observers can be notified automatically.

The observable knows only the observer interface, not the concrete subscribers.

## 2. Problem Statement

Consider an online store where customers want to receive notifications when an out-of-stock product becomes available. Customers may subscribe through email or SMS and unsubscribe whenever they wish.

Hardcoding notification channels inside the stock management class creates tight coupling and requires modifying existing code whenever a new channel is introduced.

## 3. Approach and Solution

-   Define a common observer interface with an `update()` method.
-   Define an observable interface for registration, removal and notification.
-   Maintain a collection of registered observers in the concrete observable.
-   Notify observers when the relevant state change occurs.
-   Allow each concrete observer to handle notifications independently.

## 4. UML Class Diagram

``` mermaid
classDiagram
    direction TB
    class StockObservable {
        <<interface>>
        +addObserver(StockObserver observer) void
        +removeObserver(StockObserver observer) void
        +notifyObservers() void
        +setStock(int quantity) void
        +outOfStock() void
    }
    class IphoneStockObservable {
        -List~StockObserver~ observers
        -int stock
        +addObserver(StockObserver observer) void
        +removeObserver(StockObserver observer) void
        +notifyObservers() void
        +setStock(int quantity) void
        +outOfStock() void
    }
    class StockObserver {
        <<interface>>
        +update(String product) void
    }
    class EmailObserver {
        +update(String product) void
    }
    class SmsObserver {
        +update(String product) void
    }
    StockObservable <|.. IphoneStockObservable
    IphoneStockObservable --> "0..*" StockObserver : registers and notifies
    StockObserver <|.. EmailObserver
    StockObserver <|.. SmsObserver
```

-   Dashed hollow triangle: interface implementation.
-   Solid arrow: association; the observable maintains references to observers without owning their lifecycles.

## 5. Class and Interface Responsibilities

  -------------------------------------------------------------------------------------------------------
  Participant                         Responsibility
  ----------------------------------- -------------------------------------------------------------------
  Observable (Subject)                Defines subscription and notification operations.

  Concrete Observable                 Maintains state and registered observers; triggers notifications.

  Observer                            Defines a common update contract.

  Concrete Observer                   Responds to notifications independently.

  Client                              Creates objects and manages subscriptions.
  -------------------------------------------------------------------------------------------------------

## 6. Execution Flow

1.  Observers subscribe to an observable.
2.  The observable's state changes.
3.  The observable checks whether the change requires notification.
4.  The observable calls `update()` on each registered observer.
5.  Each observer performs its own action. Unsubscribed observers receive no further notifications.

For stock alerts, a notification can be restricted to the transition from zero stock to positive stock rather than every quantity change.

## 7. Sample Output

``` text
Email: Iphone is available!
SMS: Iphone is available!
Iphone is again Out Of Stock!
Email notification is disabled by User
SMS: Iphone is available!
```

## 8. Design Principles Applied

-   **Open/Closed Principle:** New observer implementations can be added without changing the observable.
-   **Dependency Inversion Principle:** The observable depends on the observer abstraction.
-   **Single Responsibility Principle:** Stock management and notification handling are separated.
-   **Loose coupling:** Publishers and subscribers interact through contracts.

## 9. Advantages and Limitations

  -------------------------------------------------------------------------------------------------
  Advantages                                Limitations
  ----------------------------------------- -------------------------------------------------------
  Dynamic subscription and unsubscription   Notification order may depend on the collection used

  Supports one-to-many communication        Slow synchronous observers can block the publisher

  Easy to extend with new observers         Observer failures may interrupt notification delivery

  Reduces coupling between components       Concurrent updates require careful coordination
  -------------------------------------------------------------------------------------------------

## 10. When to Use

-   Product availability and price alerts.
-   GUI event listeners.
-   Application event handling.
-   Monitoring and state-change notifications.

## 11. Interview Takeaways

-   **Push model:** The observable passes event data directly to observers.
-   **Pull model:** Observers retrieve the required state from the observable.
-   **Observer vs Strategy:** Observer notifies multiple subscribers; Strategy selects an interchangeable behavior.
-   **Observer vs message broker pub/sub:** Classic Observer typically uses direct object references; broker-based pub/sub introduces an intermediary and may support asynchronous, distributed delivery.
-   **Production considerations:** Prevent duplicate subscriptions where appropriate, handle observer failures, manage subscription lifecycles, and coordinate concurrent access. A thread-safe observer collection alone does not make stock transitions atomic.

**Key takeaway:** Use Observer when multiple independent objects need to react to changes in another object without tightly coupling the publisher to concrete subscribers.

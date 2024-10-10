package dev.kamal.learnlld.lld2.observer;

public class Client {
    public static void main(String[] args) {
        demoObserverPattern();

    }

    private static void demoObserverPattern() {

        Amazon amazon = new Amazon();
        Subscriber inventoryService = new InventoryService();
        Subscriber logisticService = new LogisticService();
        Subscriber emailService = new EmailService();
        Subscriber smsService = new SmsService();

        // subscribe for notification
        amazon.subscribe(inventoryService);
        amazon.subscribe(logisticService);
        amazon.subscribe(emailService);
        amazon.subscribe(smsService);

        // notify all subscribers
        amazon.orderPlaced();

    }
}

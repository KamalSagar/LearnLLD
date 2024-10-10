package dev.kamal.learnlld.lld2.observer;

public interface Publisher {
    void subscribe(Subscriber subscriber);
    void unSubscribe(Subscriber subscriber);
    void notifySubscriber();
}

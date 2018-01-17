package org.shagen.plugin;

import java.util.function.Supplier;

public class RouteRecord {

    private final Supplier<Boolean> myCondition;
    private final Runnable trigger;

    public RouteRecord(Supplier<Boolean> condition, Runnable trigger) {
        this.myCondition = condition;
        this.trigger = trigger;
    }

    public Supplier<Boolean> getCondition() {
        return myCondition;
    }

    public void run() {
        trigger.run();
    }
}

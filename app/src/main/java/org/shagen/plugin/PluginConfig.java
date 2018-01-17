package org.shagen.plugin;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PluginConfig {
    public static final PluginConfig INSTANCE = new PluginConfig();

    private List<RouteRecord> plugins = new ArrayList<>();

    public PluginConfig register(RouteRecord navigationPlugin) {
        plugins.<RouteRecord>add(navigationPlugin);
        return this;
    }

    public Optional<RouteRecord> findMatch() {
        return this.plugins.stream().filter(it -> it.getCondition().get()).findFirst();
    }
}

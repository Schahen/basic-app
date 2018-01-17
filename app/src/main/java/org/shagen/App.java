package org.shagen;

import com.google.gwt.core.client.EntryPoint;
import org.shagen.app.Ping;
import org.shagen.plugin.PluginConfig;
import org.shagen.plugin.RouteA;
import org.shagen.plugin.RouteRecord;

import java.util.Optional;

import static elemental2.dom.DomGlobal.alert;
import static elemental2.dom.DomGlobal.window;
import static elemental2.dom.DomGlobal.console;

public class App implements EntryPoint {

    private void resolve(PluginConfig pluginConfig) {
        Optional<RouteRecord> findMatch = pluginConfig.findMatch();
        findMatch
                .ifPresent(match -> match.run());
    }

    public void onModuleLoad() {

        PluginConfig.INSTANCE.register(new RouteRecord(() -> "/".equals(window.location.getPathname()), () -> {
            alert(new Ping());
        }));

        PluginConfig.INSTANCE.register(new RouteRecord(() -> "/state/ping".equals(window.location.getPathname()), () -> {
            alert("HEYHEY HEY NEW STATE");
        }));


        resolve(PluginConfig.INSTANCE);
    }
}

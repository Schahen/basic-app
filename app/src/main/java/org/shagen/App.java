package org.shagen;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window;
import org.shagen.app.Ping;

public class App implements EntryPoint {

    public void onModuleLoad() {
        Window.alert(new Ping().getClass().getCanonicalName());
    }
}

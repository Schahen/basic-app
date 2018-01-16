package org.shagen;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;

public class App implements EntryPoint {


    public void onModuleLoad() {
        ConfigMapper mapper = GWT.create(ConfigMapper.class);

        Window.alert(ConfigBundle.INSTANCE.pluginConfig().getText());
        Config config = mapper.read(ConfigBundle.INSTANCE.pluginConfig().getText());
        Window.alert(config.getState());
    }
}

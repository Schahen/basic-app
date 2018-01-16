package org.shagen;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface ConfigBundle extends ClientBundle {

    public static ConfigBundle INSTANCE = GWT.create(ConfigBundle.class);

    @Source("plugins.json")
    TextResource pluginConfig();

}

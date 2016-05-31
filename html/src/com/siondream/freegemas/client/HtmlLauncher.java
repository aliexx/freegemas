package com.siondream.freegemas.client;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;
import com.siondream.freegemas.Freegemas;

public class HtmlLauncher extends GwtApplication {

    public HtmlLauncher() {
        super();
        Freegemas.setPlatformResolver(new WebGLResolver());
    }

    @Override
    public GwtApplicationConfiguration getConfig () {
        return new GwtApplicationConfiguration(960, 540);
    }

    @Override
    public ApplicationListener createApplicationListener () {
        return new Freegemas();
    }
}
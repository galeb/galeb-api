package io.galeb.services.api;

import io.galeb.core.starter.AbstractStarter;

public class Starter extends AbstractStarter {

    private Starter() {
        // main class
    }

    public static void main(String[] args) {

        loadService(Api.class);

    }

}

package org.eatbacon.apis.factories;

import org.eatbacon.apis.FooApiService;
import org.eatbacon.apis.impl.FooApiServiceImpl;


public class FooApiServiceFactory {
    private final static FooApiService service = new FooApiServiceImpl();

    public static FooApiService getFooApi() {
        return service;
    }
}

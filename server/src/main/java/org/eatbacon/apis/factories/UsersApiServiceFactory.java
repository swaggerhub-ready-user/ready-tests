package org.eatbacon.apis.factories;

import org.eatbacon.apis.UsersApiService;
import org.eatbacon.apis.impl.UsersApiServiceImpl;


public class UsersApiServiceFactory {
    private final static UsersApiService service = new UsersApiServiceImpl();

    public static UsersApiService getUsersApi() {
        return service;
    }
}

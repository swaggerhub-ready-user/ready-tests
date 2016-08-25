package org.eatbacon.apis;

import org.eatbacon.apis.*;
import org.eatbacon.models.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import org.eatbacon.models.MyModel;

import java.util.List;
import org.eatbacon.apis.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;


public abstract class FooApiService {
    public abstract Response fooGet(SecurityContext securityContext) throws NotFoundException;
}

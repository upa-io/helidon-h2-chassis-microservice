package com.upaio.database.openapi;

import org.eclipse.microprofile.openapi.OASFactory;
import org.eclipse.microprofile.openapi.OASModelReader;
import org.eclipse.microprofile.openapi.models.OpenAPI;
import org.eclipse.microprofile.openapi.models.info.Contact;
import org.eclipse.microprofile.openapi.models.info.Info;

public class HelidonOpenApiReader implements OASModelReader {
    @Override
    public OpenAPI buildModel() {
        return OASFactory.createOpenAPI()
                .info(info());
    }

    private Info info() {
        return OASFactory
                .createInfo()
                .title("Helidon database-mp")
                .description("Helidon database-mp API")
                .version("1.0")
                .contact(contact());
    }

    private Contact contact() {
        return OASFactory
                .createContact()
                .name("Jesus Aguirre")
                .url("https://jeaguirre-web.vercel.app/");
    }
}

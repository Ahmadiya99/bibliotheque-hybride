package com.biblio.hybride.soap;

import com.biblio.hybride.model.Livre;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class LivreEndpoint {

    @PayloadRoot(namespace = "http://www.biblio.com/hybride", localPart = "getLivreRequest")
    @ResponsePayload
    public Livre getLivre(@RequestPayload Livre livre) {
        return new Livre(livre.getId(), "Livre SOAP", "Auteur SOAP");
    }
}
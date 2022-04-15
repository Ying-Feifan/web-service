package com.fiap.webservice.controllers;

import com.fiap.webservice.models.Offer.Offer;
import com.fiap.webservice.models.Offer.OfferDetail;
import com.fiap.webservice.services.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class OffersController {
    @Autowired
    OfferService offerService;

    @GetMapping("/user/{userId}/offers")
    public List<Offer> findOfferList(
            @PathVariable String userId) {
        List<Offer> result = offerService.findOfferList(userId);
        return result;
    }

    @GetMapping("/offerDetail/{offerId}")
    public OfferDetail findOfferDetail(
            @PathVariable String offerId) {
        OfferDetail result = offerService.findOfferDetail(offerId);
        return result;
    }

}

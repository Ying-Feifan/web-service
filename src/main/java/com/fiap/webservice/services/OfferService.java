package com.fiap.webservice.services;

import com.fiap.webservice.models.Offer.Offer;
import com.fiap.webservice.models.Offer.OfferDetail;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OfferService {

    public List<Offer> findOfferList(String userId){
        List<Offer> offerList = new ArrayList<>();
        offerList.add(new Offer());
        return offerList;
    }

    public OfferDetail findOfferDetail(String offerId){
        OfferDetail offerDetail = new OfferDetail();
        return offerDetail;
    }
}

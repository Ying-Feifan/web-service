package com.fiap.webservice.services;

import com.fiap.webservice.models.Psychologist.Psychologist;
import org.springframework.stereotype.Service;

@Service
public class PsychologistsService {
    public Psychologist findPsychologist(String id){
        return psychologistsMock();
    }
    public String creatPsychologist(String id, Psychologist psychologist){
        return "created";
    }
    public String updatePsychologist(String id, Psychologist psychologist){
        return "updated";
    }
    public String deletePsychologist(String id){
        return "deleted";
    }

    private Psychologist psychologistsMock(){
        Psychologist psychologist = new Psychologist();
        psychologist.setId("01");
        psychologist.setName("PsychologistsTest");
        return psychologist;
    }
}

package com.fiap.webservice.controllers;

import com.fiap.webservice.models.Psychologist.Psychologist;
import com.fiap.webservice.services.PsychologistsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/psychologist")
public class PsychologistsController {

    @Autowired
    PsychologistsService psychologistsService;

    @GetMapping("/{psychologistId}")
    public Psychologist findPsychologist(@PathVariable String psychologistId) {
        Psychologist result = psychologistsService.findPsychologist(psychologistId);
        return result;
    }

    @PostMapping("/{psychologistId}")
    public String creatPsychologist(@PathVariable String psychologistId , @RequestBody Psychologist psychologist) {
        String result = psychologistsService.creatPsychologist(psychologistId,psychologist);
        return result;
    }

    @PutMapping("/{psychologistId}")
    public String updatePsychologist(@PathVariable String psychologistId , @RequestBody Psychologist psychologist) {
        String result = psychologistsService.updatePsychologist(psychologistId,psychologist);
        return result;
    }

    @DeleteMapping("/{psychologistId}")
    public String deletePsychologist(@PathVariable String psychologistId) {
        String result = psychologistsService.deletePsychologist(psychologistId);
        return result;
    }


}

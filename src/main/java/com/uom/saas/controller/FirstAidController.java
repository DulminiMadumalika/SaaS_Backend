package com.uom.saas.controller;

import com.uom.saas.entiry.FirstAid;
import com.uom.saas.entiry.Provider;
import com.uom.saas.service.FirstAidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class FirstAidController {
    @Autowired
    private FirstAidService service;

    @GetMapping("/getAllFirstAid")
    public List<FirstAid> getAllProviders() {
        List<FirstAid> allProviders = service.getAllFirstAids();
        return allProviders;

    }
}

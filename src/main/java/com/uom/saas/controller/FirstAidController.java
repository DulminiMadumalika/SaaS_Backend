package com.uom.saas.controller;

import com.uom.saas.entiry.FirstAid;
import com.uom.saas.service.FirstAidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class FirstAidController {
    @Autowired
    private FirstAidService service;
    @PostMapping("/addFirstAid")
    public String addFirstAid(@RequestBody FirstAid firstAid) {
        String response = service.addFirstAid(firstAid);
        return response;
    }
    @GetMapping("/getAllFirstAid")
    public List<FirstAid> getAllProviders() {
        List<FirstAid> allProviders = service.getAllFirstAids();
        return allProviders;

    }
}

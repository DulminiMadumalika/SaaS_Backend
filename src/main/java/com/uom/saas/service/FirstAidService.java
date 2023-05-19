package com.uom.saas.service;

import com.uom.saas.entiry.FirstAid;
import com.uom.saas.repository.FirstAidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class FirstAidService {

    @Autowired
    FirstAidRepository firstAidRepository;
    public List<FirstAid> getAllFirstAids() {
        return firstAidRepository.findAll();
    }

    public String addFirstAid(FirstAid firstAid) {
        firstAidRepository.save(firstAid);
        return "Added firstAid with id : " + firstAid.getId();
    }
}

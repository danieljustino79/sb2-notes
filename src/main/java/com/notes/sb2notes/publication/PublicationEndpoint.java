package com.notes.sb2notes.publication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/publication")
public class PublicationEndpoint {
    @Autowired
    private PublicationFacade facade;

    @GetMapping("listUsers")
    public List<String> get(){
        return facade.getUsers();
    }

}

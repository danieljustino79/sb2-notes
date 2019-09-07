package com.notes.sb2notes.publication;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class PublicationFacade {
    public List<String> getUsers(){
        List<String> list = Arrays.asList("foo", "bar");
        return list;
    }
}

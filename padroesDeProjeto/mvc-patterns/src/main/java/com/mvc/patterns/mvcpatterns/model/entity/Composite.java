package com.mvc.patterns.mvcpatterns.model.entity;

import java.util.List;

import com.mvc.patterns.mvcpatterns.model.interfaces.Component;

public class Composite implements Component {

    public void add (List<Component> lista, Component component){
        lista.add(component);
    }
    
}

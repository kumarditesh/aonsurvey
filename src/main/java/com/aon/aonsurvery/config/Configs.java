package com.aon.aonsurvery.config;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by ditesh on 12/3/15.
 */
public class Configs {
    
    //TODO default constructor can pick up initial properties from a defined location w.r.t the jar
    
    private Properties props = new Properties() ;
    
    public void setProp (ConfigParameters name , String value) {
        props.setProperty(name.toString(), value) ;
    }
    
    public Integer getInt (ConfigParameters name) {
        return Integer.parseInt(props.getProperty(name.toString())) ;
    }

    public String getString (ConfigParameters name) {
        return props.getProperty(name.toString()) ;
    }
}

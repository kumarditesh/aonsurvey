package com.aon.aonsurvery.service;

import com.aon.aonsurvery.config.Configs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by ditesh on 12/3/15.
 */
public class ServiceFactory {

    private static final Logger log = LoggerFactory.getLogger(ServiceFactory.class);
    
    private static Boolean isInitialized = false ;
    
    public synchronized static Boolean initialize(Configs configs) {
        //TODO
        if (isInitialized.equals(true)){
            log.warn("Services already initialized.");
            return true ;
        }else {
            //TODO initialize services
            isInitialized = true ;
            return true ;
        }
    }
}

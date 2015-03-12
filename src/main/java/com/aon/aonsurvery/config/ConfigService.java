package com.aon.aonsurvery.config;

/**
 * Created by ditesh on 13/3/15.
 */
public class ConfigService {
    private static Configs configs ;

    public static Configs getConfigs() {
        return configs;
    }

    public static void setConfigs(Configs configs) {
        ConfigService.configs = configs;
    }
}

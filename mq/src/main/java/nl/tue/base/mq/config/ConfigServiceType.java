package nl.tue.base.mq.config;

import lombok.Getter;

@Getter
public class ConfigServiceType {

    private Long validityTime;
    private Boolean mandatory;

    public ConfigServiceType(Long validityTime, Boolean mandatory) {
        this.validityTime = validityTime;
        this.mandatory = mandatory;
    }
}

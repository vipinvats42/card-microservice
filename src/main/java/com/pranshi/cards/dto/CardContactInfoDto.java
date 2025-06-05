package com.pranshi.cards.dto;

import java.util.HashMap;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ConfigurationProperties(prefix = "cards")
public class CardContactInfoDto {
    private String message;
    private HashMap<String, String> contactDetails;
    private List<String> onCallSupport;
}

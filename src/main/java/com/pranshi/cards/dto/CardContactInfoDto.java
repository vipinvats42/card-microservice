package com.pranshi.cards.dto;

import java.util.HashMap;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "cards")
public record CardContactInfoDto(String message, HashMap<String, String> contactDetails, List<String> onCallSupport) {

}

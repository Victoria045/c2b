package com.daraja.c2b.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class RegisterUrlResponse{

	@JsonProperty("ConversationID")
	private String conversationID;

	@JsonProperty("ResponseDescription")
	private String responseDescription;

	@JsonProperty("OriginatorCoversationID")
	private String originatorCoversationID;
}
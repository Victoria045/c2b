package com.daraja.c2b.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class RegisterUrlRequest{

	@JsonProperty("ShortCode")
	private String shortCode;

	@JsonProperty("ConfirmationURL")
	private String confirmationURL;

	@JsonProperty("ValidationURL")
	private String validationURL;

	@JsonProperty("ResponseType")
	private String responseType;
}
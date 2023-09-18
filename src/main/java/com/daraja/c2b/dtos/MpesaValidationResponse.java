package com.daraja.c2b.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MpesaValidationResponse {

	@JsonProperty("TransactionType")
	private String transactionType;

	@JsonProperty("TransID")
	private String transID;

	@JsonProperty("TransTime")
	private String transTime;

	@JsonProperty("TransAmount")
	private String transAmount;

	@JsonProperty("BusinessShortCode")
	private String businessShortCode;

	@JsonProperty("BillRefNumber")
	private String billRefNumber;

	@JsonProperty("InvoiceNumber")
	private String invoiceNumber;

	@JsonProperty("OrgAccountBalance")
	private String orgAccountBalance;

	@JsonProperty("ThirdPartyTransID")
	private String thirdPartyTransID;

	@JsonProperty("MSISDN")
	private String mSISDN;

	@JsonProperty("FirstName")
	private String firstName;

	@JsonProperty("MiddleName")
	private String middleName;

	@JsonProperty("LastName")
	private String lastName;
}
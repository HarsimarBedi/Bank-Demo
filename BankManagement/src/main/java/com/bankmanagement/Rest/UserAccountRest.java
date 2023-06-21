package com.bankmanagement.Rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bankmanagement.Model.AccountTransactionDetails;
import com.bankmanagement.Model.UserAccountDetails;
import com.bankmanagement.Service.UserAccountService;
import com.google.gson.Gson;

@RestController
@RequestMapping("/accounts")
public class UserAccountRest {

	private final UserAccountService userAccountService;

	public UserAccountRest(UserAccountService service) {
		this.userAccountService = service;
	}

	@GetMapping(value = "/{userId}")
	public String getUserAccountDetails(@PathVariable("userId") int userId) {
		// Validate userId parameter
		String result = new String();
		int parsedUserId;
		try {
			parsedUserId = Integer.parseInt(String.valueOf(userId));
			if (parsedUserId <= 0) {
				result = "Invalid userId. It must be a positive integer greater than 0.";
			} else {
				List<UserAccountDetails> accounts = userAccountService.getUserAccountDetails(userId);
				if (accounts.isEmpty()) {
				    result = "No user account details found. Please enter correct User Number";
				} else {
					Gson gson = new Gson();
					
					result = gson.toJson(accounts);
				}
				
			}
			
		} catch (NumberFormatException e) {
			result = "Invalid userId. It must be a positive integer greater than 0.";
		}
		return result;
		

	}

	@GetMapping(value = "/transactions/{accountNumber}")
	public String getAccountTransactionDetails(@PathVariable("accountNumber") String accountNumber) {
	    String result;

	    try {
	        if (!isValidAccount(accountNumber)) {
	            result = "Invalid account number. It must consist of 16 numeric digits.";
	        } else {
	            List<AccountTransactionDetails> transactions = userAccountService.getTransactionsByAccountNumber(accountNumber);
	            if (transactions.isEmpty()) {
				    result = "No Transactions details found. Please enter correct account Number";
				} else {
					Gson gson = new Gson();
					
					result = gson.toJson(transactions);
				}
	         
	        }
	    } catch (Exception e) {
	        result = "Error occurred: " + e.getMessage();
	    }

	    return result;
	}


	private boolean isValidAccount(String accountNumber) {

		// Check if the accountNumber is exactly 16 digits and consists only of numeric
		// characters
		return accountNumber.matches("\\d{16}");

	}
}

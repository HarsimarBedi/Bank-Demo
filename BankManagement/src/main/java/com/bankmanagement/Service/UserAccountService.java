package com.bankmanagement.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bankmanagement.Model.AccountTransactionDetails;
import com.bankmanagement.Model.UserAccountDetails;
import com.bankmanagement.Repository.UserAccountRepository;

@Service
public class UserAccountService {

	private final UserAccountRepository userAccountRepository;

	public UserAccountService(UserAccountRepository repository) {
		this.userAccountRepository = repository;
	}

	public List<UserAccountDetails> getUserAccountDetails(int userId) {
		return userAccountRepository.getAccountsByUserId(userId);
	}

	public List<AccountTransactionDetails> getTransactionsByAccountNumber(String accountNumber) {
		return userAccountRepository.getTransactionsByAccountNumber(accountNumber);
	}
}

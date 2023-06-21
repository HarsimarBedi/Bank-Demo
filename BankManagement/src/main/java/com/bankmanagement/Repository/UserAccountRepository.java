package com.bankmanagement.Repository;

import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import com.bankmanagement.Model.AccountTransactionDetails;
import com.bankmanagement.Model.UserAccountDetails;

import java.util.Collections;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

@Repository
public class UserAccountRepository {

	private final JdbcTemplate jdbcTemplate;

	public UserAccountRepository(JdbcTemplate jdbcTemplate) {
	    this.jdbcTemplate = jdbcTemplate;
	}

	public List<UserAccountDetails> getAccountsByUserId(int userId) {
	    try {
	        String sql = "SELECT * FROM userAccounts WHERE user_id = ?";
	        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(UserAccountDetails.class), userId);
	    } catch (Exception e) {
	        // Handle the exception or log the error
	        e.printStackTrace();
	        return Collections.emptyList(); // Return an empty list or handle the error accordingly
	    }
	}

	public List<AccountTransactionDetails> getTransactionsByAccountNumber(String accountNumber) {
	    try {
	        String sql = "SELECT * FROM accountTransaction WHERE account_number = ?";
	        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(AccountTransactionDetails.class), accountNumber);
	    } catch (Exception e) {
	        // Handle the exception or log the error
	        e.printStackTrace();
	        return Collections.emptyList(); // Return an empty list or handle the error accordingly
	    }
	}

}
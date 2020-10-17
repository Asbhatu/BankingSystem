package com.usersFront.user.service;

import java.security.Principal;

import com.usersFront.user.domain.PrimaryAccount;
import com.usersFront.user.domain.SavingsAccount;

public interface AccountService {
	PrimaryAccount createPrimaryAccount();
	SavingsAccount createSavingsAccount();
	void deposit(String accountType, double amount, Principal principal);
	void withdraw(String accountType, double amount, Principal principal);

}

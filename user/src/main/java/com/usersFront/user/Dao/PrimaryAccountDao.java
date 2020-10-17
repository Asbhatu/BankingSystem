package com.usersFront.user.Dao;

import org.springframework.data.repository.CrudRepository;

import com.usersFront.user.domain.PrimaryAccount;

public interface PrimaryAccountDao extends CrudRepository<PrimaryAccount,Long> {

	PrimaryAccount findByAccountNumber(int accountNumber);
}


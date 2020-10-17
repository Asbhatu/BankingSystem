package com.usersFront.user.Dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.usersFront.user.domain.SavingsTransaction;

public interface SavingsTransactionDao extends CrudRepository<SavingsTransaction, Long>{
	List<SavingsTransaction> findAll();

}

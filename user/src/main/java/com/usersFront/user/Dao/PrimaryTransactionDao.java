package com.usersFront.user.Dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.usersFront.user.domain.PrimaryTransaction;

public interface PrimaryTransactionDao extends CrudRepository<PrimaryTransaction, Long>{
	List<PrimaryTransaction> findAll();

}

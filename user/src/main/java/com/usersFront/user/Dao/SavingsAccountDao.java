package com.usersFront.user.Dao;

import org.springframework.data.repository.CrudRepository;

import com.usersFront.user.domain.SavingsAccount;




public interface SavingsAccountDao extends CrudRepository<SavingsAccount, Long> {

    SavingsAccount findByAccountNumber (int accountNumber);
}

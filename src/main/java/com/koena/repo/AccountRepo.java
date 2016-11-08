package com.koena.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.koena.entity.Account;

@Repository
public interface AccountRepo extends JpaRepository<Account, Integer> {

//	@Query(name="findByAccountNumber", value="select a from Account a WHERE a.accountNumber = ?")
	Account findByAccountNumber(String acctNumber);
}

package com.koena.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.koena.entity.Contact;

@Repository
public interface ContactRepo extends JpaRepository<Contact, Integer> {
	
//	@Query(name="findContactByAccountId", value="select c from Contact c WHERE c.accountId.accountId = ?")
	Contact findByAccountIdAccountId(int acctId);

}

package com.koena.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.koena.entity.Contact;
import com.koena.entity.Invoice;

@Repository
public interface InvoiceRepo extends JpaRepository<Invoice, Integer> {
	
	Invoice findByAccountIdAccountId(int acctId);

}

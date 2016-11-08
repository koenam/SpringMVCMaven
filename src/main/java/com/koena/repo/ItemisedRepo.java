package com.koena.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.koena.entity.Contact;
import com.koena.entity.Itemised;

@Repository
public interface ItemisedRepo extends JpaRepository<Itemised, Integer> {
	
	List<Itemised> findByInvoiceIdAccountIdAccountId(Integer accountId);

}

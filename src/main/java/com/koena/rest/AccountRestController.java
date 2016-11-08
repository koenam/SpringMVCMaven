package com.koena.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.koena.entity.Account;
import com.koena.entity.Contact;
import com.koena.entity.Invoice;
import com.koena.entity.Itemised;
import com.koena.repo.AccountRepo;
import com.koena.repo.ContactRepo;
import com.koena.repo.InvoiceRepo;
import com.koena.repo.ItemisedRepo;

@RestController
public class AccountRestController {

	@Autowired
	private AccountRepo accountRepo;

	@Autowired
	private ContactRepo contactRepo;

	@Autowired
	private ItemisedRepo itemisedRepo;

	@Autowired
	private InvoiceRepo invoiceRepo;

	@RequestMapping(value = "/accounts/{acctNo}", method = RequestMethod.GET)
	public ResponseObject getAccount(@PathVariable String acctNo) {
		System.out.println("account nu is " + acctNo);
		Account account = accountRepo.findByAccountNumber(acctNo);
		Contact contact = contactRepo.findByAccountIdAccountId(account.getAccountId());
		Invoice invoice = invoiceRepo.findByAccountIdAccountId(account.getAccountId());
		List<Itemised> itemised = itemisedRepo.findByInvoiceIdAccountIdAccountId(account.getAccountId());
		
		System.out.println("account rest="+acctNo);
		return new ResponseObject(account, contact, invoice, itemised);
	}

}

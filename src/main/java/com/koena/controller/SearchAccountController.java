package com.koena.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.koena.entity.Account;
import com.koena.entity.Contact;
import com.koena.entity.Invoice;
import com.koena.entity.Itemised;
import com.koena.repo.AccountRepo;
import com.koena.repo.AuditRepo;
import com.koena.repo.ContactRepo;
import com.koena.repo.InvoiceRepo;
import com.koena.repo.ItemisedRepo;
import com.koena.service.AuditService;
import com.koena.service.ValidationService;

@Controller
public class SearchAccountController {

	@Autowired
	private AccountRepo accountRepo;

	@Autowired
	private ContactRepo contactRepo;

	@Autowired
	private ItemisedRepo itemisedRepo;

	@Autowired
	private InvoiceRepo invoiceRepo;

	@Autowired
	private ValidationService validationService;

	@Autowired
	private AuditRepo auditRepo;

	@Autowired
	private AuditService auditService;

	@RequestMapping(value = "/searchAccount", method = RequestMethod.POST)

	public String searchForAccount(@RequestParam String accountNumber, ModelMap model) {

		Boolean isValid = validationService.validateAccountNumber(accountNumber, model);
		if (isValid) {
			Account account = accountRepo.findByAccountNumber(accountNumber);
			Contact contact = contactRepo.findByAccountIdAccountId(account.getAccountId());
			Invoice invoice = invoiceRepo.findByAccountIdAccountId(account.getAccountId());
			List<Itemised> itemised = itemisedRepo.findByInvoiceIdAccountIdAccountId(account.getAccountId());

			model.addAttribute("account", account);
			model.addAttribute("contact", contact);
			model.addAttribute("invoice", invoice);
			model.addAttribute("itemised", itemised);
			return "account";
			// auditService.auditAccount(accountNumber);
		}

		return "searchAccount";

	}

}

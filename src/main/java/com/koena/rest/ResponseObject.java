package com.koena.rest;

import java.util.List;

import com.koena.entity.*;

public class ResponseObject {

	private Account account;
	private Contact contact;
	private Invoice invoice;
	private List<Itemised> itemisedList;

	public ResponseObject() {
	}

	public ResponseObject(Account account, Contact contact, Invoice invoice, List<Itemised> itemisedList) {
		this.account = account;
		this.contact = contact;
		this.invoice = invoice;
		this.itemisedList = itemisedList;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	public List<Itemised> getItemisedList() {
		return itemisedList;
	}

	public void setItemisedList(List<Itemised> itemisedList) {
		this.itemisedList = itemisedList;
	}

}

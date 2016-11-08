package com.koena.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koena.entity.Audit;
import com.koena.repo.AuditRepo;

@Service
public class AuditService {
	
	@Autowired AuditRepo auditRepo;
	
	public void auditAccount (String accountNumber)
	{
		try{
			Audit audit = new Audit();
			audit.setAccountViewed(accountNumber);
			audit.setAuditDate(new Date());
			audit.setAuditTime(new Date());
			audit.setUsername("");
			
		auditRepo.save(audit); //database insert
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}

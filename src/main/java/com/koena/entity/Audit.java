/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koena.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Koena
 */
@Entity
@Table(name = "AUDIT")
@NamedQueries({
    @NamedQuery(name = "Audit.findAll", query = "SELECT a FROM Audit a")})
public class Audit implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "auditId")
    private Integer auditId;
    @Basic(optional = false)
    @Column(name = "auditDate")
    @Temporal(TemporalType.DATE)
    private Date auditDate;
    @Basic(optional = false)
    @Column(name = "auditTime")
    @Temporal(TemporalType.TIME)
    private Date auditTime;
    @Basic(optional = false)
    @Column(name = "accountViewed")
    private String accountViewed;
    @Column(name = "username")
    private String username;

    public Audit() {
    }

    public Audit(Integer auditId) {
        this.auditId = auditId;
    }

    public Audit(Integer auditId, Date auditDate, Date auditTime, String accountViewed) {
        this.auditId = auditId;
        this.auditDate = auditDate;
        this.auditTime = auditTime;
        this.accountViewed = accountViewed;
    }

    public Integer getAuditId() {
        return auditId;
    }

    public void setAuditId(Integer auditId) {
        this.auditId = auditId;
    }

    public Date getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(Date auditDate) {
        this.auditDate = auditDate;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public String getAccountViewed() {
        return accountViewed;
    }

    public void setAccountViewed(String accountViewed) {
        this.accountViewed = accountViewed;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (auditId != null ? auditId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Audit)) {
            return false;
        }
        Audit other = (Audit) object;
        if ((this.auditId == null && other.auditId != null) || (this.auditId != null && !this.auditId.equals(other.auditId))) {
            return false;
        }
        return true;
    }

	@Override
	public String toString() {
		return "Audit [auditId=" + auditId + ", auditDate=" + auditDate + ", auditTime=" + auditTime
				+ ", accountViewed=" + accountViewed + ", username=" + username + "]";
	}
    
}

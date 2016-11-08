/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koena.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "ITEMISED")
@NamedQueries({
    @NamedQuery(name = "Itemised.findAll", query = "SELECT i FROM Itemised i")})
public class Itemised implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "itemisedId")
    private Integer itemisedId;
    @Basic(optional = false)
    @Column(name = "callDate")
    @Temporal(TemporalType.DATE)
    private Date callDate;
    @Basic(optional = false)
    @Column(name = "callTime")
    @Temporal(TemporalType.TIME)
    private Date callTime;
    @Basic(optional = false)
    @Column(name = "callType")
    private String callType;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "callCost")
    private BigDecimal callCost;
    @JoinColumn(name = "invoiceId", referencedColumnName = "invoiceId")
    @ManyToOne(optional = false)
    private Invoice invoiceId;

    public Itemised() {
    }

    public Itemised(Integer itemisedId) {
        this.itemisedId = itemisedId;
    }

    public Itemised(Integer itemisedId, Date callDate, Date callTime, String callType, BigDecimal callCost) {
        this.itemisedId = itemisedId;
        this.callDate = callDate;
        this.callTime = callTime;
        this.callType = callType;
        this.callCost = callCost;
    }

    public Integer getItemisedId() {
        return itemisedId;
    }

    public void setItemisedId(Integer itemisedId) {
        this.itemisedId = itemisedId;
    }

    public Date getCallDate() {
        return callDate;
    }

    public void setCallDate(Date callDate) {
        this.callDate = callDate;
    }

    public Date getCallTime() {
        return callTime;
    }

    public void setCallTime(Date callTime) {
        this.callTime = callTime;
    }

    public String getCallType() {
        return callType;
    }

    public void setCallType(String callType) {
        this.callType = callType;
    }

    public BigDecimal getCallCost() {
        return callCost;
    }

    public void setCallCost(BigDecimal callCost) {
        this.callCost = callCost;
    }

    public Invoice getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Invoice invoiceId) {
        this.invoiceId = invoiceId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itemisedId != null ? itemisedId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Itemised)) {
            return false;
        }
        Itemised other = (Itemised) object;
        if ((this.itemisedId == null && other.itemisedId != null) || (this.itemisedId != null && !this.itemisedId.equals(other.itemisedId))) {
            return false;
        }
        return true;
    }

	@Override
	public String toString() {
		return "Itemised [itemisedId=" + itemisedId + ", callDate=" + callDate + ", callTime=" + callTime
				+ ", callType=" + callType + ", callCost=" + callCost + ", invoiceId=" + invoiceId + "]";
	}
    
}

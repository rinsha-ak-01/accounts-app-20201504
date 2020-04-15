package com.accounts.accountsapp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Accounts")
public class Accounts {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "club_id")
	private Long clubId;

	@Column(name = "head_id")
	private Long headId;

	@Column(name = "child_id")
	private Long childId;

	@Column(name = "type")
	private String type;

	@Column(name = "amount")
	private double amount;

	@Column(name = "bill_no")
	private String billNo;

	@Column(name = "invoice_no")
	private String invoiceNo;

	@Column(name = "remarks")
	private String remarks;

	@Column(name = "transaction_type")
	private String transactionType;

	@Column(name = "insertedOn")
	private Date insertedOn;

	@Column(name = "updated_on")
	private Date upadatedOn;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getClubId() {
		return clubId;
	}

	public void setClubId(Long clubId) {
		this.clubId = clubId;
	}

	public Long getHeadId() {
		return headId;
	}

	public void setHeadId(Long headId) {
		this.headId = headId;
	}

	public Long getChildId() {
		return childId;
	}

	public void setChildId(Long childId) {
		this.childId = childId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getBillNo() {
		return billNo;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public Date getInsertedOn() {
		return insertedOn;
	}

	public void setInsertedOn(Date insertedOn) {
		this.insertedOn = insertedOn;
	}

	public Date getUpadatedOn() {
		return upadatedOn;
	}

	public void setUpadatedOn(Date upadatedOn) {
		this.upadatedOn = upadatedOn;
	}

	
}

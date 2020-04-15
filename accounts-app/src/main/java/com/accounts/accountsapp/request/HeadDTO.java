package com.accounts.accountsapp.request;

import javax.validation.constraints.NotNull;

public class HeadDTO {

	private long id;

	@NotNull(message = "Headname can't be empty")
	private String item;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}



}

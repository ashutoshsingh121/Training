package com.demo;

public class Status {

	private boolean queryStatus;

	public Status() {
		// TODO Auto-generated constructor stub
	}

	public Status(boolean queryStatus) {
		this.queryStatus = queryStatus;
	}

	public boolean isQueryStatus() {
		return queryStatus;
	}

	public void setQueryStatus(boolean queryStatus) {
		this.queryStatus = queryStatus;
	}

	@Override
	public String toString() {
		return "Status [queryStatus=" + queryStatus + "]";
	}

}

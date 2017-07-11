package com.ale.web.websocket.enity;

public class UserMessage {

    private String userDn;
    
    private String operationType;

    public UserMessage() {
    }

    public UserMessage(String userDn, String operationType) {
        this.userDn = userDn;
        this.operationType = operationType;
    }

	public String getUserDn() {
		return userDn;
	}

	public void setUserDn(String userDn) {
		this.userDn = userDn;
	}

	public String getOperationType() {
		return operationType;
	}

	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}


}

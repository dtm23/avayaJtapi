package com.avaya.jtapi.tsapi;

import javax.telephony.InvalidPartyException;

public final class TsapiInvalidPartyException extends InvalidPartyException
		implements ITsapiException {
	private static final long serialVersionUID = 1L;
	int errorType = 0;
	int errorCode = 0;

	public int getErrorType() {
		return this.errorType;
	}

	public int getErrorCode() {
		return this.errorCode;
	}

	public TsapiInvalidPartyException(int _errorType, int _errorCode, int type) {
		super(type);
		this.errorType = _errorType;
		this.errorCode = _errorCode;
	}

	public TsapiInvalidPartyException(int _errorType, int _errorCode, int type,
			String s) {
		super(type, s);
		this.errorType = _errorType;
		this.errorCode = _errorCode;
	}
}
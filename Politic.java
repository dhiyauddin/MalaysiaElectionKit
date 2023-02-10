package com.dhiyauddin.action;

import java.util.HashMap;
import java.util.Map;

public enum Politic {

	BN(1, "Barisan Nasional of Malaysia"), UMNO(2, "Pertubuhan Kebangsaan Melayu Bersatu"),
	MCA(3, "Malaysian Chinese Association"), MIC(4, "The Malaysian India Congress"), PAS(5, "Parti Islam Se Malaysia"),
	BERSATU(6, "Parti Pribumi Bersatu Malaysia"), PH(7, "Palatan Harapan"), AMANAH(8, "Parti Amanah Negara");

	private static class Holder {
		static Map<Integer, Politic> map = new HashMap<Integer, Politic>();
	}

	private final int partyNumber;
	private final String fullName;
	// presiden name
	// saving/capital
	// total active mp/seats
	// total members
	// fee membership
	// ros registration number
	// email

	private Politic(int partyNumber, String fullName) {
		this.partyNumber = partyNumber;
		this.fullName = fullName;
	}

	public int getPartyNumber() {
		return partyNumber;
	}

	public String getFullName() {
		return fullName;
	}

}

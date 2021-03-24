package com.society.core.vms.util;

import java.util.ArrayList;
import java.util.List;

public class ValidationUtils {
	/**
	 * Check the String for empty 
	 * @param input
	 * @return false if its not null or no value except space,else true.
	 */
	public static boolean isEmptyString(String input) {
		return !(null == input || input.trim().length()==0);
		
	}

	public static boolean isValidStatusValue(String input) {
		List<String> status =new ArrayList<>();
		
		status.add("VERIFIED");
		status.add("APPROVED");
		status.add("REJECTED");
		status.add("HOLD");
		
		return status.contains(input);
		
	}
}

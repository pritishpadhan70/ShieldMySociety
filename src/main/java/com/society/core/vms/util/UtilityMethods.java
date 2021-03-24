package com.society.core.vms.util;

import java.sql.Timestamp;
import java.util.Random;
import java.util.regex.Pattern;

import com.society.core.vms.dto.ChangePassword;
import com.society.core.vms.dto.FlatDTO;
import com.society.core.vms.dto.VisitorDTO;
import com.society.core.vms.exceptions.InvalidInputDataException;
import com.society.core.vms.exceptions.InvalidTimeDifferenceException;
import com.society.core.vms.exceptions.PersistanceException;

public class UtilityMethods {
	
	public static void main(String args[]) {
		System.out.println(getRamdomCode(10, true, false));
	}

	public static String getOTPString() {
		Random rnd = new Random();
		int number = rnd.nextInt(999999);
		return String.format("%06d", number);
	}

	public static Timestamp getCurrentTimeStamp() {

		return new Timestamp(System.currentTimeMillis());
	}

	public static long getTimeStampDifference(Timestamp oldTime, Timestamp currentTime, String unit)
			throws InvalidTimeDifferenceException {

		long diff = currentTime.getTime() - oldTime.getTime();

		switch (unit) {

		case ApplicationConstants.MINUTE:
			return diff / (60 * 1000);

		case ApplicationConstants.SECOND:
			return diff / 1000;

		case ApplicationConstants.HOUR:
			return diff / (60 * 60 * 1000);

		case ApplicationConstants.DAY:
			return diff / (24 * 60 * 60 * 1000);

		default:
			throw new InvalidTimeDifferenceException("Invalid entry: " + unit);

		}

	}

	/**
	 * Method to generate random String
	 * @param size
	 * @param isNumberIncluded
	 * @param smallLetterIncluded
	 * @return 
	 */
	public static String getRamdomCode(int size, boolean isNumberIncluded, boolean smallLetterIncluded) {

		String optionString = ApplicationConstants.A_TO_Z_CAPS;
		
		if(isNumberIncluded) {
			optionString = optionString + ApplicationConstants.ALL_NUMBER_STRING;
		}
		if(smallLetterIncluded) {
			optionString = optionString + ApplicationConstants.A_TO_Z_SMALL;

		}

		StringBuilder sb = new StringBuilder(size);

		for (int i = 0; i < size; i++) {

			// generate a random number between 0 to string size
			int index = (int) (optionString.length() * Math.random());
			sb.append(optionString.charAt(index));
		}

		return sb.toString();
	}

	public static void verifyChangePasswordObject(ChangePassword pass) throws InvalidInputDataException {
		
		if (pass == null || pass.getUserId() == null
				|| pass.getOldPassword() == null || pass.getOldPassword().trim().isEmpty()
				|| pass.getNewPassword() == null || pass.getNewPassword().trim().isEmpty()
				|| pass.getConfNewPassword() == null || pass.getConfNewPassword().trim().isEmpty()) {
			
			System.out.println("Invalid data for password change");
			throw new InvalidInputDataException("Invalid data for password change");
		}
		
		if (!pass.getNewPassword().equals(pass.getConfNewPassword())) {
			
			System.out.println("New password & confirm password doesnt not match");
			throw new InvalidInputDataException("New password & confirm password doesnt not match");

		}
		System.out.println("Password change object verified succesfully.");
	}

	public static boolean isValidEmail(String emailString) throws InvalidInputDataException {

		Pattern pat = Pattern.compile(ApplicationConstants.EMAIL_REGEX);
		return pat.matcher(emailString).matches();
	}

	public static boolean isValidPhone(String id) {

		try {
			Long.valueOf(id);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	/*
	 * public static void validateFlatObject(FlatDTO flat) throws
	 * InvalidInputDataException {
	 * 
	 * if (flat == null || flat.getFlatName() == null ||
	 * flat.getFlatName().isBlank() || flat.getBlock() == null ||
	 * flat.getBlock().isBlank() || flat.getSocietyId() == null) {
	 * 
	 * throw new InvalidInputDataException("In valid flat object"); }
	 * 
	 * }
	 * 
	 * public static void validateVisitorObject(VisitorDTO visitor) throws
	 * InvalidInputDataException {
	 * 
	 * if(null == visitor|| visitor.getFirstName() == null ||
	 * visitor.getFirstName().isBlank()|| visitor.getFlatid() == null ||
	 * visitor.getFlatid().isBlank()) {
	 * 
	 * throw new InvalidInputDataException("Invalid Visitor object"); } }
	 */
}

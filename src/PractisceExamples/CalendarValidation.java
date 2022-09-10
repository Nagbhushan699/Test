package PractisceExamples;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CalendarValidation {

	public static void main(String[] args) throws Exception {
		String targetDate="28-Jan-2021";
		SimpleDateFormat targetDateFormat=new SimpleDateFormat("dd-MMM-YYYY");
		Date formattedTargetDate;
		try{
			targetDateFormat.setLenient(false);
			formattedTargetDate=targetDateFormat.parse(targetDate);
		}
		catch(Exception e) {
			throw new Exception("Invalid Date is provided,Please check input date");
		}

	}

}

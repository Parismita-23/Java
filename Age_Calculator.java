package first_jav;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Age_Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	//User input for birth date
		System.out.println("Enter your birth date (YYYY-MM-DD): ");
		String birthDateInput = scanner.nextLine();
		LocalDate birthDate = LocalDate.parse(birthDateInput);
		
	//User input for reference date
		System.out.println("Enter the reference date (YYYY-MM-DD): ");
		String referenceDateInput = scanner.nextLine();
		LocalDate referenceDate = LocalDate.parse(referenceDateInput);
		
	Period age = Period.between(birthDate, referenceDate);
	
	System.out.println("As of " + referenceDate + ", you are " + age.getYears() + " years," + age.getMonths() + " months, and " + age.getDays() + " days old.");
	scanner.close();
	}
	}

package email.com.admin;

import java.awt.DisplayMode;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

// TODO: Auto-generated Javadoc
/**
 * The Class Email.
 */
public class Email {

	/** The first name. */
	private String firstName;

	/** The last name. */
	private String lastName;

	/** The password. */
	private String password;

	/** The department. */
	private String department;

	/** The mailbox capacity. */
	private int mailboxCapacity = 500;

	/** The alternate email. */
	private String alternateEmail;

	/** The default password length. */
	private int defaultPasswordLength = 10;

	/** The email. */
	private String email;

	/** The company suffix. */
	private String companySuffix = "company.com";

	/**
	 * Instantiates a new email.
	 *
	 * @param firstName the first name
	 * @param lastName  the last name
	 */
	// Constructor to receive the first and last name.
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		// System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

		// call a method for the department and return the department.
		this.department = setDepartment();
		// System.out.println("Department: " + this.department);

		// call a method to call a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("This is your password: " + this.password);

		// combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		// System.out.println("Your email is: " + email);
	}

	/**
	 * Sets the department.
	 *
	 * @return the string
	 */
	// ask for the department
	private String setDepartment() {
		System.out.print(
				"DEPERTAMENT CODES TO SELECT:\n1 for Sales\n2 for Development\n3 for Account\n0 for None\nEnter your Selective Department Code Here:");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();

		switch (depChoice) {
		case 1:
			return "Sales";
		// break;
		case 2:
			return "Development";
		// break;
		case 3:
			return "Accounting";
		// break;
		default:
			return "Department Entered isn't available";
		// break;
		}

		/*
		 * if (depChoice == 1) { return "Sales"; } else if (depChoice == 2) { return
		 * "Development"; } else if (depChoice == 3) return "Accouting"; else { return
		 * "None "; }
		 */
	}

	/**
	 * Random password.
	 *
	 * @param length the length
	 * @return the string
	 */
	// generate the random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}

	/**
	 * Sets the mailbox capacity.
	 *
	 * @param capacity the new mailbox capacity
	 */
	// set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}

	/**
	 * Sets the alternate email.
	 *
	 * @param altEmail the new alternate email
	 */
	// set the alternate mail
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}

	/**
	 * Change password.
	 *
	 * @param password the password
	 */
	// change the password
	public void changePassword(String password) {
		this.password = password;
	}

	/**
	 * Gets the mailboxcapacity.
	 *
	 * @return the mailboxcapacity
	 */
	public int getMailboxcapacity() {
		return mailboxCapacity;
	}

	/**
	 * Gets the alternate email.
	 *
	 * @return the alternate email
	 */
	public String getAlternateEmail() {
		return alternateEmail;
	}

	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Show info.
	 *
	 * @return the string
	 */
	public String showInfo() {
		return "Display NAME :" + firstName + " " + lastName + "\nDEPARTMENT :" + department + "\nCOMPANY EMAIL :"
				+ email + "\nMAILBOX CAPACITY :" + mailboxCapacity + "mb";

	}
}

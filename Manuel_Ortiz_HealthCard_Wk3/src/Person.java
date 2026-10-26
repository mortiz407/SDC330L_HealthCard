/**
 * Name: Manuel Ortiz
 * Date: 10/25/2026
 * Assignment: Week 3 Project - Abstraction, Constructors, and Access Specifiers
 *
 * Purpose:
 *   Represents patient demographic data.
 *   Demonstrates composition (has-a EmergencyContact) and constructor overloading.
 */
public class Person {
    // ACCESS SPECIFIERS: Private demographic data
    private String fullName;
    private String dateOfBirth;

    // DEMONSTRATION: COMPOSITION
    // A Person "has-an" EmergencyContact object stored inside it
    private EmergencyContact emergencyContact;

    // CONSTRUCTOR 1: Minimal constructor when no contact is provided upfront
    public Person(String fullName, String dateOfBirth) {
        this(fullName, dateOfBirth, new EmergencyContact());
    }

    // CONSTRUCTOR 2: Fully-parameterized constructor
    public Person(String fullName, String dateOfBirth, EmergencyContact emergencyContact) {
        this.fullName = (fullName == null || fullName.trim().isEmpty()) ? "Unknown Patient" : fullName.trim();
        this.dateOfBirth = (dateOfBirth == null || dateOfBirth.trim().isEmpty()) ? "Not Provided" : dateOfBirth.trim();
        this.emergencyContact = (emergencyContact == null) ? new EmergencyContact() : emergencyContact;
    }

    // ACCESS SPECIFIERS: Public getters
    public String getFullName() {
        return fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public EmergencyContact getEmergencyContact() {
        return emergencyContact;
    }

    public void displayPersonInfo() {
        System.out.println("Patient Name:      " + fullName);
        System.out.println("Date of Birth:     " + dateOfBirth);
        System.out.println("Emergency Contact: " + emergencyContact.getContactDetails());
    }
}
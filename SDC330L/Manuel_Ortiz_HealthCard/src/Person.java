/**
 * Name: Manuel Ortiz
 * Date: 10/18/2026
 * Assignment: Week 2 Project
 *
 * Purpose:
 *   Represents patient demographic data.
 *   Demonstrates COMPOSITION by housing an EmergencyContact object.
 */
public class Person {
    private String fullName;
    private String dateOfBirth;

    // DEMONSTRATION: COMPOSITION
    // A Person "has-an" EmergencyContact object stored as an attribute.
    private EmergencyContact emergencyContact;

    public Person(String fullName, String dateOfBirth, EmergencyContact emergencyContact) {
        this.fullName = (fullName == null || fullName.trim().isEmpty()) ? "Unknown Patient" : fullName.trim();
        this.dateOfBirth = (dateOfBirth == null || dateOfBirth.trim().isEmpty()) ? "Not Provided" : dateOfBirth.trim();
        this.emergencyContact = (emergencyContact == null)
                ? new EmergencyContact("Unknown Contact", "Emergency Contact", "Not Provided")
                : emergencyContact;
    }

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
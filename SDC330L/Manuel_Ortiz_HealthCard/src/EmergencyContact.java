/**
 * Name: Manuel Ortiz
 * Date: 10/18/2026
 * Assignment: Week 2 Project
 *
 * Purpose: Represents an emergency contact person and phone number.
 * Used to demonstrate COMPOSITION inside the Person class.
 */
public class EmergencyContact {
    private String contactName;
    private String relationship;
    private String phoneNumber;

    public EmergencyContact(String contactName, String relationship, String phoneNumber) {
        this.contactName = (contactName == null || contactName.trim().isEmpty()) ? "Unknown Contact" : contactName.trim();
        this.relationship = (relationship == null || relationship.trim().isEmpty()) ? "Emergency Contact" : relationship.trim();
        this.phoneNumber = (phoneNumber == null || phoneNumber.trim().isEmpty()) ? "Not Provided" : phoneNumber.trim();
    }

    public String getContactName() {
        return contactName;
    }

    public String getRelationship() {
        return relationship;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getContactDetails() {
        return contactName + " (" + relationship + ") - Phone: " + phoneNumber;
    }
}
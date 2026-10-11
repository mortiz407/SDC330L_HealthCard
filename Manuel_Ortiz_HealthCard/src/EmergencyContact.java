/**
 * Name: Manuel Ortiz
 * Date: 10/11/2026
 * Assignment: Week 1 Project Inheritance, Composition, and User Interactions
 *
 * Purpose:
 *   Represents an emergency contact person and phone number.
 *   Used to demonstrate COMPOSITION inside the Person class.
 */
public class EmergencyContact {
    private String contactName;
    private String relationship;
    private String phoneNumber;

    public EmergencyContact(String contactName, String relationship, String phoneNumber) {
        this.contactName = contactName;
        this.relationship = relationship;
        this.phoneNumber = phoneNumber;
    }

    public String getContactDetails() {
        return contactName + " (" + relationship + ") - Phone: " + phoneNumber;
    }
}
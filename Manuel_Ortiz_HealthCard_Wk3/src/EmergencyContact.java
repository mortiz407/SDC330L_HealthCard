/**
 * Name: Manuel Ortiz
 * Date: 10/25/2026
 * Assignment: Week 3 Project - Abstraction, Constructors, and Access Specifiers
 *
 * Purpose:
 *   Holds emergency contact details.
 *   Shows private fields, public getters, and overloaded constructors.
 */
public class EmergencyContact {
    // ACCESS SPECIFIERS: Private so external classes cannot directly change contact info
    private String contactName;
    private String relationship;
    private String phoneNumber;

    // CONSTRUCTOR 1: Default / no-argument backup constructor using this()
    public EmergencyContact() {
        this("Unknown Contact", "Emergency Contact", "Not Provided");
    }

    // CONSTRUCTOR 2: Fully-parameterized constructor with basic cleanup
    public EmergencyContact(String contactName, String relationship, String phoneNumber) {
        this.contactName = (contactName == null || contactName.trim().isEmpty()) ? "Unknown Contact" : contactName.trim();
        this.relationship = (relationship == null || relationship.trim().isEmpty()) ? "Emergency Contact" : relationship.trim();
        this.phoneNumber = (phoneNumber == null || phoneNumber.trim().isEmpty()) ? "Not Provided" : phoneNumber.trim();
    }

    // ACCESS SPECIFIERS: Public getters give read-only access
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
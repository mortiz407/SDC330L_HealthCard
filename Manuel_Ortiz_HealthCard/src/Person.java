/**
 * Name: Manuel Ortiz
 * Date: 10/11/2026
 * Assignment: Week 1 Project Inheritance, Composition, and User Interactions
 *
 * Purpose:
 *   Base class representing general person information.
 *   Demonstrates COMPOSITION by housing an EmergencyContact object.
 */
public class Person {
    protected String fullName;

    // DEMONSTRATION: COMPOSITION
    // A Person "has-an" EmergencyContact object stored as an attribute.
    protected EmergencyContact emergencyContact;

    public Person(String fullName, EmergencyContact emergencyContact) {
        this.fullName = fullName;
        this.emergencyContact = emergencyContact;
    }

    public void displayCard() {
        System.out.println("Patient Name:      " + fullName);
        System.out.println("Emergency Contact: " + emergencyContact.getContactDetails());
    }
}
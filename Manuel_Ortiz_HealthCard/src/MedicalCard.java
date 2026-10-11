/**
 * Name: Manuel Ortiz
 * Date: 10/11/2026
 * Assignment: Week 1 Project Inheritance, Composition, and User Interactions
 *
 * Purpose:
 *   Derived class representing a specialized medical health card.
 *   Demonstrates INHERITANCE by extending the Person base class.
 */

// DEMONSTRATION: INHERITANCE
// MedicalCard "is-a" Person and inherits the base properties and methods.
public class MedicalCard extends Person {
    private String dateOfBirth;
    private String allergies;
    private String illnesses;

    public MedicalCard(String fullName, EmergencyContact emergencyContact, String dateOfBirth, String allergies, String illnesses) {
        // Calls the parent class constructor
        super(fullName, emergencyContact);
        this.dateOfBirth = dateOfBirth;
        this.allergies = allergies;
        this.illnesses = illnesses;
    }

    @Override
    public void displayCard() {
        // Call the parent Person print statements first
        super.displayCard();
        
        // Print the specialized medical attributes
        System.out.println("Date of Birth:     " + dateOfBirth);
        System.out.println("Known Allergies:   " + allergies);
        System.out.println("Medical Illnesses: " + illnesses);
    }
}
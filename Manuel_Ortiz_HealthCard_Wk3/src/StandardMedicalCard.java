/**
 * Name: Manuel Ortiz
 * Date: 10/25/2026
 * Assignment: Week 3 Project - Abstraction, Constructors, and Access Specifiers
 *
 * Purpose:
 *   Standard campus clinic health card.
 *   Demonstrates inheritance (is-a MedicalCard), abstraction, and polymorphism.
 */

// DEMONSTRATION: INHERITANCE
// StandardMedicalCard "is-a" MedicalCard
public class StandardMedicalCard extends MedicalCard {
    // ACCESS SPECIFIERS: Private fields unique to routine care
    private String allergies;
    private String immunizationStatus;

    // CONSTRUCTOR 1: Minimal constructor for quick entry with no known allergies
    public StandardMedicalCard(String cardId, Person patient) {
        this(cardId, patient, "None Reported", "Up-To-Date");
    }

    // CONSTRUCTOR 2: Fully-parameterized constructor
    public StandardMedicalCard(String cardId, Person patient, String allergies, String immunizationStatus) {
        super(cardId, patient);
        this.allergies = (allergies == null || allergies.trim().isEmpty()) ? "None Reported" : allergies.trim();
        this.immunizationStatus = (immunizationStatus == null || immunizationStatus.trim().isEmpty()) ? "Unknown" : immunizationStatus.trim();
    }

    // DEMONSTRATION: ABSTRACTION (Fulfills the abstract method from MedicalCard)
    @Override
    public String getTriageLevel() {
        return "Standard / Routine Care";
    }

    // DEMONSTRATION: ABSTRACTION (Provides the banner title required by MedicalCard)
    @Override
    protected String getCardTypeLabel() {
        return "STANDARD CAMPUS MEDICAL CARD";
    }

    // DEMONSTRATION: POLYMORPHISM
    // Calls base class displayCard() and appends routine clinical data
    @Override
    public void displayCard() {
        super.displayCard();
        System.out.println("Known Allergies:   " + allergies);
        System.out.println("Immunization:      " + immunizationStatus);
        System.out.println();
    }

    @Override
    public String exportSummary() {
        return String.format("[STANDARD] ID: %s | Patient: %s | Status: %s",
                getCardId(), patient.getFullName(), immunizationStatus);
    }
}
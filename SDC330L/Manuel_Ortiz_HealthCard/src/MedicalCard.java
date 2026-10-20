/**
 * Name: Manuel Ortiz
 * Date: 10/18/2026
 * Assignment: Week 2 Project
 *
 * Purpose:
 *   Abstract base class representing a health card.
 *   Addresses Week 1 feedback: MedicalCard HAS-A Person (Composition), 
 *   rather than inheriting from Person.
 */

// DEMONSTRATING INTERFACE IMPLEMENTATION
public abstract class MedicalCard implements Exportable {
    private String cardId;

    // DEMONSTRATION: COMPOSITION
    // A MedicalCard "has-a" Person (Patient) rather than inheriting from Person.
    protected Person patient;

    public MedicalCard(String cardId, Person patient) {
        this.cardId = (cardId == null || cardId.trim().isEmpty()) ? "UNKNOWN-CARD" : cardId.trim();
        this.patient = (patient == null)
                ? new Person("Unknown Patient", "Not Provided", null)
                : patient;
    }

    public String getCardId() {
        return cardId;
    }

    public Person getPatient() {
        return patient;
    }

    // Abstract method to be implemented polymorphically by derived cards
    public abstract String getTriageLevel();

    @Override
    public void displayCard() {
        System.out.println("Card ID:           " + cardId);
        patient.displayPersonInfo();
        System.out.println("Triage Category:   " + getTriageLevel());
    }
}
/**
 * Name: Manuel Ortiz
 * Date: 10/25/2026
 * Assignment: Week 3 Project - Abstraction, Constructors, and Access Specifiers
 *
 * Purpose:
 *   Abstract base class for all health cards.
 *   Demonstrates abstraction (cannot be instantiated directly),
 *   composition (has-a Person), and abstract methods.
 */

// DEMONSTRATION: ABSTRACTION
// Abstract base class: forces subclasses to provide specific card logic
public abstract class MedicalCard implements Exportable {
    // ACCESS SPECIFIER: Private card identifier
    private String cardId;

    // ACCESS SPECIFIER: Protected so derived classes can directly read patient info
    // DEMONSTRATION: COMPOSITION (A MedicalCard has-a Person)
    protected Person patient;

    // CONSTRUCTOR: Base constructor called by child classes via super()
    public MedicalCard(String cardId, Person patient) {
        this.cardId = (cardId == null || cardId.trim().isEmpty()) ? "UNKNOWN-CARD" : cardId.trim();
        this.patient = (patient == null) ? new Person("Unknown Patient", "Not Provided") : patient;
    }

    public String getCardId() {
        return cardId;
    }

    public Person getPatient() {
        return patient;
    }

    // DEMONSTRATION: ABSTRACT METHODS
    // Subclasses MUST implement these to provide their own triage status and banner label
    public abstract String getTriageLevel();
    protected abstract String getCardTypeLabel();

    // Reusable template method shared by every card
    @Override
    public void displayCard() {
        printBanner();
        System.out.println("Card ID:           " + cardId);
        patient.displayPersonInfo();
        System.out.println("Triage Category:   " + getTriageLevel());
    }

    // ACCESS SPECIFIER: Private helper method only used inside this class
    private void printBanner() {
        System.out.println();
        System.out.println("          " + getCardTypeLabel());
        System.out.println();
    }
}
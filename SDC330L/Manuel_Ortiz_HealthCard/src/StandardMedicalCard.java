/**
 * Name: Manuel Ortiz
 * Date: 10/18/2026
 * Assignment: Week 2
 *
 * Purpose:
 *   Derived class representing a standard campus/clinic medical card.
 *   Demonstrates INHERITANCE: StandardMedicalCard "is-a" MedicalCard.
 */

// DEMONSTRATION: INHERITANCE
public class StandardMedicalCard extends MedicalCard {
    private String allergies;
    private String immunizationStatus;

    public StandardMedicalCard(String cardId, Person patient, String allergies, String immunizationStatus) {
        super(cardId, patient);
        this.allergies = allergies;
        this.immunizationStatus = immunizationStatus;
    }

    @Override
    public String getTriageLevel() {
        return "Standard / Routine Care";
    }

    // DEMONSTRATION: POLYMORPHISM (Overriding displayCard for standard formatting)
    @Override
    public void displayCard() {

        System.out.println("           STANDARD CAMPUS MEDICAL CARD           ");
        System.out.println();
        super.displayCard();
        System.out.println("Known Allergies:   " + allergies);
        System.out.println("Immunization:      " + immunizationStatus);
    }

    @Override
    public String exportSummary() {
        return String.format("[STANDARD] ID: %s | Patient: %s | Status: %s",
                getCardId(), patient.getFullName(), immunizationStatus);
    }
}
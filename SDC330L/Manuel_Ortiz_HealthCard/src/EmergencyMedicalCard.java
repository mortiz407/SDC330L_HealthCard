/**
 * Name: Manuel Ortiz
 * Date: 10/18/2026
 * Assignment: Week 2 Project
 *
 * Purpose:
 *   Derived class representing a critical care medical card.
 *   Demonstrates INHERITANCE: EmergencyMedicalCard "is-a" MedicalCard.
 */

// DEMONSTRATION: INHERITANCE
public class EmergencyMedicalCard extends MedicalCard {
    private String chronicConditions;
    private String actionPlan;

    public EmergencyMedicalCard(String cardId, Person patient, String chronicConditions, String actionPlan) {
        super(cardId, patient);
        this.chronicConditions = chronicConditions;
        this.actionPlan = actionPlan;
    }

    @Override
    public String getTriageLevel() {
        return "CRITICAL - IMMEDIATE INTERVENTION REQUIRED";
    }

    // DEMONSTRATION: POLYMORPHISM (Overriding displayCard for alert formatting)
    @Override
    public void displayCard() {
        System.out.println("          CRITICAL EMERGENCY ALERT CARD           ");
        System.out.println();
        super.displayCard();
        System.out.println("Conditions:        " + chronicConditions);
        System.out.println("ACTION PLAN:       " + actionPlan);

    }

    @Override
    public String exportSummary() {
        return String.format("[CRITICAL] ID: %s | Patient: %s | Urgent Plan: %s",
                getCardId(), patient.getFullName(), actionPlan);
    }
}
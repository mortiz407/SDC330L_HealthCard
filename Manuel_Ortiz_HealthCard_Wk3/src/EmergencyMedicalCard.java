/**
 * Name: Manuel Ortiz
 * Date: 10/25/2026
 * Assignment: Week 3 Project - Abstraction, Constructors, and Access Specifiers
 *
 * Purpose:
 *   Critical emergency alert card.
 *   Demonstrates inheritance (is-a MedicalCard), abstraction, and polymorphism.
 */

// DEMONSTRATION: INHERITANCE
// EmergencyMedicalCard "is-a" MedicalCard
public class EmergencyMedicalCard extends MedicalCard {
    // ACCESS SPECIFIERS: Private fields for high-priority emergency alerts
    private String chronicConditions;
    private String actionPlan;

    // CONSTRUCTOR 1: Minimal constructor with a default emergency plan
    public EmergencyMedicalCard(String cardId, Person patient, String chronicConditions) {
        this(cardId, patient, chronicConditions, "Call 911 and contact primary guardian immediately.");
    }

    // CONSTRUCTOR 2: Fully-parameterized constructor
    public EmergencyMedicalCard(String cardId, Person patient, String chronicConditions, String actionPlan) {
        super(cardId, patient);
        this.chronicConditions = (chronicConditions == null || chronicConditions.trim().isEmpty()) ? "None Specified" : chronicConditions.trim();
        this.actionPlan = (actionPlan == null || actionPlan.trim().isEmpty()) ? "Contact Emergency Services" : actionPlan.trim();
    }

    // DEMONSTRATION: ABSTRACTION (Fulfills abstract method from MedicalCard)
    @Override
    public String getTriageLevel() {
        return "CRITICAL - IMMEDIATE INTERVENTION REQUIRED";
    }

    // DEMONSTRATION: ABSTRACTION (Provides the emergency banner title)
    @Override
    protected String getCardTypeLabel() {
        return "CRITICAL EMERGENCY ALERT CARD";
    }

    // DEMONSTRATION: POLYMORPHISM
    // Calls base class displayCard() and appends urgent emergency actions
    @Override
    public void displayCard() {
        super.displayCard();
        System.out.println("Conditions:        " + chronicConditions);
        System.out.println("ACTION PLAN:       " + actionPlan);
        System.out.println();
    }

    @Override
    public String exportSummary() {
        return String.format("[CRITICAL] ID: %s | Patient: %s | Urgent Plan: %s",
                getCardId(), patient.getFullName(), actionPlan);
    }
}
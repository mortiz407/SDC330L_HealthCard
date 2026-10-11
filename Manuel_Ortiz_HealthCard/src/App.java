/**
 * Name: Manuel Ortiz
 * Date: 10/11/2026
 * Assignment: Week 1 Project Inheritance, Composition, and User Interactions
 *
 * Purpose:
 *   Main driver application for the Digital Health Card prototype.
 *   Displays the startup banner, instructions, and tests the object model.
 */
public class App {
    public static void main(String[] args) {
        // Week 1 indicator and student information header
        System.out.println("PROJECT WEEK 1: Digital Health Card Prototype");
        System.out.println("Author: Manuel Ortiz");

        // Friendly startup message and instructions
        System.out.println("\nWelcome to the Digital Health Card System!");
        System.out.println("Quote: \"Stay organized today, WebMD won't save you tomorrow.\"\n");
        System.out.println("Below is a quick prototype test loading sample medical records:\n");

        // 1. Create the composite object (EmergencyContact)
        EmergencyContact contactPerson = new EmergencyContact(
            "Maria Ortiz",
            "Mother",
            "(123) 456-7899"
        );

        // 2. Create the child class (MedicalCard) populated with realistic data
        MedicalCard patientCard = new MedicalCard(
            "Manuel Ortiz",
            contactPerson,
            "04/15/2003",
            "Penicillin, Peanuts",
            "Mild Asthma"
        );

        // 3. Print out the formatted health card
        System.out.println(" MEDICAL ID BADGE ");
        patientCard.displayCard();

        System.out.println("\nRemember to stay hydrated! Application closing cleanly.");
    }
}
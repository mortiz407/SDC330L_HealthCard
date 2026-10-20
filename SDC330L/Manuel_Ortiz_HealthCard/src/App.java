/**
 * Name: Manuel Ortiz
 * Date: 10/18/2026
 * Assignment: Week 2 Project 
 *
 * Purpose:
 *   Main driver application for Week 2 demonstration.
 *   Demonstrates polymorphism by calling interface methods on derived card objects.
 */
public class App {
    public static void main(String[] args) {
        // Week 2 informative indicator, title, and student name
        System.out.println();
        System.out.println("PROJECT WEEK 2: Object-Oriented Interfaces & Polymorphism Demonstration");
        System.out.println("Digital Health Card Application");
        System.out.println("Author: Manuel Ortiz");

        // Welcome message
        System.out.println("\nWelcome to the Digital Health Card System!");

        // 1. Setup composite entities (EmergencyContact and Person)
        EmergencyContact contact1 = new EmergencyContact("Siwar Ortiz", "Spouse", "(123) 456-7899");
        Person patient1 = new Person("Manuel Ortiz", "07/31/1993", contact1);

        EmergencyContact contact2 = new EmergencyContact("Carlos Vance", "Brother", "(789) 456-1233");
        Person patient2 = new Person("Alex Vance", "04/15/2001", contact2);

        // 2. Instantiate derived classes demonstrating inheritance
        StandardMedicalCard standardCard = new StandardMedicalCard(
            "MC-101",
            patient1,
            "Penicillin, Peanuts",
            "Up-To-Date (Tdap, HepB)"
        );

        EmergencyMedicalCard emergencyCard = new EmergencyMedicalCard(
            "EM-901",
            patient2,
            "Severe Asthma, Peanut Anaphylaxis",
            "Administer EpiPen from backpack pocket; call 911 immediately."
        );

        // 3. DEMONSTRATION: POLYMORPHISM
        // An array of the interface type (Exportable) holds instances of different derived classes.
        Exportable[] healthRecords = new Exportable[] { standardCard, emergencyCard };

        System.out.println(" POLYMORPHIC BADGE DISPLAY \n");
        for (Exportable record : healthRecords) {
            // Polymorphically executes either StandardMedicalCard or EmergencyMedicalCard displayCard()
            record.displayCard();
            System.out.println();
        }

        System.out.println(" POLYMORPHIC AUDIT EXPORT \n");
        for (Exportable record : healthRecords) {
            // Polymorphically executes exportSummary()
            System.out.println(record.exportSummary());
        }

        System.out.println("\nStay safe, drink some water, and remember to wash your hands!");
    }
}

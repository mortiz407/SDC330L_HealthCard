/**
 * Name: Manuel Ortiz
 * Date: 10/25/2026
 * Assignment: Week 3 Project - Abstraction, Constructors, and Access Specifiers
 *
 * Purpose:
 *   Driver application testing overloaded constructors, access specifiers,
 *   and polymorphic execution across abstract cards and interfaces.
 */
public class App {
    public static void main(String[] args) {
        // Week 3 indicator, assignment title, and student name
        System.out.println();
        System.out.println("PROJECT WEEK 3: Abstraction, Constructors, and Access Specifiers Demonstration");
        System.out.println("Digital Health Card Application");
        System.out.println("Author: Manuel Ortiz");
        System.out.println();

        // 1. CONSTRUCTORS DEMO: Full parameterized constructors
        EmergencyContact contact1 = new EmergencyContact("Siwar Ortiz", "Spouse", "(123) 456-7899");
        Person patient1 = new Person("Manuel Ortiz", "07/31/1993", contact1);
        StandardMedicalCard card1 = new StandardMedicalCard(
            "MC-101",
            patient1,
            "Penicillin, Peanuts",
            "Up-To-Date (Tdap, HepB)"
        );

        // 2. CONSTRUCTORS DEMO: Shortcut overloaded constructors (using default values)
        Person patient2 = new Person("Alex Vance", "04/15/2001");
        StandardMedicalCard card2 = new StandardMedicalCard("MC-102", patient2);

        // 3. CONSTRUCTORS DEMO: Critical care card setup
        EmergencyContact contact3 = new EmergencyContact("Carlos Vance", "Brother", "(789) 456-1233");
        Person patient3 = new Person("Jordan Taylor", "11/03/1998", contact3);
        EmergencyMedicalCard card3 = new EmergencyMedicalCard(
            "EM-901",
            patient3,
            "Severe Asthma, Peanut Anaphylaxis",
            "Administer EpiPen from backpack pocket; call 911 immediately."
        );

        // DEMONSTRATION: POLYMORPHISM & ABSTRACTION
        // Storing mixed derived objects in an array of the interface type (Exportable)
        Exportable[] cardList = new Exportable[] { card1, card2, card3 };

        System.out.println("            POLYMORPHIC BADGE DISPLAY\n");
        for (Exportable card : cardList) {
            // Polymorphically runs the correct card implementation
            card.displayCard();
            System.out.println();
        }

        System.out.println("            POLYMORPHIC AUDIT EXPORT\n");
        for (Exportable card : cardList) {
            // Polymorphically exports single-line summary
            System.out.println(card.exportSummary());
        }

        System.out.println("\nStay safe, drink some water, and remember to wash your hands!\n");
    }
}
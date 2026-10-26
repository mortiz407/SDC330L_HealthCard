/**
 * Name: Manuel Ortiz
 * Date: 10/25/2026
 * Assignment: Week 3 Project - Abstraction, Constructors, and Access Specifiers
 *
 * Purpose:
 *   Interface that defines the contract for displaying and exporting cards.
 */

// DEMONSTRATION: CREATION OF AN INTERFACE
// PUBLIC ACCESS: Must be public so any class or package can use this contract
public interface Exportable {
    void displayCard();
    String exportSummary();
}
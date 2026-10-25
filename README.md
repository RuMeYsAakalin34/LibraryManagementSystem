# LibraryManagementSystem
Java Library Management System featuring HashMap optimization and robust error handling.

## 🚀 Key Architectural Highlights
- **O(1) Lookup Performance:** Built using `HashMap<Integer, Book>` instead of linear `ArrayList` collections to achieve constant time complexity for book lookup, insertion, and deletion by primary key (Book ID).
- **Encapsulation & OOP Standards:** Strict private field protection with explicit getters and setters across domain models (`Book.java`).
- **Defensive Programming:** Active input validation via `IllegalArgumentException` for illegal states (e.g., negative IDs, blank strings).
- **Multi-Criteria Search:** Supports exact-match ID searches as well as title-based linear searches using `bookMap.values()`.

## 📂 Project Structure
- `Book.java` - Domain model representing book properties (ID, title, author, page count, availability status).
- `Library.java` - Core business manager logic handling `HashMap` storage, borrowing, returning, and searching.
- `Main.java` - Integration test runner demonstrating system capabilities and defensive programming exception handling.

## 🛠️ How to Run
1. Clone or download this repository.
2. Open the project in Eclipse IDE, IntelliJ IDEA, or VS Code.
3. Ensure JDK 17 or higher is configured in your build path.
4. Run `Main.java` to execute the automated test scenario.

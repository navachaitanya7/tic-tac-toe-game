# tic-tac-toe-game
Tic-tac-toe game built using Java

# Tic-Tac-Toe Game in Java

This repository contains a simple implementation of the classic Tic-Tac-Toe game written in Java.

## Table of Contents

* [Features](#features)
* [How to Run](#how-to-run)
* [Game Logic](#game-logic)
* [Potential Enhancements](#potential-enhancements)
* [Contributing](#contributing)
* [License](#license)
* [Author](#author)

## Features

* Two-player mode: Play against another human player.
* Simple command-line interface for easy interaction.
* Clear display of the game board.
* Input validation to ensure players enter valid moves.
* Detects and announces the winner or a draw.

## How to Run

1.  **Prerequisites:** Ensure you have the Java Development Kit (JDK) installed on your system. You can download it from [Oracle's website](https://www.oracle.com/java/technologies/javase-downloads.html) or through your operating system's package manager.

2.  **Download the Source Code:**
    * **Clone the repository (recommended):**
        ```bash
        git clone <repository_url>
        cd tic-tac-toe-java
        ```
        (Replace `<repository_url>` with the actual URL of your GitHub repository)
    * **Download as a ZIP file:** Click the "Code" button on the repository page and select "Download ZIP". You can just extend the contents to your desired location.

3.  **Compile the Code:**
    * Open your terminal or command prompt.
    * Navigate to the directory containing the Java source file(s) (e.g., `TicTacToe.java`).
    * Compile the Java code using the `javac` command:
        ```bash
        javac TicTacToe.java
        ```
        This will generate `.class` files in the same directory.

4.  **Run the Game:**
    * In the same terminal or command prompt, execute the compiled class file using the `java` command:
        ```bash
        java TicTacToe
        ```

    * Follow the on-screen prompts to play the game. You will be asked to enter the row and column numbers (0-indexed) for your moves.

## Game Logic

The game proceeds as follows:

1.  The game board is displayed, initially empty.
2.  Players take turns entering the row and column number of the cell they want to mark with their symbol ('X' or 'O').
3.  The input is validated to ensure it's within the board boundaries and the chosen cell is empty.
4.  After each move, the board is updated and displayed.
5.  The game checks for a winner after each move by examining all rows, columns, and diagonals.
6.  If a winner is found, the game announces the winner.
7.  If all cells are filled and no winner is found,the game is declared a draw.

## Potential Enhancements

Here are some ideas for future improvements to this Tic-Tac-Toe game:

* **Graphical User Interface (GUI):** Implement a visual interface using libraries like Swing or JavaFX for a more engaging experience.
* **Artificial Intelligence (AI):** Add an AI opponent with different difficulty levels.
* **Error Handling:** Implement more robust error handling for invalid user input.
* **Multiplayer over Network:** Allow two players to play against each other over a network.
* **Configuration Options:** Allow users to customize the board size or winning condition.

## Contributing

Contributions to this project are welcome! If you have any ideas for improvements or bug fixes, please feel free to:

1.  Fork the repository.
2.  Create a new branch for your changes.
3.  Make your changes and commit them.
4.  Push your changes to your fork.
5.  Submit a pull request.

Please ensure your code follows the existing style and includes appropriate comments.

## License

This project is licensed under the [Specify your license here, e.g., MIT License](LICENSE). See the `LICENSE` file for more details.

## Author

GitHub Username: navachaitanya7

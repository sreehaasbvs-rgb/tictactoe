# tictactoe
---

# 🎮 Tic Tac Toe Game – Java Console Application

This project is a **two-player Tic Tac Toe game** developed using **Java** and executed in the **console environment**. The game follows the classic Tic Tac Toe rules, where two players take turns marking spaces on a 3×3 grid using symbols **X** and **O**. The program handles player input, validates moves, checks for winning conditions, and declares the result of the game.

---

## 📌 Project Description

The Tic Tac Toe game starts by asking the user whether they want to play or exit. Once the game begins, the program prompts both players to enter their names. Player 1 is assigned the symbol **X**, and Player 2 is assigned the symbol **O**.

The game board is represented using a **2D character array**, and it is displayed after every move. Players are required to enter the row and column numbers (ranging from 0 to 2) to place their symbol. If a player enters an invalid position or tries to place a symbol in an already occupied cell, the program asks them to try again.

---

 🛠️ Technologies and Concepts Used

* **Java Programming Language**
* Scanner class for user input
* 2D arrays for board representation
* Loops for turn management
* Conditional statements for validation
* Methods for modular and readable code

---

🏆 Game Logic

* The program checks for a win after every move.
* A player wins if three identical symbols appear:

  * In any row
  * In any column
  * Along either diagonal
* The maximum number of turns is **9**.
* If no player wins within 9 turns, the game ends in a **draw**.

---

 ▶️ How to Run the Program

1. Install Java JDK on your system.
2. Download or clone this repository.
3. Compile the program using:

   ```
   javac tictactoe.java
   ```
4. Run the program using:

   
   java tictactoe

📚 Learning Outcomes

This project helps beginners understand fundamental Java concepts such as arrays, methods, loops, input handling, and game logic implementation. It is ideal for students who want hands-on practice with basic Java programming.

 👤 Author

**Sreehaas**
Java Programming Learner 🚀

---

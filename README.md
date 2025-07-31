# Tic Tac Toe (Java)

A customizable console-based **Tic Tac Toe** game implemented in Java. Players can pick any symbol (not limited to X and O). The design is cleanly separated into core responsibilities via dedicated classes.

## Overview

The game consists of four main components:

### Classes / Responsibilities

- **Board**  
  Responsible for constructing and rendering the visual game board. Knows the current state of each cell and provides display functionality in the console.

- **Player**  
  Encapsulates each player's identity, including their chosen symbol. Symbols are arbitrary characters or strings—not restricted to traditional “X” and “O”.

- **Rules**  
  Contains the logic to evaluate the board for game-ending conditions: detecting a winner or a tie. It insulates win/tie detection from rendering and input.

- **Viewer**  
  Orchestrates the game loop: handles player turns, input parsing, invoking board updates, querying `Rules` for game state, and coordinating console output. Essentially the controller/CLI interface.

## Features

- Flexible player symbols (any single character or string)
- Clean separation of concerns (MVC-like structure without external frameworks)
- Win detection for rows, columns, and diagonals
- Tie detection (full board with no winner)
- Console-driven interactive gameplay
- Input validation (e.g., rejecting occupied cells or invalid moves)
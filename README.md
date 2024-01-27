Name - CHANDAN CHADHA
Role - associate Software Development Engineer
Company - Swiggy

*LLD of a Magical Arena game*
Question Statement:

Design a Magical Arena. Every Player is defined by a “health” attribute, “strength” attribute and an “attack” attribute - all positive integers. The player dies if his health attribute touches 0.
1. Any two player can fight a match in the arena. Players attack in turns. Attacking player rolls the attacking dice and the defending player rolls the defending dice. The “attack”  value multiplied by the outcome of the  attacking dice roll is the damage created by the attacker. The defender “strength” value, multiplied by the outcome of the defending dice is the damage defended by the defender. Whatever damage created by attacker which is in excess of the damage defended by the defender will reduce the “health” of the defender. Game ends when any players health reaches 0

2. Player with lower health attacks first at the start of a match.

3. Assume two players . Player A 50 health 5 strength 10 attack Player B 100 health 10 stregnth and 5 attack . Attacking die and Defending die are both 6 sided die with values ranging from 1- 6

3.1 Player A attacks and rolls die. Die roll : 5 . Player B defends and rolls die. Die roll 2

3.2 Attack damage is 5 * 10 = 50 ; Defending strength = 10 * 2 = 20 ; Player B health reduced by 30 to 70

3.3 Player B attacks and rolls die. Die roll : 4. Player A defends and rolls die. Die Roll 3

3.4 Attack damage is 4 * 5 = 20 ; Defending strength = 5 * 3 = 15 ; Player A health reduced by 5 to 45

3.5 And so on

# Execution of the program/ game

# MagicalArena Simulation

## Overview
This project simulates a magical arena where players engage in battles. Players have attributes such as health, strength, and attack. The simulation determines the winner based on the outcome of the battles.

## Prerequisites
- Java Development Kit (JDK) installed on your machine
- Command-line interface (Terminal, Command Prompt, or equivalent)

## How to Run

0. Unzip the MagicalArena_Chandan.zip file on your system.

1. **Open MagicalArena_Chandan on any IDE of your choice that supports Java.**
 
2. On your IDE, go to File-> Folder-> Open Folder-> MagicalArena_Chandan

3. Compile the code using:
   javac *.java

4. Run the simulation by running the main/ driver stored by the name "MagicalArenaDriver.java"
   java MagicalArenaDriver

5. Follow the Prompts
Enter attributes for Player A when prompted.
Enter attributes for Player B when prompted.

6. Review Results

The simulation will display the progress and outcome of the match.

## SAMPLE INPUT

Enter attributes for Player A:
Health: 50
Strength: 5
Attack: 10

Enter attributes for Player B:
Health: 100
Strength: 10
Attack: 5

## EXPECTED OUTPUT

The match has concluded.
Player A's final health: 20
Player B's final health: 0
Player A won and Player B lost!

## ADDITIONAL INFO:
This is just a prototype/ base design of the game model. This can be customized to suit the user requirements as and when required.
Adjust the attributes and number of players as desired.
Explore the code for customization and extension.
Have fun exploring the magical arena!




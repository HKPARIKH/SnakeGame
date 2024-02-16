This is a Snake game that used to come on old phones, especially if you remember it on Nokia phones. Something like this: -
![image](https://github.com/HKPARIKH/SnakeGame/assets/90847022/a4dcb869-2f44-44e8-8574-e3965ccc7112)



This game was made by me using the Java Language.

I used Swing and AWT (abstract window tool) concepts to make this.

You can find two main files in Src/snakegame that have the coding part of the game and actions.

and the icons folder in this route SnakeGame/src/snakegame/icons that have the icons of head, body, and apple.


**Detailed Explaination**


**Board() - Constructor:**
Purpose: Initializes the Board class.
Explanation:
Adds a KeyListener (instance of TADAPTER) to handle keyboard input.
Sets the background color of the panel to black.
Makes the panel focusable and sets its preferred size.
Calls loadImages() to load the images used in the game.
Calls initGame() to initialize the game state.


**loadImages():**
Purpose: Loads images for the apple, snake body, and snake head.
Explanation:
Uses ImageIcon and ClassLoader to load images from the resources directory and Sets the loaded images (apple, dot, head) for later use in the game.

**initGame():**
Purpose: Initializes the game state.
Explanation:
Sets the initial number of snake body segments (dots) to 3.
Initializes the coordinates of the snake's body segments (x and y arrays).
Calls locateApple() to randomly position the apple.
Initializes a timer (Timer class) to trigger the actionPerformed method at regular intervals.


**locateApple():**
Purpose: Randomly positions the apple within the game area.
Explanation:
Generates random coordinates (apple_x and apple_y) for the apple within the game area.
The size of the random area is determined by the RANDOM_POSITION constant.


**paintComponent(Graphics g):
**
Purpose: Overrides the paintComponent method to handle custom painting.
Explanation:
Calls the draw method to render the game elements using the Graphics object.


**draw(Graphics g):**
Purpose: Draws the game elements on the panel.
Explanation:
If the game is still in progress (inGame is true), it draws the apple and snake on the panel.
If the game is over, it calls the gameOver method to display a "Game Over" message.

**gameOver(Graphics g):**
Purpose: Displays a "Game Over" message.
Explanation:
Draws a "Game Over" message at the center of the panel using the Graphics object.
Uses a specified font and color for the message.

**move():**
Purpose: Updates the coordinates of the snake's body segments based on the current direction.
Explanation:
Iterates through the snake's body segments and updates their coordinates.
Moves the snake in the direction determined by the boolean flags (leftDirection, rightDirection, upDirection, downDirection).


**checkApple():**
Purpose: Checks if the snake has consumed the apple.
Explanation:
Compares the coordinates of the snake's head with the coordinates of the apple.
If a match is found, increments the number of snake body segments (dots) and calls locateApple() to reposition the apple.

**checkCollision():**
Purpose: Checks for collisions with the game boundaries or the snake itself.
Explanation:
Iterates through the snake's body segments starting from the head.
If the head collides with any other body segment, sets inGame to false.
If the head reaches the boundaries of the game area, sets inGame to false.
If inGame is false, stops the timer.


**actionPerformed(ActionEvent ae):**
Purpose: Handles the action events triggered by the timer.
Explanation:
If the game is still in progress, checks for apple consumption, collision, and updates the snake's movement using the move method.
Calls repaint() to update the display.

**TADAPTER - Inner Key Adapter Class:**
Purpose: Handles key events for changing the snake's direction based on arrow key presses.
Explanation: **Overrides** the keyPressed method to determine the pressed key and update the direction flags accordingly.


Thanks for your time :) 

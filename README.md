# Bowling Game

The game consist of 10 frames.

In each frame the player has two rolls to knock down 10 pins.

The score for each frame is the total number of pins knocked down, plus the bonus for spares and strikes.

A Spare is when the player knocks all the 10 pins in a frame in two rolls. The bonus of this frame is the number of pins knocked down by the next roll.

A Strike is when the player knocks all the 10 pins on his first roll. The frame is then completed in single roll. The bonus of this frame is the value of first two rolls.

In the tenth frame a person who rolls a spare or a strike gets one extra roll to complete the frame. However no more than 3 rolls can be played in tenth frame.

*Requirements*

Write a class Game with two methods:

1: void roll(int) is called each time the player rolls a ball. The argument is the number of pins knocked down.

2: int score() returns the total score of the game.

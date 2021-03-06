# DonkeyKong Structure

DonkeyKongGame is a group of classes that allows the user to create items or users for the Donkey Kong Game.

The Classes have a hierarchical structure with Items splitting into Objects and Mario Players.
Objects is then further split into Structures and Artefacts

1. Mario Players is used for all users
2. Structure is used for structural items such as staircases
3. Artefacts are used for any items that affect the game such as umbrellas, barrels, etc...

The main purpose of this assignment was to show the ability to define
classes, methods and parameters to show the different topics discussed in class.

Overview:

Class Items
* Parameters: positionX, positionY
* Methods: getPositionX, setPositionX, getPositionY, setPositionY

Class MarioPlayer (inherits from Items
* Parameters: positionX (super), positionY (super), username, lives, total points, level
* Methods: none


Class Objects (inherits from Items)
* Parameters: positionX (super), positionY (super), shape
* Methods: getShape, setShape

Class Structures (inherits from Objects)
* Parameters: positionX (super), positionY (super), shape (super), size, accessible
* Methods: isAccessible, setAccessible


Class Artefacts (inherits from Objects)
* Parameters: positionX (super), positionY (super), shape (super), speed
* Methods: getPoints, destroyed

A further explanation is shown in the PDF file in the same folder.
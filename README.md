# Tetris
Groupe : 
Sarah Huret 
Camille Lévi
Simon Pinet--Rollet


Notre code est peu avancé. Entre autres l'affichage n'est pas géré.

Cependant nous avons découpé le projet en plusieurs classes/interfaces/énumération qui sont elles-mêmes classées dans des packages. 
Il y a 5 packages : 
- fr.huret.tetris.core contient la "base" du programme. Il contient les classes Main, GameBoard et TetrisCore qui sont les 3 classes les 
plus "centrales". 
- fr.huret.tetris.inputReader contient les 2 classes liées à la récupération et au traitement des entrées utilisateur. La classe 
RawConsoleInput était donnée pour lire les entrées console à l'état brut et InputReader permet d'associer ces entrées aux mouvements 
autorisés correspondants.
- fr.huret.tetris.movements regroupe les éléments qui gèrent des mouvements. On y trouve l'enum Movement qui décrit tous les mouvements 
possibles, l'interface Movable qui est implémentée par les éléments "bougeables" tel que MovingPiece, qui gère les pièces en mouvement 
(une seule à la fois sur le plateau), et enfin MovementValidator qui valide qu'un mouvement est autorisé.
- fr.huret.tetris.piece contient Tetromino, qui crée chaque piece en gérant les orientations, et Position qui gère la position de la piece 
sur la grille.
- Enfin, fr.huret.tetris.printer tourne autour de l'affichage avec l'interface Printable qui indique qu'un élément est affichable, et 
la classe Printer sert à afficher. 

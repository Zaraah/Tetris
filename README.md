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




3 principes SOLID illustrés dans notre code :

- Principe SOLID S (Single Responsability Principle) : Un composant ne doit avoir qu’une seule responsabilité. Par exemple, dans notre code, nous n’avons pas fait l’anti-pattern Wet code, c’est-à-dire tout répéter deux fois. Les pièces en mouvement ne sont gérées que par une seule classe, la classe MovingPiece, et à l'inverse la classe MovingPiece ne gère que les pièces en mouvement : elle a donc bien une unique responsabilité.
- Principe SOLID I (Interface Segregation Principle) : Dans notre code, les composants n’implémentent que des interfaces qu’ils utilisent. C'est le cas de MovingPiece par exemple, qui implémente l'interface Movable et l'utilise complètement.
- Principe SOLID O (Open/Closed Principle) : Les classes doivent être ouvertes à l'extension et fermées à la modification. En l'occurence le programme n'est pas terminé mais s'il était fini on ne toucherait plus directement à nos classes, mais on pourrait les étendre pour ajouter des fonctionnalités.

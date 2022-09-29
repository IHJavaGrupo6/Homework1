# Renegados RPG Battle

--Instructions--

Al iniciar el juego se va a mostrar el siguiente menú

===Welcome to Renegados RPG Battle===

=Select an option=
1. Create a Character
2. Generate random parties
3. Import parties from CSV file
4. Go to Battle
5. Exit Game


-Si seleccionamos la opción "1" entraremos en la creación de un personaje donde se
nos permite generar un combatiente customizado. Podrás elegir entre Wizard o Warrior
que cuentan cada uno con atributos especiales.

-Si seleccionamos la opción "2" se nos van a generar las dos parties 
de manera aleatoria, si algún nombre se repite, se le añadirá Jr al final.

-Si seleccionamos la opción "3" se nos va a importar un archivo CSV que
contiene las parties ya predefinidas.

-Si seleccionamos la opción "4" dará comienzo el combate entre las dos parties.
Esto nos va a dar la opción de escoger un personaje de cada party para cada ronda.
Durante la contienda, se mostrará el daño infringido a cada jugador.

Ejemplo de una ataque:

Anya hurt 33 damage points to Quim.
Quim is left 56 health points.
Quim hurt 12 damage points to Anya.
Anya is left -1 health points.

Al final de cada ronda se mostrará como el guerrero que ha perdido esa ronda,
es movido automáticamente al cementerio.


Ejemplo de luchador derrotado:

Anya is dead now. Moved to Graveyard.

Graveyard:
* Wizard{name='Anya, id=2, hp=-1, mana=6, intelligence=12'}


Las rondas se van a repetir hasta que una party se quede sin luchadores vivos.

Cuando una de las dos parties se queda sin luchadores disponibles finaliza el combate
mostrando el cementerio con todos los luchadores derrotados y celebrando la victoria
de la party ganadora.

Ejemplo de cementerio final y party ganadora:

Graveyard:
* Wizard{name='Anya, id=2, hp=-1, mana=6, intelligence=12'}
* Wizard{name='Armando, id=0, hp=-6, mana=17, intelligence=48'}
* Wizard{name='Irina, id=1, hp=-17, mana=26, intelligence=29'}
* Wizard{name='Piero, id=3, hp=0, mana=0, intelligence=10'}
* Warrior{name='Clàudia, id=5, hp=-3, stamina=5, strength=1'}
* Warrior{name='Pol, id=4, hp=-27, stamina=2, strength=6'}
* Wizard{name='Armando, id=7, hp=-17, mana=1, intelligence=24'}
* Wizard{name='Javi, id=6, hp=0, mana=4, intelligence=19'}
* Wizard{name='Ingrid, id=9, hp=-23, mana=5, intelligence=3'}
* Warrior{name='Sergi, id=11, hp=-60, stamina=3, strength=9'}
* Wizard{name='Oxana, id=8, hp=0, mana=1, intelligence=31'}
* Warrior{name='Ingrid, id=13, hp=0, stamina=2, strength=4'}
* Warrior{name='Diana, id=10, hp=-5, stamina=5, strength=4'}
* Wizard{name='Nil, id=15, hp=0, mana=5, intelligence=9'}
* Warrior{name='Fran, id=12, hp=-43, stamina=3, strength=2'}
* Wizard{name='Ale, id=14, hp=-14, mana=31, intelligence=29'}
* Wizard{name='Quim, id=17, hp=-16, mana=4, intelligence=33'}

Party 1 is the winner!

-Si seleccionamos la opción "5" se nos va a cerrar el juego.
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
* Warrior: name = Anya, id = 2, hp = -8, stamina = 0, strength = 9;


Las rondas se van a repetir hasta que una party se quede sin luchadores vivos.

Cuando una de las dos parties se queda sin luchadores disponibles finaliza el combate
mostrando el cementerio con todos los luchadores derrotados y celebrando la victoria
de la party ganadora.

Ejemplo de cementerio final y party ganadora:

Graveyard:
* Wizard: name = Chloe, id = 0, hp = -27, mana = 10, intelligence = 37;
* Wizard: name = Miguel, id = 1, hp = -4, mana = 25, intelligence = 47;
* Warrior: name = Anya, id = 2, hp = -8, stamina = 0, strength = 9;
* Warrior: name = Oxana, id = 3, hp = -10, stamina = 3, strength = 8;
* Wizard: name = Anya Jr, id = 4, hp = -38, mana = 2, intelligence = 13;
* Wizard: name = Alfonso, id = 6, hp = -50, mana = 18, intelligence = 28;
* Wizard: name = Chloe Jr, id = 5, hp = -55, mana = 15, intelligence = 26;
* Warrior: name = Núria, id = 8, hp = -52, stamina = 0, strength = 1;
* Wizard: name = Asaf, id = 7, hp = -12, mana = 5, intelligence = 34;
* Warrior: name = Javi, id = 10, hp = -6, stamina = 1, strength = 9;
* Warrior: name = Nil, id = 9, hp = -4, stamina = 6, strength = 6;
* Warrior: name = Ale, id = 11, hp = -7, stamina = 2, strength = 6;
* Wizard: name = Armando, id = 12, hp = -43, mana = 3, intelligence = 39;
* Wizard: name = Ingrid, id = 13, hp = -8, mana = 1, intelligence = 23;
* Warrior: name = Martin, id = 15, hp = -3, stamina = 1, strength = 3;

Party 1 is the winner!

-Si seleccionamos la opción "5" se nos va a cerrar el juego.
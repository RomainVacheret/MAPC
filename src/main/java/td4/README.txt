Lire :
- http://sourcemaking.com/design_patterns/state
- https://en.wikipedia.org/wiki/State_pattern

puis sans regarder le code en ligne (juste les patrons en UML) résoudre les deux exercices suivants.

PREMIER EXERCICE

ETAT DE DEPART -- [ condition ] operation(parametres) / actions --> NOUVEL ETAT

Coder la machine à café suivante à l'aide du patron State.
Le café et le thé coûtent 10. La machine ne rend pas la monnaie donnée en trop.
La comportement attendu de la machine est le suivant :
° -- / { c = 0 } --> 0
0 -- [c+n>=10] give(n) / { c+=n } --> 1
0 -- [c+n<10]  give(n) / { c+=n } --> 0
1 -- askCoffee() / { c=0 } --> 0
1 -- askTea() / { c=0 } --> 0

TEST

askCoffee -> pas possible
give(5) // c = 5
askCoffee -> pas possible
give(30) // c = 35
askCoffee -> ok
give(1) // c = 1
askCoffee -> pas possible

DEUXIEME EXERCICE

Coder la machine à café suivante à l'aide du patron State.
Le café et le thé coûtent 10.
Le comportement attendu de la machine est le suivant :
° -- / { c = 0 } --> 0
0 -- [c+n>=10] give(n) / { c+=n } --> 1
0 -- [c+n<10]  give(n) / { c+=n } --> 0
1 -- askCoffee() / { c = c-10 } --> 2
1 -- askTea() / { c= c-10 } --> 2
{0,1,2} -- getRefund():c / { c=0 } --> 0

TEST

askCoffee -> pas possible
give(5) // c = 5
askCoffee -> pas possible
give(10) // c = 15
askCoffee -> ok
getRefund -> 5
getRefund -> 0

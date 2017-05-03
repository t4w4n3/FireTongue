# FireTongue
Cipher/encipher French sentences with a Javanais encryption.

## Contexte du projet

Ce projet est une épreuve dans le cadre d'un entretien de recrutement.
Le candidat a 7 jours pour livrer une réalisation personnelle répondant au sujet.

## Expression du besoin

Le candidat doit développer avant l’entretien un projet java ou javascript.

Le sujet : Transformer une phrase française en javanais et inversement. Il n’est pas nécessaire de développer une interface graphique. 

Le [Javanais](https://fr.wikipedia.org/wiki/Javanais_(argot)/) est de l'argot consistant à insérer des syllabes parasitaires dans les mots. Voici les règles délibérément simplifiées à implémenter pour la transformation en javanais :
Dans un mot, “av” est ajouté entre chaque consonne suivie d’une voyelle.
Si le mot commence par une voyelle, “av” est ajouté devant cette voyelle.

Quelques exemples : 
“bonjour” devient “bavonjavour
“chante” devient “chavantave”
“moyen” devient “mavoyen”
“exemple” devient “avexavemplave”
“au” devient “avau”

Le projet est un prétexte pour le candidat, de démontrer concrètement ses compétences techniques, ses savoir-faire et savoir être dans le cadre d’une activité de développement informatique.
Les parties ci-dessous précisent donc les décisions prises sur les spécifications du projet avant sa réalisation technique.

## Analyse fonctionnelle

À défaut de client à interroger pour préciser son besoin, il est décidé ici d'interpréter et d'extrapoller le besoin.
Le projet sera abordé du point de vue cryptographique qu'est le Javanais à la langue française.
En raison des contraintes de temps et de l'énoncé, une interface grahique ne sera étudiée et/ou réalisée qu'en cas d'avance.

### Fonction principale 1

Le logiciel permet de chiffrer une phrase française en javanais.

* Chiffrer : L’action de procéder à un chiffrement.
  * Chiffrement : Le chiffrement est un procédé de cryptographie grâce auquel on souhaite rendre la compréhension d’un document impossible à toute personne qui n’a pas la clé de (dé)chiffrement.
  * Clé de chiffrement :
  - av est ajouté après chaque consonne (ou groupe de consonnes comme ch, cl, ph, tr,…) d’un mot, autrement dit avant chaque voyelle.
  - Si le mot commence par une voyelle, av est ajouté devant cette voyelle.
  - av n'est jamais rajouté après la consonne finale d’un mot.
  - S'il est suivi d'une voyelle, le « y » est traité comme une consonne. Le mot « moyen » est codé mavoyaven (pas mavoyen). S'il est lui-même prononcé comme « i », il est traité comme une consonne suivie de la voyelle « i ». Le mot « pays » est codé pavayavis (pas pavays).
  - Les monosyllabes (« a », « à », « en », « un ») ainsi que les mots commençant par une voyelle prennent une syllabe supplémentaire initiale. Ainsi, « abricot » est codé avabravicavot.
  - Le « e » muet n'impose pas la présence de syllabe supplémentaire : « tarte » est codé tavarte. La syllabe supplémentaire peut être ajoutée comme une forme d'insistance. Ainsi, « espèce de tarte » est codé avespavecAVe dave tavarTAVE. Ici la forme simple sera utilisée.
* Phrase : Ici "phrase" a plutôt le sens de "message", dont le respect des règles de la grammaire n'a pas d'importance. Les signes de ponctuation sont conservés inchangés. La taille maximale est 100 mots, ou 550 caractères (Whitespace caractères et ponctuation comprise).
* Français : Les mots contenus dans le message doivent tous être issus de la langue française (se trouver dans un dictionnaire récent).
* Javanais : Procédé de codage argotique utilisant une phonologie parasitaire constituée par l'insertion d'une syllabe supplémentaire entre voyelles et consonnes.

### Fonction principale 2

Le logiciel permet de déchiffrer un message chiffré en Javanais.

* Déchiffrer : En informatique et en télécommunications, déchiffrer consiste à retrouver le texte original (aussi appelé clair) d’un message chiffré dont on possède la clé de (dé)chiffrement. Ici, le message de sorti n'est pas nécessairement composé de mots français, et ne respecte pas nécessairement les règles de la grammaire. La validité française du message de sorti est indiqué à l'utilisateur.
  * Clé de déchiffrement : Ici, la clé de déchiffrement est un procédé, et non une chaîne de caractères. Voir clé de chiffrement (FP1)
* Message : Le message est constitué d'un ou plusieurs mots appartenant ou non au dictionnaire de la langue française. La taille maximale est 5000 caractères, pour éviter les dépassements de mémoire.
* Chiffré : Signifie que le message ne peut être compris par un utilisateur ou un programme ne disposant pas de la clé de déchiffrement
* Javanais : Voir FP1

### Fonction contrainte 1

Le logiciel est utilisable en ligne de commande, au moyen d'une JVM.

### Fonction contrainte 2

Le logiciel est utilisable en tant que dépendance, dans d'autres projets Java.

### Fonction contrainte 3

Le logiciel peut être utilisé pour de la traduction en temps réel.
En estimant un débit de parole fluide de français de 150 [mots/minutes](https://fr.wikipedia.org/wiki/Mot_par_minute#Lecture), le logiciel est en mesure de chiffrer en temps réel sans prendre de retard sur le locuteur.
Il en va de même pour le déchiffrement.

### Cas d'utilisation 1

* Nom : Chiffrement d'une phrase de 5 mots français en ligne de commande.
* Description : L'utilisateur exécute le logiciel en lui donnant en paramètre l'action à effectuer (chiffrement/déchiffrement), ainsi que sa phrase : java -jar FireTongue.jar c "Sire ! On en a gros !"
* Acteurs : L'utilisateur unique.
* Conséquents : La ligne de commande fournit à l'utilisateur le résultat de sa commande, dans une seconde ligne.
* Séquences d’événements :
  * l’utilisateur ouvre une ligne de commande unix ou windows.
  * l'utilisateur se place dans le répertoire contenant le logiciel compilé
  * l’utilisateur saisi sa commande et l'envoi
  * le système affiche le résultat de la commande et sa validité française
  * l’utilisateur prend connaissance du résultat

Exceptions :

* l’utilisateur fournit un paramètre d'action (chiffrement/déchiffrement) invalide (différent de "c" ou "d").
* l'utilisateur tente de chiffrer un message dont au moins un des mots n'est pas français.
* l'utilisateur tente de chiffrer un message dépassant la taille maximale
* l'utilisateur tente de chiffrer un message contenant des caractères (non whitespace) inconnus de la langue française.



## Spécifications techniques

* Le logiciel est compilé avec un jdk 1.7
* Le logiciel est exécutable avec une jre 1.7
* Le format d'entrée et de sortie des message est UTF-8, et les sauts de lignes sont de type unix (LF).

## Architecture de la solution

## Qualification

### Qualification fonctionnelle

### Tests unitaires

### Tests de charge

## Outils/méthodes utilisés

## Propositions d'amélioration

* Permettre à l'utilisateur de spécifier la syllabe parasite.
* Permettre à l'utilisateur de spécifier un nombre de tours de chiffrement/déchiffrement. Par exemple, en chiffrant le message "Bonjour" 3 fois on obtient BAVAVAVAVAVAVAVONJAVAVAVAVAVAVAVOUR
* Permettre à l'utilisateur de spécifier un nombre de tours de chiffrement/déchiffrement, avec des syllabes différentes à chaque tour. Par exemple on extrait de la clé "java" les syllabes "ja" et "va", ce qui fait 2 tours. Ainsi, "bonjour" devient "BJVAAONJJVAAOVAUR".
De même, avec la clé "javanais", "bonjour" devient "BJVNAISAAONJJVNAISAAOVNAISAUR".

## Spécifications du livrable

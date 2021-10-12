# TD 1
## Remarques pr�liminaires
* Pour l'ensemble des TDs, vous cr�erez un compte individuel sur [github](https://github.com/) si vous n'en poss�dez pas d�j� un.
Vous nommerez ce compte de la fa�on suivante: `uvsq<MonNum�ro�tudiant>`.
Par exemple, pour un �tudiant de num�ro *21601234*, le compte sera `uvsq21601234`.
* Les commandes `git` sont � taper en ligne de commande dans un *shell*.
* Vous pouvez utiliser l'IDE de votre choix.
Sur le cartable num�rique, [Eclipse](www.eclipse.org), [IntelliJ IDEA](http://www.jetbrains.com/idea/) et [Visual Studio Code](https://code.visualstudio.com/) sont install�s.
* Vous r�pondrez aux questions directement dans ce fichier en compl�tant les emplacements correspondants.
Ajoutez ensuite ce fichier au d�p�t `git`.

## Partie I (� faire durant le TD) : d�couverte de `git`
Dans cet exercice, vous cr�erez une classe `Fraction` repr�sentant un nombre rationnel et une classe `Main` qui testera les m�thodes de la classe `Fraction` **avec des assertions**.
� chaque �tape, consultez le statut des fichiers du projet ainsi que l'historique.

1. Sur la forge, cr�ez le d�p�t (_repository_) `SimpleFraction`;
En terme de *commits*, quelle diff�rence constatez-vous entre cocher une (ou plusieurs) des cases *Initialize this repository with* et n'en cocher aucune ?
    > R�pondre ici

    *Pour la suite, ne cochez aucune de ces cases*.
1. Localement, configurez `git` avec votre nom (`user.name`) et votre email (`user.email`);
    ```bash
    # R�pondre ici
    ```
1. Initialisez le d�p�t `git` local pour le projet;
    ```bash
    # R�pondre ici
    ```
1. Cr�ez la classe `Fraction` (vide pour le moment) et la classe `Main` (avec un simple affichage) dans le projet;
V�rifiez que le projet compile et s'ex�cute dans l'IDE;
Validez les changements;
    ```bash
    # Commandes pour valider les changements
    ```
1. Ajoutez un constructeur et la m�thode `toString` � la classe `Fraction` et modifiez la classe `Main` en cons�quence;
Validez les changements;
    ```Java
    // Code pour tester toString
    ```
1. Publiez vos modifications sur le d�p�t distant;
Vous utiliserez le protocole `https` pour cela;
V�rifiez avec le navigateur;
    ```bash
    # Commandes pour publier les modifications
    ```
1. Sur la forge, ajoutez un fichier de documentation `README.md`.
Quelle syntaxe est utilis�e pour ce fichier ?
    > R�pondre ici
1. R�cup�rez localement les modifications effectu�es sur la forge.
    ```bash
    # R�pondre ici
    ```
1. Ajoutez les r�pertoires et fichiers issus de la compilation aux fichiers ignor�s par `git` (fichier `.gitignore`);
    ```bash
    # Copier ici le contenu de `.gitignore`
    ```
1. Retirez les fichiers de configuration de l'IDE du projet;
    ```bash
    # R�pondre ici
    ```
    Ajoutez-les aux fichiers ignor�s par `git`.
    ```bash
    # Copier ici les modifications de `.gitignore`
    ```
1. Configurez l'acc�s par cl� publique/cl� priv�e � la forge (cf. [Connecting to GitHub with SSH](https://docs.github.com/en/authentication/connecting-to-github-with-ssh)).
    > Expliquez la proc�dure de fa�on synth�tique

## Partie II (� faire � la maison) : r�visions et perfectionnement *shell* et *IDE*
### Ma�triser le *shell* de commandes
L'objectif de cet exercice est de vous faire r�viser/d�couvrir les commandes de base du *shell* de votre machine.
Vous pouvez r�pondre en utilisant le shell de votre choix (*bash*, *Powershell*, �).
Pour r�pondre � ces questions, vous devez effectuer les recherches documentaires ad�quates (livre, web, �).

1. Quel OS et quel shell de commande utilisez-vous ?
    > R�pondre ici
1. Quelle commande permet d'obtenir de l'aide ?
Donnez un exemple.
    ```bash
    # R�pondre ici
    ```
1. Donnez la ou les commandes shell permettant de
    1. afficher les fichiers d'un r�pertoire tri�s par taille (taille affich�e lisiblement)
        ```bash
        # R�pondre ici
        ```
    1. compter le nombre de ligne d'un fichier
        ```bash
        # R�pondre ici
        ```
    1. afficher les lignes du fichier `Main.java` contenant la cha�ne `uneVariable`
        ```bash
        # R�pondre ici
        ```
    1. afficher r�cursivement les fichiers `.java` contenant la cha�ne `uneVariable`
        ```bash
        # R�pondre ici
        ```
    1. trouver les fichiers (pas les r�pertoires) nomm�s `README.md` dans une arborescence de r�pertoires
        ```bash
        # R�pondre ici
        ```
    1. afficher les diff�rences entre deux fichiers textes
        ```bash
        # R�pondre ici
        ```
1. Expliquez en une ou deux phrases le r�le de ces commandes et dans quel contexte elles peuvent �tre utiles pour un d�veloppeur.
    * `ssh`
        > R�pondre ici
    * `screen`/`tmux`
        > R�pondre ici
    * `curl`/[HTTPie](https://httpie.org/)
        > R�pondre ici
    * [jq](https://stedolan.github.io/jq/)
        > R�pondre ici

### D�couverte de votre *IDE*
Dans cet exercice, vous expliquerez en quelques phrases comment vous r�alisez les actions ci-dessous dans votre IDE.
Vous pouvez choisir l'IDE/�diteur de texte de votre choix.
Pour r�aliser cette exercice, vous devez bien �videmment vous reporter � la documentations de l'IDE ([IntelliJ IDEA](https://www.jetbrains.com/help/idea/discover-intellij-idea.html#developer-tools), [Visual Studio Code](https://code.visualstudio.com/docs), [Eclipse](https://help.eclipse.org/2020-09/index.jsp), �).

1. Quels IDE ou �diteurs de texte utilisez-vous pour le d�veloppement Java ?
    > Eclipse

    Pour la suite, ne consid�rez que l'un de vos choix.
1. Comment v�rifier/d�finir que l'encodage utilis� est *UTF-8* ?
    > R�pondre ici
1. Comment choisir le JDK � utiliser dans un projet ?
    > R�pondre ici
1. Comment pr�ciser la version Java des sources dans un projet ?
    > R�pondre ici
1. Comment ajouter une biblioth�que externe dans un projet ?
    > R�pondre ici
1. Comment reformater un fichier source Java ?
    > R�pondre ici
1. Comment trouver la d�claration d'une variable ou m�thode ?
    > R�pondre ici
1. Comment ins�rer un bloc de code pr�d�fini (*snippet*) ?
    > R�pondre ici
1. Comment renommer une classe dans l'ensemble du projet ?
    > R�pondre ici
1. Comment ex�cuter le programme en lui passant un param�tre en ligne de commande ?
    > R�pondre ici
1. Comment d�boguer le programme en visualisant le contenu d'une ou plusieurs variables ?
    > R�pondre ici
1. Quels param�tres ou fonctionnalit�s vous semblent particuli�rement importants/utiles pour le d�veloppement Java ?
    > R�pondre ici
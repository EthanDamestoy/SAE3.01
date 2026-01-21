===========================================================
                   PROJET SAE 3.01 - EQUIPE 1
===========================================================

Equipe 1 :
  - Mateo CHEVEAU
  - Ethan DAMESTOY
  - Joshua HERMILLY
  - Lucas LAFOSSE
  - Jonathan LECLERC

NOTE IMPORTANTE :
- Ce projet utilise l'encodage UTF-8. Assurez-vous que votre
  environnement est configuré en conséquence.

- Ce projet utilise la jdom2 ( jdom-2.0.6.jar ) présent dans le dossier lib.
  Il est utilisé pour exporter/sauvegarder en .xml.

===========================================================
                  LANCEMENT DE L'APPLICATION
===========================================================

[ WINDOWS ]
  Double-cliquez sur le script de votre choix ou lancez-le via l'invite de commande :
    - Interface Graphique : .\runGUI.bat
    - Interface Console   : .\runCUI.bat

[ LINUX / MACOS ]
  Ouvrez un terminal et exécutez le script :
    - Interface Graphique : .\runGUI.sh
    - Interface Console   : .\runCUI.sh

-----------------------------------------------------------
             COMPILATION & EXECUTION MANUELLE
-----------------------------------------------------------
Si vous ne souhaitez pas utiliser les scripts fournis :

1. COMPILATION
   javac -encoding UTF-8 -d class @compile.list

2. EXECUTION, selon votre afichage
   java -Dfile.encoding=UTF-8 -cp class src.ControleurGUI "$@"
   java -Dfile.encoding=UTF-8 -cp class src.ControleurCUI "$@"

===========================================================
                   MANUEL D'UTILISATION CUI
===========================================================

L'application permet de générer un affichage UML à partir de code source.
Au lancement, choisissez le mode d'entrée :

  1 -> Fichier unique     (Chemin absolu ou relatif)
  2 -> Répertoire complet (Chemin absolu ou relatif)

NB : L'ouverture d'un nouveau répertoire efface les classes précédemment chargées.

===========================================================
                   GENERER JAVA DOC
===========================================================

Pour générer la Javadoc dans le dossier 'doc' :

   javadoc -d javadoc -sourcepath . -classpath "lib/jdom-2.0.6.jar" -subpackages src
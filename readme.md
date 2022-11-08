Crée une classe abstraite Vehicle
Ajoute les attributs String brand et int kilometers
Crée un constructeur permettant d'initialiser brand et kilometers
Ajoute des getters et setters pour tous les attributs, en respectant les conventions
Crée une classe Car qui étend la classe Vehicle
Crée une classe Boat qui étend la classe Vehicle
Ajoute dans Vehicle la méthode abstraite public String doStuff()
Ajoute dans Car et Boat une implémentation du corps de la méthode doStuff(). Pour Car, tu devras retourner "Je suis {brand} et je fais vroum vroum !" et pour Boat : "Je suis {brand} et je fais glou glou !"
Crée une classe Hangar qui possédera une méthode main()
Ajoute des références vers des instances des classes Car et Boat dans la méthode main() de Hangar
Pour chacune des références, affiche dans le terminal le résultat de l'appel de la méthode doStuff()
Compile et teste Hangar : quand tout fonctionne, crée un dépôt git et envoie le tout sur GitHub
Partage le lien du dépôt GitHub en solution
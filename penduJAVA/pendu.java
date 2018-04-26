class Pendu {
    static char demanderAutreMot() {
              char continuer = 'O';
              System.out.println("Voulez-vous (re)jouer au pendu ? (O/N)");
              continuer = Lire.c();
             
              while ((continuer != 'O') && (continuer !='N')){
                  System.out.println("O ou N SVP");
                  continuer = Lire.c();
              }
              return continuer ;
    }
 
    static int lireMotADeviner(char[] mot) {
              int i = 0 ;
              char lettre ;
              System.out.println("Saisissez les lettres une par une, # quand le mot est termine");
 
              lettre = lireLettre();
             
 
              while (lettre != '#'){
                  mot[i] = lettre ;
                  i = i+1 ;
                  System.out.println("Entrez la lettre "+ (i+1));
                  lettre = lireLettre();
              }
              return i ;
    }
    static void initialiserAlphabet(char[] alpha){
              alpha[0] = 'a';
              alpha[1] = 'b';

              alpha[2] = 'c';
              alpha[3] = 'd';
              alpha[4] = 'e';
              alpha[5] = 'f';
              alpha[6] = 'g';
              alpha[7] = 'h';
              alpha[8] = 'i';
              alpha[9] = 'j';
              alpha[10] = 'k';
              alpha[11] = 'l';
              alpha[12] = 'm';
              alpha[13] = 'n';
              alpha[14] = 'o';
              alpha[15] = 'p';
              alpha[16] = 'q';
              alpha[17] = 'r';
              alpha[18] = 's';
              alpha[19] = 't';
              alpha[20] = 'u';
              alpha[21] = 'v';
              alpha[22] = 'w';
              alpha[23] = 'x';
              alpha[24] = 'y';
              alpha[25] = 'z';
   
    }
    static void afficherTableau(char [] t){
              int i;
              for (i = 0 ; i < t.length ; i++ ){
                  System.out.print(t[i]+" ");
              }
              System.out.println();
    }
    static char lireLettre(){
              char lettre ;
              System.out.println("proposez une lettre de l'alphabet (a-z)");
              // on pourrais ajouter ici un test de validite de saisie

              lettre = Lire.c() ;
              return lettre;
    }
 
    static boolean calculerResultat(char lettre, char[]motATrouver,
           	          	          	                 char [] proposition){
              boolean trouve = false ;
              int i ;
              for (i= 0 ; i < proposition.length ; i++){
                  if (motATrouver[i] == lettre) {
           	             if (trouve == false){
           	                 trouve = true;
           	             }
           	             proposition[i] = lettre ;
                  }
              }
              return trouve ;
    }
   
    static void initialiserTableau(char [] t, char caractere){
              int i ;
              for (i=0 ; i < t.length ; i++){
                  t[i]= caractere;
              }
    }
 
    static boolean motTrouve(char [] t){
              int i = 0;
              boolean motTrouve = true;
              while ((motTrouve == true) && (i < t.length)){
                  if (t[i] == '_'){
           	             motTrouve = false ;
                  }
                  i++;
              }
              return motTrouve ;
    }

static void mettreAJourAlphabet(char [] alpha, char lettre){
              int i = 0;
              boolean trouve = false ;
              while ((trouve ==  false) && (i<alpha.length)) {
                  if (alpha[i] == lettre){
           	             alpha[i] = ' ';
           	             trouve = true;
                  }
                  i++;
              }
             
    }
    static void afficherPendu(int nb){
              System.out.println("Afficher le pendu pour nb erreurs : "+ nb);
              switch (nb) {
              case 0 : // que la potence
                  System.out.println("    ___________");
                  System.out.println("    |          |");
                  System.out.println("               |");
                  System.out.println("               |");
                  System.out.println("               |");
                  System.out.println("               |");
                  System.out.println("               |");
                  System.out.println("               |");
                  System.out.println("               |");
                  System.out.println("               |");
                  System.out.println("----------------------");
 
              case 1 : // et la tete
                  System.out.println("    ___________");
                  System.out.println("    |          |");
                  System.out.println("   | |         |");
                  System.out.println("    -          |");
                  System.out.println("               |");
                  System.out.println("               |");
                  System.out.println("               |");


                  System.out.println("               |");
                  System.out.println("               |");
                  System.out.println("               |");
                  System.out.println("----------------------");
                  break;
              case 2 : // et le corps
                  System.out.println("    ___________");
                  System.out.println("    |          |");
                  System.out.println("   | |         |");
                  System.out.println("    -          |");
                  System.out.println("    |          |");
                  System.out.println("    |          |");
                  System.out.println("    |          |");
                  System.out.println("               |");
                  System.out.println("               |");
                  System.out.println("               |");
                  System.out.println("----------------------");
             
                  break;
              case 3 : // et les jambes
                  System.out.println("    ___________");
                  System.out.println("    |          |");
                  System.out.println("   | |         |");
                  System.out.println("    -          |");
                  System.out.println("    |          |");
                  System.out.println("    |          |");
                  System.out.println("    |          |");
                  System.out.println("   /\\          |");
                  System.out.println("  /  \\         |");
                  System.out.println("               |");
                  System.out.println("----------------------");
                  break;
              case 4 : //et les bras
                  System.out.println("    ___________");
                  System.out.println("    |          |");
                  System.out.println("   | |         |");
                  System.out.println("    -          |");
                  System.out.println("    |          |");
                  System.out.println("  --|--        |");
                  System.out.println("    |          |");
                  System.out.println("   /\\          |");
                  System.out.println("  /  \\         |");
                  System.out.println("               |");
                  System.out.println("----------------------");
                  break ;
              case 5 : // et les pieds
                  System.out.println("    ___________");
                  System.out.println("    |          |");
                  System.out.println("   | |         |");
                  System.out.println("    -          |");
                  System.out.println("    |          |");
                  System.out.println("  --|--        |");
                  System.out.println("    |          |");
                  System.out.println("   /\\          |");
                  System.out.println(" _/  \\_        |");
                  System.out.println("               |");
                  System.out.println("----------------------");
                  break ;
              default :
                  break ;
 
 
              }
    }
 
    static void devinerMot(char [] alpha, char [] motATrouver, int taille){
              char [] proposition = new char[taille];
              boolean trouve = false;
              boolean pendu =  false ;
              boolean bon ;
              char lettreProposee ;
              int nbEssai = 0 ;
              int nbMaxEssai = 5 ;
              initialiserTableau(proposition, '_');
              while ((trouve == false) && (!pendu)){
                  afficherTableau(alpha);
                  lettreProposee = lireLettre();

mettreAJourAlphabet(alpha, lettreProposee);
                  bon = calculerResultat(lettreProposee, motATrouver, proposition);
                  afficherTableau(proposition);
           	  
                  if (bon == true) {
           	             System.out.println("bon choix !!!");
           	             trouve =  motTrouve(proposition);
                  }else {
           	             nbEssai = nbEssai + 1;
           	             System.out.println("Erreur!!!");
           	             afficherPendu(nbEssai);
                  }
                  //
                  if (nbEssai == nbMaxEssai){
           	             pendu = true ;
                  }
              }
              if (trouve == true) {
                  System.out.println("gagne, felicitations !!!");
              }else{
                  System.out.println("Perdu et pendu !!");
              }
    }
 
     public static void main (String arg[]){
              char encore ;
              int TAILLE =15 ;
              int tailleMystere;
 
              char [] mystere = new char[TAILLE];
 
 
              char [] alphabet = new char[26];
              encore = demanderAutreMot();
             
              while (encore =='O') {
                   tailleMystere = lireMotADeviner(mystere);
                   initialiserAlphabet (alphabet);

 devinerMot(alphabet, mystere, tailleMystere);
                   encore = demanderAutreMot();
              }
     }
 
}


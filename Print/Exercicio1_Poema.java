package Print;

class Poema {
    public static void main(String[] args) {
        String poema = "O meu nome é Severino,\nnão tenho outro de pia.\nComo há muitos Severinos,\nque é santo de romaria\nderam então de me chamar\nSeverino de Maria;\ncomo há muitos Severinos\ncom mães chamadas Maria,\nfiquei sendo o da Maria\ndo finado Zacarias.\n";

        int severinos = poema.split("Severino").length-1;
        int marias = poema.split("Maria").length-1;
        System.out.printf(poema);
        System.out.printf("\nNeste poema, a palavra Severino aparece %d vezes, e outras %d vezes apareceu Maria.\n", severinos, marias);
    }
    
}

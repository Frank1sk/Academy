package codiceJava.Lunedì27.ClassiAstratte.DipPolizia;

abstract class Agente {

    //Dichiararli nella classe astratta non ha molto senso a meno che tu non debba usarli in un metodo reale
    String nome;
    String cognome;
    int matricola;

    abstract void descriviLavoro();
}

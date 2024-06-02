package codiceJava.Lunedì20.SocialNetwork;

import java.util.ArrayList;
import java.util.Scanner;

public class Utente {
    private String email;
    private String password;
    private String codiceFiscale;
    private String username;

    Utente(String email, String password, String codiceFiscale, String username){
        this.email = email;
        this.password = password;
        this.codiceFiscale = codiceFiscale;
        this.username = username;
        
    }

    public String getEmail(){
        return email;
    }
    
    public String getPassword(){
        return password;
    }

    public String getCodiceFiscale(){
        return codiceFiscale;
    }

    public String getUsername(){
        return username;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void setCodiceFiscale(String codiceFiscale){
        this.codiceFiscale = codiceFiscale;
    }
    
    public void setUsername(String username){
        this.username = username;
    }

    public void registrazione(Scanner scannerStringhe, ArrayList<Utente> utenti){
        boolean uguale = true;
        String cf;
        do{
            System.out.println("Inserire codice fiscale:");
            cf = scannerStringhe.nextLine();
            for(int i = 0; i < utenti.size(); i++){
                if(cf.equals(utenti.get(i).getCodiceFiscale())){
                    System.out.println("Codice fiscale già registrato!");
                    break;
                }else{
                    setCodiceFiscale(cf);
                    uguale = false;
                }
            }
        }while(uguale);
         /*do...while che controlla l'unicità del codice fiscale */
        System.out.println("Inserire email:");
        String email = scannerStringhe.nextLine();
        setEmail(email);
        System.out.println("Inserire password:");
        String pw = scannerStringhe.nextLine();
        setPassword(pw);
        System.out.println("Inserire username:");
        String user = scannerStringhe.nextLine();
        setUsername(user);
        utenti.add(new Utente(email, pw, cf, user));
        System.out.println("Registrazione avvenuta con successo!");
    }

    public int login(Scanner scannerStringhe, Scanner scannerNumeri, ArrayList<Utente> utenti, int tentativi){
        boolean nonTrovato = true;
        String email, pw, cf, user;
        System.out.println("Inserire email:");
        email = scannerStringhe.nextLine();
        System.out.println("Inserire password:");
        pw = scannerStringhe.nextLine();
        System.out.println("Inserire codice fiscale:");
        cf = scannerStringhe.nextLine();
        System.out.println("Inserire username:");
        user = scannerStringhe.nextLine();
        for(int i = 0; i < utenti.size(); i++){
            if((email.equals(utenti.get(i).getEmail())) && (pw.equals(utenti.get(i).getPassword())) && (cf.equals(utenti.get(i).getCodiceFiscale())) && (user.equals(utenti.get(i).getUsername()))){
                System.out.println("Login effettuato con successo");
                boolean runningFunzione = true;
                while(runningFunzione){
                    System.out.println("Digitare:\n1 - stampare i dati\n2 - modificare i dati\n3 - esci");
                    int funzione;
                    funzione = scannerNumeri.nextInt();
                    switch (funzione) {
                        case 1:
                            stampaDati();            
                            break;
                        case 2:
                            modificaDati(scannerStringhe);
                            break;
                        case 3:
                            System.out.println("Uscita");
                            runningFunzione = false;
                            break;
                        default:
                            System.out.println("Input errato!");
                            break;
                    }
                }
                nonTrovato = false;
                break;
            } /* Se c'è match, effettua login, poi stampa i dati ed esce dal for impostando nonTrovato = false */
        }
        if(nonTrovato){ /* Se non c'è match */
            tentativi++;
            System.out.println("Credenziali errate!\nTentativi rimasti: " + (4-tentativi));
        }
        return tentativi;
    }

    void stampaDati(){
        System.out.println("Ecco i tuoi dati:");
        System.out.println(getEmail() + "\n" + getPassword() + "\n" + getCodiceFiscale() + "\n" + getUsername());
    }

    void modificaDati(Scanner scannerStringhe){
        System.out.println("Inserisci la nuova password:");
        String pwNuova = scannerStringhe.nextLine();
        setPassword(pwNuova);
        System.out.println("Inserisci il nuovo user:");
        String userNuovo = scannerStringhe.nextLine();
        setUsername(userNuovo);
        System.out.println("User e password modificati");
    }
}

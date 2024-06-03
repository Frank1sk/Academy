/*La libreria DOM (Document Object Model) è un'interfaccia di programmazione per documenti XML e HTML. Essa rappresenta il documento come una struttura gerarchica ad albero, dove ogni nodo dell'albero corrisponde ad una parte del documento.
Nota: nell'ordine ha senso passare al DOM un XML, un HTML o una classe.*/
/*In Java la libreria DOM è fornita da javax.xml.parsers e org.w3c.dom. La prima permette di serializzare e deserializzare i file java in file XML, la seconda dice che va fatto nel dominio del DOM */

/* --- IMPORT DELLE LIBRERIE --- */
//"Classe di fabbrica" = Una classe che crea qualcosa che crea cose sempre uguali

import java.io.File; //Questo import è stato aggiunto da me per correggere un errore comune dovuto al fatto che molti computer nelle loro preferenze non hanno l'accesso diretto ai files

import javax.xml.parsers.DocumentBuilder; //Classe che permette di analizzare il documento XML e costruire l'albero DOM corrispondente
import javax.xml.parsers.DocumentBuilderFactory; //"Classe di fabbrica" che permette di ottenere istanze di DocumentBuilder
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer; //Classe che permette di trasformare il documento DOM in un documento XML
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory; //"Classe di fabbrica" che permette di ottenere istanze di Transformer
import javax.xml.transform.dom.DOMSource; //Sorgente di dati che rappresenta il documento DOM
import javax.xml.transform.stream.StreamResult; //Permette di specificare dove verrà salvato il documento XML
import org.w3c.dom.Document; //Interfaccia che permette di rappresentare il documento XML come un albero di nodi
import org.w3c.dom.Element; //Interfaccia che permette di rappresentare un elemento in un documento XML
/* --- --- */


public class XMLCreator {
    public static void main(String[] args) {
        try {
            /* --- BLOCCO DI PREPARAZIONE --- */
            // Creare una fabbrica di costruttori di documenti
            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();

            // Creare un costruttore di documenti
            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();

            // Definire un nuovo documento
            Document document = documentBuilder.newDocument();
            /* --- --- */

            // Creare l'elemento radice e lo "appende" al document
            Element root = document.createElement("company");
            document.appendChild(root);

            // Creare un elemento figlio e lo "appende" alla root
            Element employee = document.createElement("employee");
            root.appendChild(employee);

            // Aggiungere un attributo all'elemento employee
            employee.setAttribute("id", "1");

            // Creare e aggiungere i sotto-elementi a employee
            Element firstName = document.createElement("firstname");
            firstName.appendChild(document.createTextNode("John"));
            employee.appendChild(firstName);

            Element lastName = document.createElement("lastname");
            lastName.appendChild(document.createTextNode("Doe"));
            employee.appendChild(lastName);

            Element email = document.createElement("email");
            email.appendChild(document.createTextNode("john.doe@example.com"));
            employee.appendChild(email);

            /* STEP PER TRASFORMARE IL DOCUMENTO DOM IN UN FILE XML */
            // Creare l'istanza di TransformerFactory
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);

            // Creare il file XML
            StreamResult streamResult = new StreamResult(new File("employees.xml"));

            // Trasformare il DOM in un file XML
            transformer.transform(domSource, streamResult);

            System.out.println("File XML creato con successo!");

        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        }
    }
}
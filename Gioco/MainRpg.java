import java.util.Scanner;

public class MainRpg{

    public static void main(String[] args) {
            
        Consumabili pozioneVita = new Consumabili(7,4);

        Armi spada = new Armi("Spada lunga", 3, 0);
        Armi arco = new Armi("Arco", 2, 0);
    
        Personaggi protagonista = new Personaggi("Cortiz", 25, 4, 2, 25, spada);

        Personaggi orco = new Personaggi("Gondulf", 12, 3, 2, arco);
        Personaggi scheletro = new Personaggi("Randgarz", 10,  4, 2, arco);
        Personaggi nemico = new Personaggi("", 0, 0, 0, arco);

        gioco(protagonista, orco, pozioneVita, spada, scheletro, nemico);  

        System.out.println("IL GIOCO E' FINITO!!!");
    
        }


    public static void gioco(Personaggi protagonista, Personaggi orco, Consumabili pozioneVita, Armi spada, Personaggi scheletro, Personaggi nemico){

        Scanner scan = new Scanner(System.in);

            while(protagonista.getVita()>0){

            System.out.println("1. MOSTRA LE TUE STATISTICHE\n2. VAI AVANTI\n3.INVENTARIO\nINSERISCI LA TUA SCELTA: ");

            int risp = scan.nextInt();

            scan.nextLine();

            switch (risp) {

                case 1:
                
                    System.out.println("----------------------------------------------");
                    
                    System.out.println(protagonista.toString()); 

                    System.out.println("----------------------------------------------");
                    
                    break;

                case 2:

                    protagonista.vaiAvanti();

                    protagonista.combatti(protagonista, orco, scan, pozioneVita, scheletro, nemico);

                    break;

                case 3:

                    System.out.println("-->ARMI");
                    System.out.println(spada.getnomeSpada() + "\nDanno:" + spada.getDannoFisico() + "\n");
                    System.out.println("-->CONSUMABILI");
                    System.out.println("Pozioni della vita: " + pozioneVita.getQuantita() + "\n");
                    System.out.println("PREMI 'Q' PER CURARTI");
                    


                    break;


            }

        }

        scan.close();


    }
}

    
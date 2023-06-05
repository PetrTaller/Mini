import java.io.*;
import java.util.Scanner;

public class History{

    private String op;
    public double c1;
    public double c2;
    public double c3;
    public int c4;
    private int line = 0;
    private String text;
    private String text2;

    public void zapis()throws IOException{ // zapisuje do historie priklad a pokud jich je uz moc tak posledni vymaze a napise tam novy

        FileWriter fw = new FileWriter("historie.txt",true);
        File historie = new File("historie.txt");
        FileWriter fw2 = new FileWriter("historie2.txt",true);
        File historie2 = new File("historie2.txt");

        Scanner sc = new Scanner(historie);
        Scanner sc2 = new Scanner(historie);
        Scanner sc3 = new Scanner(historie2);
        line = 0;
        while(sc.hasNextLine()) {
            sc.nextLine();
            line++;
        }
        switch(c4){
            case 1:
            op = "+";
            break;
            case 2:
            op = "-";
            break;
            case 3:
            op = "×";
            break;
            case 4:
            op = "÷";
            break;
            case 0:
            op = "=";
        }
            if(op!="="){
                if(line < 10){
                    fw.write(c1+" "+op+" "+c2+" = "+c3+"\n");
                }else if(line >= 10){
                    sc2.nextLine();
                    while (sc2.hasNextLine()) {
                        text = sc2.nextLine();
                        fw2.write(text+"\n");
                    }
                    fw2.write(c1+" "+op+" "+c2+" = "+c3+"\n");

                    PrintWriter pw = new PrintWriter("historie.txt");
                    pw.write("");
                    pw.close();

                    fw2.close();
                    while (sc3.hasNextLine()) {
                        text2 = sc3.nextLine();
                        fw.write(text2+"\n");
                    }

                    PrintWriter pw2 = new PrintWriter("historie2.txt");
                    pw2.write("");
                    pw2.close();
                }
            }
            sc.close();
            sc2.close();
            sc3.close();
            fw.close();
        }

        public void ClearHistory() throws IOException{ // void pro mazani historie
            PrintWriter pw = new PrintWriter("historie.txt");
            pw.write("");
            pw.close();
        }

        public void DeleteLast() throws IOException{ // void pro mazani posledniho prikladu v historii, funguje tak ze 
            //zkopiruje celou historii bez poslednho prikladu do jineho txtoveho souboru a pak promaze ten zakladni a okopiruje z druheho uz bez stareho prikladu
            FileWriter fw = new FileWriter("historie.txt",true);
            File historie = new File("historie.txt");
            FileWriter fw2 = new FileWriter("historie2.txt",true);
            File historie2 = new File("historie2.txt");
            Scanner sc = new Scanner(historie);
            Scanner sc2 = new Scanner(historie);
            Scanner sc3 = new Scanner(historie2);
            line=0;

            while(sc.hasNextLine()) {
                sc.nextLine();
                line++;
            }

            int i = line;
            while(i > 1){
                text = sc2.nextLine();
                fw2.write(text+"\n");
                i--;
            }

            sc.close();
            sc2.close();

            PrintWriter pw = new PrintWriter("historie.txt");
            pw.write("");
            pw.close();

            fw2.close();

            while (sc3.hasNextLine()) {
                text2 = sc3.nextLine();
                fw.write(text2+"\n");
            }

            PrintWriter pw2 = new PrintWriter("historie2.txt");
            pw2.write("");
            pw2.close();

            fw.close();
            sc3.close();
        }

        public String text1;
        public String text12;
        public String text3;
        public String text4;
        public String text5;
        public String text6;
        public String text7;
        public String text8;
        public String text9;
        public String text10;
        
        public void ZapisHistorie() throws FileNotFoundException{ // zapise do text fieldu historii
            File historie96 = new File("historie.txt");
            Scanner sc96 = new Scanner(historie96);

            if(sc96.hasNextLine()){
            text = sc96.nextLine();
            text1 = text;
            }else{
            text1 = "";
            }
            if(sc96.hasNextLine()){
            text = sc96.nextLine();
            text12 = text;
            }else{
            text12 = "";
            }
            if(sc96.hasNextLine()){
            text = sc96.nextLine();
            text3 = text;
            }else{
            text3 = "";
            }
            if(sc96.hasNextLine()){
            text = sc96.nextLine();
            text4 = text;
            }else{
            text4 = "";
            }
            if(sc96.hasNextLine()){
            text = sc96.nextLine();
            text5 = text;
            }else{
            text5 = "";
            }
            if(sc96.hasNextLine()){
            text = sc96.nextLine();
            text6 = text;
            }else{
            text6 = "";
            }
            if(sc96.hasNextLine()){
            text = sc96.nextLine();
            text7 = text;
            }else{
            text7 = "";
            }
            if(sc96.hasNextLine()){
            text = sc96.nextLine();
            text8 = text;
            }else{
            text8 = "";
            }
            if(sc96.hasNextLine()){
            text = sc96.nextLine();
            text9 = text;
            }else{
            text9 = "";
            }
            if(sc96.hasNextLine()){
            text = sc96.nextLine();
            text10 = text;
            }else{
            text10 = "";
            }
            sc96.close();
        }

        public BufferedReader help;
        public void OpenHelp() throws FileNotFoundException{
            FileReader fr = new FileReader("help.txt");
            BufferedReader bf = new BufferedReader(fr);
            help = bf;
        }
}
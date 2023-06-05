import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Window implements ActionListener{;

        // radek 11 do 66 je pridavani ntlacitek framu textu atd + 42 az 45 inty na pocitani cisel a aktualni operace
        JFrame frame = new JFrame("Calculator");
        JButton b0 = new JButton("0");
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton Scitani = new JButton("+");
        JButton Odcitani = new JButton("-");
        JButton Nasobeni = new JButton("×");
        JButton Deleni = new JButton("÷");
        JButton Vypocteni = new JButton("=");
        JButton Mocnina = new JButton("x²");
        JButton Odmocnina = new JButton("√x");
        JButton Clear = new JButton("C");
        JButton Celych = new JButton(",");
        JButton Delete = new JButton("⌫");

        JButton History = new JButton("⟲");
        JButton Help = new JButton("?");

        JTextField text = new JTextField();

        Font font = new Font("Kai",Font.BOLD,25);
        Font font2 = new Font("Kai",Font.BOLD,20);
        Font font3 = new Font("Kai",Font.BOLD,30);

        public double cislo1=0;
        public double cislo2=0;
        public double vysledek=0;
        public int operace;

        History h = new History();

        JFrame historyframe = new JFrame("History");
        JButton ClearHistory = new JButton("Clear");
        JButton DeleteLast = new JButton("-");

        JPanel jp = new JPanel();
        GridLayout gl = new GridLayout(10,1);

        JTextField jtf1 = new JTextField();
        JTextField jtf2 = new JTextField();
        JTextField jtf3 = new JTextField();
        JTextField jtf4 = new JTextField();
        JTextField jtf5 = new JTextField();
        JTextField jtf6 = new JTextField();
        JTextField jtf7 = new JTextField();
        JTextField jtf8 = new JTextField();
        JTextField jtf9 = new JTextField();
        JTextField jtf10 = new JTextField();

        JFrame help = new JFrame("Help");
        JTextArea jta = new JTextArea();
        
        public void Open(){ //cely void je nastavovani tlacitkum textum atd vlastnosti a davani je na frame
            
            jta.setBackground(Color.DARK_GRAY);
            jta.setForeground(Color.WHITE);
            jta.setBounds(0,0,help.WIDTH,help.HEIGHT);
            jta.setFont(new Font("Kai",Font.BOLD,15));
            jta.setFocusable(false);
            try {
                h.OpenHelp();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            try {
                jta.read(h.help, null);
            } catch (IOException e) {
                e.printStackTrace();
            }
            help.setSize(1350, 560);
            help.setResizable(true);
            help.add(jta);
            help.setLocationRelativeTo(null);
            
            jtf1.setBackground(Color.GRAY);
            jtf1.setHorizontalAlignment(JTextField.CENTER);
            jtf1.setForeground(Color.WHITE);
            jtf1.setFocusable(false);
            jp.add(jtf1,0);
            jtf2.setBackground(Color.GRAY);
            jtf2.setHorizontalAlignment(JTextField.CENTER);
            jtf2.setForeground(Color.WHITE);
            jtf2.setFocusable(false);
            jp.add(jtf2,1);
            jtf3.setBackground(Color.GRAY);
            jtf3.setHorizontalAlignment(JTextField.CENTER);
            jtf3.setForeground(Color.WHITE);
            jtf3.setFocusable(false);
            jp.add(jtf3,2);
            jtf4.setBackground(Color.GRAY);
            jtf4.setHorizontalAlignment(JTextField.CENTER);
            jtf4.setForeground(Color.WHITE);
            jtf4.setFocusable(false);
            jp.add(jtf4,3);
            jtf5.setBackground(Color.GRAY);
            jtf5.setHorizontalAlignment(JTextField.CENTER);
            jtf5.setForeground(Color.WHITE);
            jtf5.setFocusable(false);
            jp.add(jtf5,4);
            jtf6.setBackground(Color.GRAY);
            jtf6.setHorizontalAlignment(JTextField.CENTER);
            jtf6.setForeground(Color.WHITE);
            jtf6.setFocusable(false);
            jp.add(jtf6,5);
            jtf7.setBackground(Color.GRAY);
            jtf7.setHorizontalAlignment(JTextField.CENTER);
            jtf7.setForeground(Color.WHITE);
            jtf7.setFocusable(false);
            jp.add(jtf7,6);
            jtf8.setBackground(Color.GRAY);
            jtf8.setHorizontalAlignment(JTextField.CENTER);
            jtf8.setForeground(Color.WHITE);
            jtf8.setFocusable(false);
            jp.add(jtf8,7);
            jtf9.setBackground(Color.GRAY);
            jtf9.setHorizontalAlignment(JTextField.CENTER);
            jtf9.setForeground(Color.WHITE);
            jtf9.setFocusable(false);
            jp.add(jtf9,8);
            jtf10.setBackground(Color.GRAY);
            jtf10.setHorizontalAlignment(JTextField.CENTER);
            jtf10.setForeground(Color.WHITE);
            jtf10.setFocusable(false);
            jp.add(jtf10,9);

            b0.setBounds(20, 250, 110, 50);
            b0.setFocusable(false);
            b0.addActionListener(this);
            b0.setFont(font);
            b0.setBackground(Color.GRAY);
            b0.setForeground(Color.WHITE);

            b1.setBounds(20, 190, 50, 50);
            b1.setFocusable(false);
            b1.addActionListener(this);
            b1.setFont(font);
            b1.setBackground(Color.GRAY);
            b1.setForeground(Color.WHITE);

            b2.setBounds(80, 190, 50, 50);
            b2.setFocusable(false);
            b2.addActionListener(this);
            b2.setFont(font);
            b2.setBackground(Color.GRAY);
            b2.setForeground(Color.WHITE);

            b3.setBounds(140, 190, 50, 50);
            b3.setFocusable(false);
            b3.addActionListener(this);
            b3.setFont(font);
            b3.setBackground(Color.GRAY);
            b3.setForeground(Color.WHITE);

            b4.setBounds(20, 130, 50, 50);
            b4.setFocusable(false);
            b4.addActionListener(this);
            b4.setFont(font);
            b4.setBackground(Color.GRAY);
            b4.setForeground(Color.WHITE);

            b5.setBounds(80, 130, 50, 50);
            b5.setFocusable(false);
            b5.addActionListener(this);
            b5.setFont(font);
            b5.setBackground(Color.GRAY);
            b5.setForeground(Color.WHITE);

            b6.setBounds(140, 130, 50, 50);
            b6.setFocusable(false);
            b6.addActionListener(this);
            b6.setFont(font);
            b6.setBackground(Color.GRAY);
            b6.setForeground(Color.WHITE);

            b7.setBounds(20, 70, 50, 50);
            b7.setFocusable(false);
            b7.addActionListener(this);
            b7.setFont(font);
            b7.setBackground(Color.GRAY);
            b7.setForeground(Color.WHITE);

            b8.setBounds(80, 70, 50, 50);
            b8.setFocusable(false);
            b8.addActionListener(this);
            b8.setFont(font);
            b8.setBackground(Color.GRAY);
            b8.setForeground(Color.WHITE);

            b9.setBounds(140, 70, 50, 50);
            b9.setFocusable(false);
            b9.addActionListener(this);
            b9.setFont(font);
            b9.setBackground(Color.GRAY);
            b9.setForeground(Color.WHITE);

            Mocnina.setBounds(200, 70, 70, 50);
            Mocnina.setFocusable(false);
            Mocnina.addActionListener(this);
            Mocnina.setFont(font);
            Mocnina.setBackground(Color.GRAY);
            Mocnina.setForeground(Color.WHITE);

            Odmocnina.setBounds(200, 130, 70, 50);
            Odmocnina.setFocusable(false);
            Odmocnina.addActionListener(this);
            Odmocnina.setFont(font);
            Odmocnina.setBackground(Color.GRAY);
            Odmocnina.setForeground(Color.WHITE);

            Scitani.setBounds(20, 310, 50, 50);
            Scitani.setFocusable(false);
            Scitani.addActionListener(this);
            Scitani.setFont(font);
            Scitani.setBackground(Color.GRAY);
            Scitani.setForeground(Color.WHITE);

            Odcitani.setBounds(80, 310, 50, 50);
            Odcitani.setFocusable(false);
            Odcitani.addActionListener(this);
            Odcitani.setFont(font3);
            Odcitani.setBackground(Color.GRAY);
            Odcitani.setForeground(Color.WHITE);

            Nasobeni.setBounds(200, 250, 70, 50);
            Nasobeni.setFocusable(false);
            Nasobeni.addActionListener(this);
            Nasobeni.setFont(font);
            Nasobeni.setBackground(Color.GRAY);
            Nasobeni.setForeground(Color.WHITE);

            Deleni.setBounds(200, 190, 70, 50);
            Deleni.setFocusable(false);
            Deleni.addActionListener(this);
            Deleni.setFont(font);
            Deleni.setBackground(Color.GRAY);
            Deleni.setForeground(Color.WHITE);

            Celych.setBounds(140, 250, 50, 50);
            Celych.setFocusable(false);
            Celych.addActionListener(this);
            Celych.setFont(font);
            Celych.setBackground(Color.GRAY);
            Celych.setForeground(Color.WHITE);

            Clear.setBounds(140, 310, 50, 50);
            Clear.setFocusable(false);
            Clear.addActionListener(this);
            Clear.setFont(font2);
            Clear.setBackground(Color.GRAY);
            Clear.setForeground(Color.WHITE);

            Vypocteni.setBounds(200, 310, 70, 50);
            Vypocteni.setFocusable(false);
            Vypocteni.addActionListener(this);
            Vypocteni.setFont(font);
            Vypocteni.setBackground(Color.GRAY);
            Vypocteni.setForeground(Color.WHITE);

            Delete.setBounds(280, 20, 55, 40);
            Delete.setFocusable(false);
            Delete.addActionListener(this);
            Delete.setFont(new Font("Kai",Font.BOLD,13));
            Delete.setBackground(Color.GRAY);
            Delete.setForeground(Color.WHITE);

            History.setBounds(290, 310, 50, 50);
            History.setFocusable(false);
            History.addActionListener(this);
            History.setFont(new Font("Kai",Font.BOLD,18));
            History.setBackground(Color.LIGHT_GRAY);
            History.setForeground(Color.WHITE);

            Help.setBounds(290, 250, 50, 50);
            Help.setFocusable(false);
            Help.addActionListener(this);
            Help.setFont(new Font("Kai",Font.BOLD,18));
            Help.setBackground(Color.LIGHT_GRAY);
            Help.setForeground(Color.WHITE);

            frame.add(Help);
            frame.add(History);
            frame.add(Delete);
            frame.add(b0);
            frame.add(b1);
            frame.add(b2);
            frame.add(b3);
            frame.add(b4);
            frame.add(b5);
            frame.add(b6);
            frame.add(b7);
            frame.add(b8);
            frame.add(b9);
            frame.add(Mocnina);
            frame.add(Odmocnina);
            frame.add(Scitani);
            frame.add(Odcitani);
            frame.add(Nasobeni);
            frame.add(Deleni);
            frame.add(Celych);
            frame.add(Clear);
            frame.add(Vypocteni);
            
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(370, 420);
            frame.setLayout(null);
            frame.getContentPane().setBackground(Color.DARK_GRAY);
            frame.setResizable(false);

            text.setBounds(20, 20, 250, 40);
            text.setFont(font);
            text.setEditable(false);
            frame.add(text);

            frame.setVisible(true);
            frame.setLocationRelativeTo(null);

            ClearHistory.setBounds(145, 310, 115, 50);
            ClearHistory.setFocusable(false);
            ClearHistory.addActionListener(this);
            ClearHistory.setFont(font);
            ClearHistory.setBackground(Color.GRAY);
            ClearHistory.setForeground(Color.WHITE);

            DeleteLast.setBounds(20, 310, 115, 50);
            DeleteLast.setFocusable(false);
            DeleteLast.addActionListener(this);
            DeleteLast.setFont(font3);
            DeleteLast.setBackground(Color.GRAY);
            DeleteLast.setForeground(Color.WHITE);

            historyframe.add(ClearHistory);
            historyframe.add(DeleteLast);

            historyframe.setSize(295, 420);
            historyframe.setLayout(null);
            historyframe.getContentPane().setBackground(Color.DARK_GRAY);
            historyframe.setResizable(false);

            jp.setBounds(20,20,240,280);    
            jp.setBackground(Color.gray);  
            jp.setLayout(gl);
            historyframe.add(jp);
        }
        
        public void ClickSound() throws Exception{  // void pro klici zvuk kdyz se klika na tlacitko
            File click = new File("clicksound.wav");
            try{
                Clip clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(click));
                clip.start();
            } catch (Exception e){
                throw new Exception(e);
            }
        }
        
        public void NextNum(){ // void po zmacknuti nejake operace jako je +,- atd. aby se mohlo psat dalsi cislo
            cislo1 = Double.parseDouble(text.getText());
            text.setText("");
        }
        
        @Override
        public void actionPerformed(ActionEvent e){ // tento void se spusti pokud se zmackne tlacitko a hleda jake se zmacklo
            
            try {
                ClickSound();
            } catch (Exception e1) {

            }
            if((text.getText()).length() < 17){ // pokud neni moc velky text tak aby se vesel do kalkulacky tak podle tlacitka napise cislo 
                if(e.getSource()==b0){
                    text.setText(text.getText().concat("0"));
                }
                if(e.getSource()==b1){
                    text.setText(text.getText().concat("1"));
                }
                if(e.getSource()==b2){
                    text.setText(text.getText().concat("2"));
                }
                if(e.getSource()==b3){
                    text.setText(text.getText().concat("3"));
                }
                if(e.getSource()==b4){
                    text.setText(text.getText().concat("4"));
                }
                if(e.getSource()==b5){
                    text.setText(text.getText().concat("5"));
                }
                if(e.getSource()==b6){
                    text.setText(text.getText().concat("6"));
                }
                if(e.getSource()==b7){
                    text.setText(text.getText().concat("7"));
                }
                if(e.getSource()==b8){
                    text.setText(text.getText().concat("8"));
                }
                if(e.getSource()==b9){
                    text.setText(text.getText().concat("9"));
                }
            }
            if(e.getSource()==Clear){ //vymaze vsechny vstupy z tlacitek
                cislo1 = 0;
                cislo2 = 0;
                vysledek = 0;
                text.setText("");
            }
            if(e.getSource()==Celych){ // prida desetinou carku pokud uz v cisle neni a pokud tam uz nejake cislo je aby ji dal za nej
                if(text.getText().contains(".")==false && text.getText().isEmpty()==false){
                    char poslednichar = text.getText().charAt(text.getText().length()-1);
                    int posledni = Integer.parseInt(String.valueOf(poslednichar));
                    if(posledni <= 10 || posledni >= 0){
                    text.setText(text.getText().concat("."));
                    }
                }
            }
            if(e.getSource()==Delete){ // smaze posledni zapsane cislo
                if(text.getText().isEmpty()==false){
                    text.setText(text.getText().substring(0, text.getText().length()-1));
                }
            }
            if(e.getSource()==Scitani){ // tyhle 4 ify zadavaji index na operaci
                if(text.getText().isEmpty()==false){
                NextNum();
                operace = 1;
                }
            }
            if(e.getSource()==Odcitani){
                if(text.getText().isEmpty()==false){
                NextNum();
                operace = 2;
                }
            }
            if(e.getSource()==Nasobeni){
                if(text.getText().isEmpty()==false){
                NextNum();
                operace = 3;
                }
            }
            if(e.getSource()==Deleni){
                if(text.getText().isEmpty()==false){
                NextNum();
                operace = 4;
                }
            }
            if(e.getSource()==Vypocteni){ // po zmacknuti rovnitka se hleda jaka byla zadana operace a vypocita cislo + zavola zapis do historie
                if(text.getText().isEmpty()==false){
                cislo2=Double.parseDouble(text.getText());
                switch(operace){
                    case 1:
                    vysledek= cislo1+cislo2;
                    break;
                    case 2:
                    vysledek= cislo1-cislo2;
                    break;
                    case 3:
                    vysledek= cislo1*cislo2;
                    break;
                    case 4:
                    vysledek= cislo1/cislo2;
                    break;
                    case 0:
                    vysledek= cislo2;
                }
                text.setText(Double.toString(vysledek));

                h.c1 = cislo1;
                h.c2= cislo2;
                h.c3= vysledek;
                h.c4= operace;

                try {
                    h.zapis();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }

                cislo1 = vysledek;
                operace = 0;
                }
                try {
                    h.ZapisHistorie();
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
                    }
                if(e.getSource()==Mocnina){ // mocnina a odmocnina funguji samostatne takze jen cislo nasobi 2x nebo 0.5x
                    if(text.getText().isEmpty()==false){
                        cislo2 = Double.parseDouble(text.getText());
                        vysledek = Math.pow(cislo2,2);
                        text.setText(Double.toString(vysledek));
                    }
                }
                if(e.getSource()==Odmocnina){
                    if(text.getText().isEmpty()==false){
                        cislo2 = Double.parseDouble(text.getText());
                        vysledek = Math.pow(cislo2,0.5);
                        text.setText(Double.toString(vysledek));
                    }
                }
                if(e.getSource()==History){ // otevre okenko historie
                    historyframe.setVisible(true);
                    historyframe.setBounds(frame.getX()+355, frame.getY(), historyframe.getWidth(), historyframe.getHeight());
                    try {
                        h.ZapisHistorie();
                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }
                }   //vycisti celou txtovou slozku historie (zavola void z jine tridy)
                if(e.getSource()==ClearHistory){
                    try {
                        h.ClearHistory();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                    try {
                        h.ZapisHistorie();
                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }
                } //vymaze posledni zapis z historie (zavola void z jine tridy)
                if(e.getSource()==DeleteLast){
                    try {
                        h.DeleteLast();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                    try {
                        h.ZapisHistorie();
                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }
                }
                if(e.getSource()==Help){
                    help.setVisible(true);
                    try {
                    h.OpenHelp();
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
                }
            }   //zapisuje historii do text fieldu aby je uzivatel videl
            public void ZapisHistorie(){
                jtf1.setText(h.text1);
                jtf2.setText(h.text12);
                jtf3.setText(h.text3);
                jtf4.setText(h.text4);
                jtf5.setText(h.text5);
                jtf6.setText(h.text6);
                jtf7.setText(h.text7);
                jtf8.setText(h.text8);
                jtf9.setText(h.text9);
                jtf10.setText(h.text10);
            }
        }
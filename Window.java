import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Window implements ActionListener{

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
        JButton Nasobeni = new JButton("x");
        JButton Deleni = new JButton("⁒");
        JButton Vypocteni = new JButton("=");
        JButton Mocnina = new JButton("x²");
        JButton Odmocnina = new JButton("√x");
        JButton Clear = new JButton("C");
        JButton Celych = new JButton(",");
        JButton DeleteHistory = new JButton("Delete");
        JButton DeletePrvniHistory = new JButton("-");

        JTextField text = new JTextField();

        Font font = new Font("Kai",Font.BOLD,25);
        Font font2 = new Font("Kai",Font.BOLD,20);
        Font font3 = new Font("Kai",Font.BOLD,30);

        private double cislo1=0;
        private double cislo2=0;
        private double vysledek=0;

        public Window(){

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
            frame.setSize(600, 420);
            frame.setLayout(null);
            frame.getContentPane().setBackground(Color.DARK_GRAY);

            text.setBounds(20, 20, 250, 40);
            text.setFont(font);
            text.setEditable(false);
            frame.add(text);

            frame.setVisible(true);
        }

        public void ClickSound() throws Exception{
            File click = new File("click.wav");
            try{
                Clip clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(click));
                clip.start();
            } catch (Exception e){
                throw new Exception(e);
            }
        }

        public void actionPerformed(ActionEvent e){
            
            try {
                ClickSound();
            } catch (Exception e1) {
                e1.printStackTrace();
            }

            if(e.getSource()==b7){
                System.out.println("7");
            }
            if(e.getSource()==b8){
                System.out.println("8");
            }

        }

}

package noapplet.example;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


@SuppressWarnings("serial")
public class GUI extends JFrame{
    Container c;
    MapSize size=new MapSize();
    public GUI(String title) {
        c=getContentPane();
        setBounds(200,20,700,700);
        c.setLayout(null);
        Map map=new Map(size);
        DrawBoard d=new DrawBoard(size,map);
        setContentPane(d);
        addMouseListener(new MouseEventHandler(map, size,d,this));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void popUp(String message) {
        JOptionPane.showMessageDialog(this, message,"CONGRATS",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
    public void start() {
        //timer.start();
    }

    public void close() {
        System.exit(0);
    }


}
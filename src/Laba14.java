import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Laba14 extends Frame {
    Laba14() {
        setSize(500, 500);
        setLocation(500, 350);

        Label labelA = new Label("a");
        Label labelB = new Label("b");
        Label labelSum = new Label("sum");

        TextField textFieldA = new TextField();
        TextField textFieldB = new TextField();
        TextField textFieldSum = new TextField();

        Button calc = new Button("calculate");
        Button clear = new Button("clear");

        setLayout(null);

        labelA.setBounds(50,50,30,25);
        labelB.setBounds(50,80,30,25);
        labelSum.setBounds(50,110,30,25);

        textFieldA.setBounds(90,50,50,25);
        textFieldB.setBounds(90,80,50,25);
        textFieldSum.setBounds(90,110,50,25);

        calc.setBounds(70,140,50,30);
        clear.setBounds(70,180,50,30);

        calc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(textFieldA.getText());
                    int b = Integer.parseInt(textFieldB.getText());
                    int sum = a + b;
                    textFieldSum.setText(Integer.toString(sum));
                }
                catch (NumberFormatException ne){
                    textFieldA.setText("");
                    textFieldB.setText("");
                    textFieldSum.setText("error");
                }
            }
        });
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textFieldA.setText("");
                textFieldB.setText("");
                textFieldSum.setText("");
            }
        });
        add(labelA);
        add(labelB);
        add(labelSum);
        add(textFieldA);
        add(textFieldB);
        add(textFieldSum);
        add(clear);
        add(calc);

        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new Laba14();
    }
}
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculationForm {
    private JPanel panel1;
    private JButton a4Button;
    private JButton a7Button;
    private JButton a0Button;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button1;
    private JEditorPane editorPane1;
    private JButton deleteButton;
    private JButton backspacceButton;
    private char end = ' ';
    private String text = "";
    private double[] value = new double[]{};
    private double res = 0;
    private double result = 0;

    JFrame cal = new JFrame();

    void open(){
        cal.setContentPane(new CalculationForm().panel1);
        cal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cal.pack();
        cal.setVisible(true);
    }


    public CalculationForm() {
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editorPane1.setText(editorPane1.getText() + "1");
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editorPane1.setText(editorPane1.getText() + "2");
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editorPane1.setText(editorPane1.getText() + "3");
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editorPane1.setText(editorPane1.getText() + "4");
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editorPane1.setText(editorPane1.getText() + "5");
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editorPane1.setText(editorPane1.getText() + "6");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editorPane1.setText(editorPane1.getText() + "7");
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editorPane1.setText(editorPane1.getText() + "8");
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editorPane1.setText(editorPane1.getText() + "9");
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editorPane1.setText(editorPane1.getText() + "0");
            }
        });
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                end = editorPane1.getText().toCharArray()[editorPane1.getText().length()-1];
                    switch (end) {
                        case '+':
                            break;
                        case '-':
                            break;
                        case '*':
                            break;
                        case '/':
                            break;
                        case ' ':
                            break;
                        default:
                            editorPane1.setText(editorPane1.getText() + "-");
                            break;
                    }
            }
        });
        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                end = editorPane1.getText().toCharArray()[editorPane1.getText().length()-1];
                switch (end) {
                    case '+':
                        break;
                    case '-':
                        break;
                    case '*':
                        break;
                    case '/':
                        break;
                    case ' ':
                        break;
                    default:
                        editorPane1.setText(editorPane1.getText() + "+");
                        break;
                }
            }
        });
        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                end = editorPane1.getText().toCharArray()[editorPane1.getText().length()-1];
                switch (end) {
                    case '+':
                        break;
                    case '-':
                        break;
                    case '*':
                        break;
                    case '/':
                        break;
                    case ' ':
                        break;
                    default:
                        editorPane1.setText(editorPane1.getText() + "*");
                        break;
                }
            }
        });
        button14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                end = editorPane1.getText().toCharArray()[editorPane1.getText().length()-1];
                switch (end) {
                    case '+':
                        break;
                    case '-':
                        break;
                    case '*':
                        break;
                    case '/':
                        break;
                    case ' ':
                        break;
                    default:
                        editorPane1.setText(editorPane1.getText() + "/");
                        break;
                }
            }
        });
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editorPane1.setText(" ");
            }
        });
        backspacceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (editorPane1.getText().equals(" ")) {
                }else {
                    editorPane1.setText(editorPane1.getText().substring(0, editorPane1.getText().length() - 1));
                }
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text = editorPane1.getText().trim(); // 456+78
                char txt[] = text.toCharArray();
                char[] znaki =new char[20];
                String[] chisla = new String[20];
                int iznaki = 0;
                int ichisla = 0;
                int[] indexofindex = new int[] {};
                for (int i = 0; i <chisla.length ; i++) {
                    chisla[i] = "";
                }

                for (int i = 0; i<txt.length; i++){
                    if (txt[i] == '+' || txt[i]=='-' || txt[i]=='/' || txt[i]=='*') {
                        znaki[iznaki] = txt[i];
                        iznaki++;
                        ichisla++;
                    }else {
                        chisla[ichisla] = chisla[ichisla] + txt[i];
                    }
                }

                for (int i = 0; i < iznaki; i++){
                    switch (znaki[i]){
                        case '+':
                            if (result == 0){
                                result = Integer.parseInt(chisla[i]) + Integer.parseInt(chisla[i+1]);
                            }else {
                                result = result + Integer.parseInt(chisla[i+1]);
                            }
                            break;
                        case '-':
                            if (result == 0){
                                result = Integer.parseInt(chisla[i]) - Integer.parseInt(chisla[i+1]);
                            }else {
                                result = result - Integer.parseInt(chisla[i+1]);
                            }
                            break;
                        case '*':
                            if (result == 0){
                                result = Integer.parseInt(chisla[i]) * Integer.parseInt(chisla[i+1]);
                            }else {
                                result = result * Integer.parseInt(chisla[i+1]);
                            }
                            break;
                        case '/':
                            if (result == 0){
                                result = Integer.parseInt(chisla[i]) / Integer.parseInt(chisla[i+1]);
                            }else {
                                result = result / Integer.parseInt(chisla[i+1]);
                            }
                            break;
                    }
                }






                editorPane1.setText("Result = " + result);

               /* for(int i = 0; i<=iznaki; i++){
                    if (znaki[i] == '*'){
                        if (indexofindex[i] == i){
                            res = res * Integer.parseInt(chisla[i+1]);
                        }
                        if (indexofindex[i+1] == i+1){
                            res = res * Integer.parseInt(chisla[i]);
                        }else {
                            res = Integer.parseInt(chisla[i]) * Integer.parseInt(chisla[i + 1]);
                            indexofindex[i] = i;
                            indexofindex[i + 1] = i + 1;
                        }
                    }
                    if (znaki[i] == '/'){
                        if (indexofindex[i] == i){
                            res = res / Integer.parseInt(chisla[i+1]);
                        }
                        if (indexofindex[i+1] == i+1){
                            res =Integer.parseInt(chisla[i]) / res;
                        }else {
                            res = Integer.parseInt(chisla[i]) / Integer.parseInt(chisla[i + 1]);
                            indexofindex[i] = i;
                            indexofindex[i + 1] = i + 1;
                        }

                    }
                    switch (znaki[iznaki]){
                        case '+':
                            res = Integer.parseInt(chisla[i]) + Integer.parseInt(chisla[i+1]);
                            break;
                    }
                } */



               /* for (int j = 0; j<value.length; j++) {
                    for (int i = 0; i < text.length(); i++) {
                     if (text.toCharArray()[i] == '-' || text.toCharArray()[i] == '+' || text.toCharArray()[i] == '*' || text.toCharArray()[i] == '/') {
                         value[j] = Integer.parseInt(text.substring(0, text.indexOf(text.toCharArray()[i])));


                         //value[j] = Integer.parseInt(text.substring(text.length()-i, i));
                            break;
                        }
                    }
                }*/
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}

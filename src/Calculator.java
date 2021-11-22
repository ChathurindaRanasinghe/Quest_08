import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;


public class Calculator implements ActionListener {

    final int fontSize = 20;
    final Font font = new Font("SFUIDisplay-Regular", Font.PLAIN, fontSize);
    final Font font2 = new Font("SFUIDisplay-Regular", Font.PLAIN, 35);
    final Color color = new Color(191, 245, 239);
    final Color color2 = new Color(142, 236, 216);

    JFrame frame;//Creating object of JFrame class

    JTextField textField = new JTextField();

    JButton buttonZero = new JButton("0");
    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    JButton buttonDot = new JButton(".");
    JButton buttonClear = new JButton("C");
    JButton buttonDelete = new JButton("DEL");
    JButton buttonEqual = new JButton("=");
    JButton buttonMul = new JButton("x");
    JButton buttonDiv = new JButton("/");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonMod = new JButton("%");
    JButton buttonOpenParenthesis = new JButton("(");
    JButton buttonClosedParenthesis = new JButton(")");

    JButton buttonSin = new JButton("sin");
    JButton buttonCos = new JButton("cos");
    JButton buttonTan = new JButton("tan");
    JButton buttonaSin = new JButton("asin");
    JButton buttonaCos = new JButton("acos");
    JButton buttonaTan = new JButton("atan");


    Calculator()//Creating constructor of the class
    {
        prepareGUI();
        addComponents();
        addActionEvents();
    }
    public void prepareGUI()
    {
        frame = new JFrame();

        frame.setTitle("Calculator");                           //Setting title of the JFrame
        frame.setSize(380,675);                     //Setting size
        frame.getContentPane().setLayout(null);                 //Setting Layout
        frame.getContentPane().setBackground(color);      //Setting Background Color
        frame.setResizable(false);                              //Preventing window from resizing
        frame.setLocationRelativeTo(null);                      //Setting location to the center of the screen
        frame.setVisible(true);                                 //Setting window's visibility
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //Setting default close operation
    }

    public void addComponents(){

        textField.setBounds(0, 0, 370, 160);
        textField.setFont(font2);
        textField.setBackground(color2);
        textField.setBorder(BorderFactory.createEmptyBorder(0,5,0,5));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.LEFT);
        frame.add(textField);

        buttonOpenParenthesis.setBounds(15, 170, 80, 60);
        buttonOpenParenthesis.setFont(font);
        buttonOpenParenthesis.setBackground(color);
        buttonOpenParenthesis.setBorderPainted(false);
        frame.add(buttonOpenParenthesis);

        buttonClosedParenthesis.setBounds(100, 170, 80, 60);
        buttonClosedParenthesis.setFont(font);
        buttonClosedParenthesis.setBackground(color);
        buttonClosedParenthesis.setBorderPainted(false);
        frame.add(buttonClosedParenthesis);

        buttonClear.setBounds(185, 170, 80, 60);
        buttonClear.setFont(font);
        buttonClear.setBackground(color);
        buttonClear.setBorderPainted(false);
        frame.add(buttonClear);

        buttonDelete.setBounds(270, 170, 80, 60);
        buttonDelete.setFont(font);
        buttonDelete.setBackground(color);
        buttonDelete.setBorderPainted(false);
        frame.add(buttonDelete);

        buttonSin.setBounds(15, 235, 80, 60);
        buttonSin.setFont(font);
        buttonSin.setBackground(color);
        buttonSin.setBorderPainted(false);
        frame.add(buttonSin);

        buttonCos.setBounds(100, 235, 80, 60);
        buttonCos.setFont(font);
        buttonCos.setBackground(color);
        buttonCos.setBorderPainted(false);
        frame.add(buttonCos);

        buttonTan.setBounds(185, 235, 80, 60);
        buttonTan.setFont(font);
        buttonTan.setBackground(color);
        buttonTan.setBorderPainted(false);
        frame.add(buttonTan);

        buttonMod.setBounds(270, 235, 80, 60);
        buttonMod.setFont(font);
        buttonMod.setBackground(color);
        buttonMod.setBorderPainted(false);
        frame.add(buttonMod);

        buttonaSin.setBounds(15, 300, 80, 60);
        buttonaSin.setFont(font);
        buttonaSin.setBackground(color);
        buttonaSin.setBorderPainted(false);
        frame.add(buttonaSin);

        buttonaCos.setBounds(100, 300, 80, 60);
        buttonaCos.setFont(font);
        buttonaCos.setBackground(color);
        buttonaCos.setBorderPainted(false);
        frame.add(buttonaCos);

        buttonaTan.setBounds(185, 300, 80, 60);
        buttonaTan.setFont(font);
        buttonaTan.setBackground(color);
        buttonaTan.setBorderPainted(false);
        frame.add(buttonaTan);

        buttonDiv.setBounds(270, 300, 80, 60);
        buttonDiv.setFont(font);
        buttonDiv.setBackground(color);
        buttonDiv.setBorderPainted(false);
        frame.add(buttonDiv);

        buttonSeven.setBounds(15, 365, 80, 60);
        buttonSeven.setFont(font);
        buttonSeven.setBackground(color);
        buttonSeven.setBorderPainted(false);
        frame.add(buttonSeven);

        buttonEight.setBounds(100, 365, 80, 60);
        buttonEight.setFont(font);
        buttonEight.setBackground(color);
        buttonEight.setBorderPainted(false);
        frame.add(buttonEight);

        buttonNine.setBounds(185, 365, 80, 60);
        buttonNine.setFont(font);
        buttonNine.setBackground(color);
        buttonNine.setBorderPainted(false);
        frame.add(buttonNine);

        buttonMul.setBounds(270, 365, 80, 60);
        buttonMul.setFont(font);
        buttonMul.setBackground(color);
        buttonMul.setBorderPainted(false);
        frame.add(buttonMul);

        buttonFour.setBounds(15, 430, 80, 60);
        buttonFour.setFont(font);
        buttonFour.setBackground(color);
        buttonFour.setBorderPainted(false);
        frame.add(buttonFour);

        buttonFive.setBounds(100, 430, 80, 60);
        buttonFive.setFont(font);
        buttonFive.setBackground(color);
        buttonFive.setBorderPainted(false);
        frame.add(buttonFive);

        buttonSix.setBounds(185, 430, 80, 60);
        buttonSix.setFont(font);
        buttonSix.setBackground(color);
        buttonSix.setBorderPainted(false);
        frame.add(buttonSix);

        buttonMinus.setBounds(270, 430, 80, 60);
        buttonMinus.setFont(font);
        buttonMinus.setBackground(color);
        buttonMinus.setBorderPainted(false);
        frame.add(buttonMinus);

        buttonOne.setBounds(15, 495, 80, 60);
        buttonOne.setFont(font);
        buttonOne.setBackground(color);
        buttonOne.setBorderPainted(false);
        frame.add(buttonOne);

        buttonTwo.setBounds(100, 495, 80, 60);
        buttonTwo.setFont(font);
        buttonTwo.setBackground(color);
        buttonTwo.setBorderPainted(false);
        frame.add(buttonTwo);

        buttonThree.setBounds(185, 495, 80, 60);
        buttonThree.setFont(font);
        buttonThree.setBackground(color);
        buttonThree.setBorderPainted(false);
        frame.add(buttonThree);

        buttonPlus.setBounds(270, 495, 80, 60);
        buttonPlus.setFont(font);
        buttonPlus.setBackground(color);
        buttonPlus.setBorderPainted(false);
        frame.add(buttonPlus);

        buttonZero.setBounds(15, 560, 165, 60);
        buttonZero.setFont(font);
        buttonZero.setBackground(color);
        buttonZero.setBorderPainted(false);
        frame.add(buttonZero);

        buttonDot.setBounds(185, 560, 80, 60);
        buttonDot.setFont(font);
        buttonDot.setBackground(color);
        buttonDot.setBorderPainted(false);
        frame.add(buttonDot);

        buttonEqual.setBounds(270, 560, 80, 60);
        buttonEqual.setFont(font);
        buttonEqual.setBackground(color);
        buttonEqual.setBorderPainted(false);
        frame.add(buttonEqual);



    }

    public void addActionEvents(){

        buttonZero.addActionListener(this);
        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonFour.addActionListener(this);
        buttonFive.addActionListener(this);
        buttonSix.addActionListener(this);
        buttonSeven.addActionListener(this);
        buttonEight.addActionListener(this);
        buttonNine.addActionListener(this);
        buttonDot.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonDelete.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonMul.addActionListener(this);
        buttonDiv.addActionListener(this);
        buttonPlus .addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonMod.addActionListener(this);
        buttonOpenParenthesis.addActionListener(this);
        buttonClosedParenthesis.addActionListener(this);
        buttonSin.addActionListener(this);
        buttonCos.addActionListener(this);
        buttonTan.addActionListener(this);
        buttonaSin.addActionListener(this);
        buttonaCos.addActionListener(this);
        buttonaTan.addActionListener(this);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

//        if (source == onRadioButton) {
//            enable();//Calling enable() function
//        } else if (source == offRadioButton) {
//            disable();//Calling disable function
//        }
        if (source == buttonClear) {
            //Clearing texts of label and text field
            textField.setText("");
        } else if (source == buttonDelete) {
            //Setting functionality for delete button(backspace)
            int length = textField.getText().length();
            int number = length - 1;


            if (number > 0) {   //if (length > 0)
                StringBuilder back = new StringBuilder(textField.getText());
                back.deleteCharAt(number);
                textField.setText(back.toString());

            }
            else { //if (textField.getText().endsWith(""))
                // label.setText("");
                textField.setText("");
            }
        } else if (source == buttonZero) {
            if (textField.getText().equals("0")) {
            } else {
                textField.setText(textField.getText() + "0");
            }
        } else if (source == buttonOne) {
            textField.setText(textField.getText() + "1");
        } else if (source == buttonTwo) {
            textField.setText(textField.getText() + "2");
        } else if (source == buttonThree) {
            textField.setText(textField.getText() + "3");
        } else if (source == buttonFour) {
            textField.setText(textField.getText() + "4");
        } else if (source == buttonFive) {
            textField.setText(textField.getText() + "5");
        } else if (source == buttonSix) {
            textField.setText(textField.getText() + "6");
        } else if (source == buttonSeven) {
            textField.setText(textField.getText() + "7");
        } else if (source == buttonEight) {
            textField.setText(textField.getText() + "8");
        } else if (source == buttonNine) {
            textField.setText(textField.getText() + "9");
        } else if (source == buttonDot) {

            textField.setText(textField.getText() + ".");

        } else if (source == buttonPlus) {

            textField.setText(textField.getText() + "+");


        } else if (source == buttonMinus) {

            textField.setText(textField.getText() + "-");

        } else if (source == buttonMul) {

            textField.setText(textField.getText() + "*");
        } else if (source == buttonDiv) {

            textField.setText(textField.getText() + "/");

        } else if (source == buttonMod) {

            textField.setText(textField.getText() + "%");


        } else if (source == buttonOpenParenthesis) {

            textField.setText(textField.getText() + "(");

        } else if (source == buttonClosedParenthesis) {

            textField.setText(textField.getText() + ")");

        } else if (source == buttonEqual) {
            //Setting functionality for equal(=) button



            String str = textField.getText();
//            String ans = Double.toString(evaluate(str));
            textField.setText(extractTrig(str));

        } else if(source == buttonSin){
            textField.setText(textField.getText() + "sin(");
        } else if(source == buttonCos){
            textField.setText(textField.getText() + "cos(");
        } else if(source == buttonTan){
            textField.setText(textField.getText() + "tan(");
        } else if(source == buttonaSin){
            textField.setText(textField.getText() + "asin(");
        } else if(source == buttonaCos){
            textField.setText(textField.getText() + "acos(");
        } else if(source == buttonaTan){
            textField.setText(textField.getText() + "atan(");
        }


    }

    public static double precedence(char op){
        if(op == '+'||op == '-')
            return 1;
        if(op == '*'||op == '/'||op=='%')
            return 2;
        return 0;
    }

    public static double applyOp(double a,double b, char op){
        return switch (op) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            case '%' -> a % b;
            default -> 0;
        };
    }

    public static double evaluate(String tokens){
        int i;
        char[] token = tokens.toCharArray();
        // stack to store integer values.
        Stack<Double> values = new Stack<>();

        // stack to store operators.
        Stack<Character> ops = new Stack<>();

        for(i = 0; i < tokens.length(); i++){

            // Current token is a whitespace,
            // skip it.
            if(token[i] == ' ') {
                continue;
            }

                // Current token is an opening
                // brace, push it to 'ops'
            else if(token[i] == '('){
                ops.push(token[i]);
            }

            // Current token is a number, push
            // it to stack for numbers.
            else if(Character.isDigit(token[i])){
                String val="";

                // There may be more than one
                // digits in number.
                while(i < tokens.length() &&
                        (Character.isDigit(token[i]) || token[i]=='.' ))
                {
                    if(Character.isDigit(token[i]))
                        val = val+String.valueOf((token[i]-'0')) ;
                    else
                        val = val+"." ;

                    i++;
                }

                values.push(Double.parseDouble(val));

                // right now the i points to
                // the character next to the digit,
                // since the for loop also increases
                // the i, we would skip one
                //  token position; we need to
                // decrease the value of i by 1 to
                // correct the offset.
                 i--;
            }

            // Closing brace encountered, solve
            // entire brace.
            else if(token[i] == ')')
            {
                while(!ops.empty() && ops.peek() != '(')
                {
                    double val2 = values.peek();
                    values.pop();

                    double val1 = values.peek();
                    values.pop();

                    char op = ops.peek();
                    ops.pop();

                    values.push(applyOp(val1, val2, op));
                }

                // pop opening brace.
                if(!ops.empty())
                    ops.pop();
            }

            // Current token is an operator.
            else
            {
                // While top of 'ops' has same or greater
                // precedence to current token, which
                // is an operator. Apply operator on top
                // of 'ops' to top two elements in values stack.
                while(!ops.empty() && precedence(ops.peek())
                        >= precedence(token[i])){
                    double val2 = values.peek();
                    values.pop();

                    double val1 = values.peek();
                    values.pop();

                    char op = ops.peek();
                    ops.pop();

                    values.push(applyOp(val1, val2, op));
                }

                // Push current token to 'ops'.
                ops.push(token[i]);
            }
        }

        // Entire expression has been parsed at this
        // point, apply remaining ops to remaining
        // values.
        while(!ops.empty()){
            double val2 = values.peek();
            values.pop();

            double val1 = values.peek();
            values.pop();

            char op = ops.peek();
            ops.pop();

            values.push(applyOp(val1, val2, op));
        }

        // Top of 'values' contains result, return it.
        return values.peek();
    }

    public static String extractTrig(String s){
        char[] str = s.toCharArray();
        //Extract sin
        Stack<Character> stack = new Stack<>();

        int n = s.length();
        boolean flag = true;
        String extracted = "";
        int index = -1,start = -1;
        for(int i=0;i<n;i++){
            if(str[i]=='n'){
                index = i+1;
                start = index;
                stack.push(str[index]);
                while(!stack.empty()){
                    index++;
                    if(str[index]==')') stack.pop();
                    if(str[index]=='(') stack.push('(');
                }

                extracted = s.substring(start+1,index);
                s = s.replace(extracted,"");

                //System.out.println(s);
                System.out.println(extracted);
                flag = false;
                break;
            }
        }//5+sin(0.5+0.01*sin(0.5))

        if(flag){
            return Double.toString(evaluate(s));
        }else{
            String nvalue = extractTrig(extracted);
            System.out.println("nvalue = " + nvalue);
            double v = Double.parseDouble(nvalue);
            double value = Math.sin(v);
            s = s.replace("sin()",Double.toString(value));
        }


        s=s.replace("+-","-");
        return extractTrig(s);

    }

}
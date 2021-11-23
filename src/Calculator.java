import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.util.Stack;


public class Calculator implements ActionListener {

    /** Constants required for GUI*/
    final int fontSize = 20;
    final Font font = new Font("SFUIDisplay-Regular", Font.PLAIN, fontSize);
    final Font font2 = new Font("SFUIDisplay-Regular", Font.PLAIN, 20);
    final Color color = new Color(191, 245, 239);
    final Color color2 = new Color(142, 236, 216);

    /** Creating the main window for the calculator */
    JFrame frame;

    /** Display of the calculator */
    JTextField textField = new JTextField();

    /** Buttons needed for the calculator */
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
    JButton buttonClear = new JButton("AC");
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


    /**
     * Builds the main frame for the calculator
     */
    public void prepareGUI() {
        frame = new JFrame();

        Image icon = Toolkit.getDefaultToolkit().getImage("icon.png");
        frame.setIconImage(icon);

        frame.setTitle("Calculator");                           //Setting title of the JFrame
        frame.setSize(380, 675);                    //Setting size
        frame.getContentPane().setLayout(null);                 //Setting Layout
        frame.getContentPane().setBackground(color);            //Setting Background Color
        frame.setResizable(false);                              //Preventing window from resizing
        frame.setLocationRelativeTo(null);                      //Setting location to the center of the screen
        frame.setVisible(true);                                 //Setting window's visibility
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //Setting default close operation
    }


    /**
     * Builds the button and the display in the GUI.
     */
    public void addComponents() {

        textField.setBounds(0, 0, 370, 160);
        textField.setFont(font2);
        textField.setBackground(color2);
        textField.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
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

    /**
     * Registers a button press.
     */
    public void addActionEvents() {

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
        buttonPlus.addActionListener(this);
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

    /**
     * @param e Action activated by pressing the button.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == buttonClear) {
            textField.setText("");
        } else if (source == buttonDelete) {
            int length = textField.getText().length();
            int number = length - 1;

            if (number > 0) {
                StringBuilder back = new StringBuilder(textField.getText());
                back.deleteCharAt(number);
                textField.setText(back.toString());

            } else {
                textField.setText("");
            }
        } else if (source == buttonZero) {
            textField.setText(textField.getText() + "0");
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
            String str = textField.getText();

            try {
                String ans = evaluateTrigFunction(str);
                textField.setText(ans);

            } catch (Exception exception) {
                textField.setText("Error");
                exception.printStackTrace();
            }

        } else if (source == buttonSin) {
            textField.setText(textField.getText() + "sin(");
        } else if (source == buttonCos) {
            textField.setText(textField.getText() + "cos(");
        } else if (source == buttonTan) {
            textField.setText(textField.getText() + "tan(");
        } else if (source == buttonaSin) {
            textField.setText(textField.getText() + "asin(");
        } else if (source == buttonaCos) {
            textField.setText(textField.getText() + "acos(");
        } else if (source == buttonaTan) {
            textField.setText(textField.getText() + "atan(");
        }

    }

    /**
     * @param op operator
     * @return value according to the precedence (higher the precedence higher the value)
     */
    public static int precedence(char op) {
        if (op == '+' || op == '-')
            return 1;
        if (op == '*' || op == '/' || op == '%')
            return 2;
        return 0;
    }

    /**
     * @param a left value
     * @param b right value
     * @param op operator
     * @return performs the given operation according to the operator
     */
    public static double applyOp(double a, double b, char op) throws Exception {
        return switch (op) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            case '%' -> a % b;
            default -> throw new Exception("Error!");
        };
    }

    /**
     * Constructs the expression so that negative numbers and multiple operators can be handled.
     * Example : -0.6 + 36 is not works in evaluation since '-' is treated as an operator. Thus the expression
     * is converted to (0-0.6)+36.
     * @param expression expression that need to be processed
     * @return constructed expression.
     */
    public static char[] plusMinus(String expression) {
        expression = expression.replace("++", "+");
        expression = expression.replace("+-", "-");
        expression = expression.replace("-+", "-");
        expression = expression.replace("--", "+");

        int end = -1;

        StringBuilder str = new StringBuilder(expression);
        if (expression.charAt(0) == '+') {
            str.deleteCharAt(0);
        } else if (expression.charAt(0) == '-') {

            for (int i = 1; i < expression.length(); i++) {
                if (!Character.isDigit(expression.charAt(i)) && expression.charAt(i) != 'c' && expression.charAt(i) != 'o' && expression.charAt(i) != 's' && expression.charAt(i) != 'i' && expression.charAt(i) != 'n' && expression.charAt(i) != 'a' && expression.charAt(i) != 't'
                ) {
                    if (expression.charAt(i) != '.') {
                        end = i;

                        break;
                    }
                }
                if (i == expression.length() - 1) end = expression.length();

            }
            str.insert(end, ')');
            str.insert(0, '(');
            str.insert(1, '0');

        }

        boolean flag = true;
        while (flag && str.length() > 1) {
            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) == '-' && !Character.isDigit(str.charAt(i - 1)) && str.charAt(i - 1) != ')') {
                    str.insert(i, '(');
                    str.insert(i + 1, '0');

                    for (int j = i + 3; j < str.length(); j++) {
                        if (!Character.isDigit(str.charAt(j)) || j == str.length() - 1) {
                            if (str.charAt(j) != '.') {
                                end = j;
                                if (j == str.length() - 1) end++;
                                break;
                            }
                        }

                    }
                    str.insert(end, ')');
                    break;
                }
                if (i == str.length() - 1) {
                    flag = false;
                }
            }
        }

        return str.toString().toCharArray();
    }

    /**
     * Evaluates the expressions that does not contain any trigonometry functions.
     * @param expression expression that needs to be evaluated.
     * @return result of the expression after calculation.
     */
    public static double evaluate(String expression) throws Exception {
        int i;

        char[] expressionArr = plusMinus(expression);

        Stack<Double> values = new Stack<>();

        Stack<Character> ops = new Stack<>();
        ops.push('(');

        for (i = 0; i < expressionArr.length; i++) {

            if (expressionArr[i] == '(') {
                ops.push(expressionArr[i]);
            } else if (Character.isDigit(expressionArr[i])) {
                StringBuilder val = new StringBuilder();

                while (i < expressionArr.length && (Character.isDigit(expressionArr[i]) || expressionArr[i] == '.')) {
                    if (Character.isDigit(expressionArr[i]))
                        val.append((expressionArr[i] - '0'));
                    else {
                        val.append(".");
                    }

                    i++;
                }
                values.push(Double.parseDouble(val.toString()));
                i--;
            } else if (expressionArr[i] == ')') {
                while (!ops.empty() && ops.peek() != '(') {
                    double val2 = values.peek();
                    values.pop();

                    double val1 = values.peek();
                    values.pop();

                    char op = ops.peek();
                    ops.pop();

                    values.push(applyOp(val1, val2, op));
                }

                if (!ops.empty())
                    ops.pop();
            } else {
                while (!ops.empty() && precedence(ops.peek()) >= precedence(expressionArr[i])) {
                    double val2 = values.peek();
                    values.pop();

                    double val1 = values.peek();
                    values.pop();

                    char op = ops.peek();
                    ops.pop();

                    values.push(applyOp(val1, val2, op));
                }

                ops.push(expressionArr[i]);
            }
        }

        while (ops.size()>0 && values.size()>1) {
            double val2 = values.peek();
            values.pop();

            double val1 = values.peek();
            values.pop();

            char op = ops.peek();
            ops.pop();

            values.push(applyOp(val1, val2, op));
        }

        if(values.size() != 1 && ops.size()!=1){
            throw new Exception("Error!");
        }

        return values.peek();
    }

    /**
     * @param expression expression needs to be processed
     * @return  result of the expression
     * @throws Exception If the expression syntax wrong
     */
    public static String evaluateTrigFunction(String expression) throws Exception {
        char[] expressionArr = expression.toCharArray();

        Stack<Character> stack = new Stack<>();

        int n = expression.length();
        boolean noTrigContains = true;

        String trigF = "";
        String expressionInsideTrigFunction = "";

        int index = -1, start = -1;
        for (int i = 0; i < n; i++) {

            if(i!=0 && Character.isAlphabetic(expressionArr[i])){
                if(Character.isDigit(expressionArr[i-1])){
                    throw new Exception("Error!");
                }
            }

            if (expressionArr[i] == 'a' && expressionArr[i + 1] == 'n') {
                trigF = "tan";
                index = i + 2;
                start = i + 2;
                noTrigContains = false;
            } else if (expressionArr[i] == 'a') {
                if (expressionArr[i + 1] == 's') {
                    trigF = "asin";
                } else if (expressionArr[i + 1] == 'c') {
                    trigF = "acos";
                } else {
                    trigF = "atan";
                }

                index = i + 4;
                start = i + 4;
                noTrigContains = false;
            } else if (expressionArr[i] == 'i' && expressionArr[i + 1] == 'n') {
                trigF = "sin";
                index = i + 2;
                start = i + 2;
                noTrigContains = false;
            } else if (expressionArr[i] == 'o' && expressionArr[i + 1] == 's') {
                trigF = "cos";
                index = i + 2;
                start = i + 2;
                noTrigContains = false;
            }

            if (!noTrigContains) {
                stack.push(expressionArr[index]);
                while (!stack.empty()) {
                    index++;
                    if (expressionArr[index] == ')') stack.pop();
                    if (expressionArr[index] == '(') stack.push('(');

                }

                expressionInsideTrigFunction = expression.substring(start + 1, index);
                expression = expression.replace(trigF + "(" + expressionInsideTrigFunction + ")", trigF + "()");
                break;
            }
        }

        if (noTrigContains) {
            return Double.toString(evaluate(expression));
        } else {
            double v = Double.parseDouble(evaluateTrigFunction(expressionInsideTrigFunction));
            double value = 0;
            switch (trigF) {
                case "sin" -> value = Math.sin(Math.toRadians(v));
                case "cos" -> value = Math.cos(Math.toRadians(v));
                case "tan" -> value = Math.tan(Math.toRadians(v));
                case "atan" -> value = Math.toDegrees(Math.atan(v));
                case "acos" -> value = Math.toDegrees(Math.acos(v));
                case "asin" -> value = Math.toDegrees(Math.asin(v));
                default -> System.out.println("invalid Trig Function");
            }
            String vstr = new BigDecimal(value).toPlainString();
            expression = expression.replace(trigF + "()", vstr);
        }

        expression = expression.replace("+-", "-");
        return evaluateTrigFunction(expression);

    }

}
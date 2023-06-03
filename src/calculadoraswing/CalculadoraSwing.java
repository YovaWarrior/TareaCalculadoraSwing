package calculadoraswing;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;


public class CalculadoraSwing extends JFrame {
    private JButton sumaButton;
    private JButton restaButton;
    private JButton multiplicacionButton;
    private JButton divisionButton;
    private JButton raizButton;
    private JButton primoButton;
    private JButton factorialButton;
    private JButton senoButton;
    private JButton cosenoButton;
    private JButton tangenteButton;
    private JButton secanteButton;
    private JButton cosecanteButton;
    private JButton salirButton;

    private JLabel resultadoLabel;

    public CalculadoraSwing() {
        // Configurar la ventana
        setTitle("Calculadora Arcoiris");
        setSize(850, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 3));
        
        

        // Crear los componentes
        sumaButton = new JButton("Sumar");
        restaButton = new JButton("Restar");
        multiplicacionButton = new JButton("Multiplicar");
        divisionButton = new JButton("Dividir");
        raizButton = new JButton("Raiz Cuadrada");
        primoButton = new JButton("Verificar Primo");
        factorialButton = new JButton("Factorial");
        senoButton = new JButton("Seno");
        cosenoButton = new JButton("Coseno");
        tangenteButton = new JButton("Tangente");
        secanteButton = new JButton("Secante");
        cosecanteButton = new JButton("Cosecante");
        salirButton = new JButton("Salir");

        resultadoLabel = new JLabel();

        // Agregar los componentes a la ventana
        add(sumaButton);
        add(restaButton);
        add(multiplicacionButton);
        add(divisionButton);
        add(raizButton);
        add(primoButton);
        add(factorialButton);
        add(senoButton);
        add(cosenoButton);
        add(tangenteButton);
        add(secanteButton);
        add(cosecanteButton);
        add(salirButton);
        add(resultadoLabel);
        
        // Cambiar los colores de los botones
        Color botonColor = new Color(52, 152, 219);  // Azul claro
        sumaButton.setBackground(botonColor);
        restaButton.setBackground(Color.WHITE);
        multiplicacionButton.setBackground(Color.RED);
        divisionButton.setBackground(Color.gray);
        raizButton.setBackground(Color.LIGHT_GRAY);
        primoButton.setBackground(Color.ORANGE);
        factorialButton.setBackground(Color.GREEN);
        senoButton.setBackground(Color.MAGENTA);
        cosenoButton.setBackground(Color.blue);
        tangenteButton.setBackground(Color.PINK);
        secanteButton.setBackground(Color.CYAN);
        cosecanteButton.setBackground(Color.YELLOW);
        salirButton.setBackground(Color.RED);

        // Cambiar el color de fondo de la ventana
        getContentPane().setBackground(Color.PINK);
        
        Scanner sn = new Scanner(System.in);
        CalculadoraEspecial calculadora2 = new CalculadoraEspecial("Carlos Martínez");
        calculadora2.mostrarDatos();
        

        // Agregar ActionListeners a los botones
        sumaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int resultado = (int) calculadora2.sumar(10, 5);
                resultadoLabel.setText("El resultado de la suma es: " + resultado);
            }
        });

        restaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int resultado = (int) calculadora2.restar(10, 5);
                resultadoLabel.setText("El resultado de la resta es: " + resultado);
            }
        });

        multiplicacionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int resultado = (int) calculadora2.multiplicar(10, 5);
                resultadoLabel.setText("El resultado de la multiplicación es: " + resultado);
            }
        });

        divisionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int resultado = (int) calculadora2.dividir(10, 5);
                resultadoLabel.setText("El resultado de la división es: " + resultado);
            }
        });

        raizButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double resultado = calculadora2.raizCuadrada(16);
                resultadoLabel.setText("El resultado de la raíz cuadrada es: " + resultado);
            }
        });

        primoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boolean esPrimo = calculadora2.esPrimo(11);
                resultadoLabel.setText("¿Es primo? " + esPrimo);
            }
        });

        factorialButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int resultado = calculadora2.Factorial(4);
                resultadoLabel.setText("El resultado del factorial es: " + resultado);
            }
        });

        senoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double resultado = calculadora2.seno(30);
                resultadoLabel.setText("El resultado del cálculo de seno es: " + resultado);
            }
        });

        cosenoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double resultado = calculadora2.coseno(65);
                resultadoLabel.setText("El resultado del cálculo de coseno es: " + resultado);
            }
        });

        tangenteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double resultado = calculadora2.tangente(90);
                resultadoLabel.setText("El resultado del cálculo de tangente es: " + resultado);
            }
        });

        secanteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double resultado = calculadora2.secante(45);
                resultadoLabel.setText("El resultado del cálculo de secante es: " + resultado);
            }
        });

        cosecanteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double resultado = calculadora2.cosecante(128);
                resultadoLabel.setText("El resultado del cálculo de cosecante es: " + resultado);
            }
        });

        salirButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                CalculadoraSwing programa = new CalculadoraSwing();
                programa.setVisible(true);
            }
        });
    }
}
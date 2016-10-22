package util; // Altere para o nome da package em que for colocar a JPrompt.

import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * Classe para leitura e escrita de dados pelo teclado via prompt e JOptionPane.
 *
 * @author Professor Moisés Henrique Ramos Pereira
 * @version 2016.2
 */
@SuppressWarnings("serial")
public class JPrompt extends JOptionPane {
    
    // Declaração dos atributos.
    private static final String ERROR_DATA = "Nenhum dado informado!";
    private static final String ERROR_REAL = "Nenhum número real informado!";
    private static final String ERROR_INTR = "Nenhum número inteiro informado!";
    
    // Declaração dos métodos.
    
    /************************************************************************
     * Métodos para escrita no prompt, terminal ou janelas popup.           *
     ************************************************************************/
    
    /**
     * @param mensagem
     */
    public static void print(String mensagem) {
        System.out.print(mensagem);
    }
    
    /**
     * @param mensagem
     */
    public static void printLine(String mensagem) {
        System.out.println(mensagem);
    }
    
    /**
     * @param titulo
     * @param mensagem
     * @param icone
     */
    public static void printPane(String titulo, Object mensagem, String icone) {
        JOptionPane.showMessageDialog(null, mensagem.toString(), titulo, new Simbolo().get(icone));
    }

    /**
     * @param titulo
     * @param mensagem
     */
    public static void printPane(String titulo, Object mensagem) {
        printPane(titulo, mensagem, "i");
    }
    
    /**
     * @param mensagem
     */
    public static void printPane(Object mensagem) {
        printPane("Informação", mensagem, "i");
    }
    
    /**
     * @param titulo
     * @param mensagem
     * @return Valor booleano referente a opçao escolhida.
     */
    public static Boolean printConf(String titulo, String mensagem) {
        Integer option = showConfirmDialog(null, mensagem, titulo, YES_NO_OPTION);
        return option == YES_OPTION;
    }
    
    /************************************************************************
     * Métodos para leitura a partir do teclado via Scanner ou JOptionPane. *
     ************************************************************************/
    
    /**
     * @param mensagem
     * @return 
     */
    @SuppressWarnings("resource")
	public static Integer readInt(String mensagem) {
        String entrada;
        Boolean existeErro;
        Integer numeroInt = 0;

        do {
            existeErro = false;
            try {
                System.out.print(mensagem);
                entrada = new Scanner(System.in).nextLine().trim();
                numeroInt = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                printLine(ERROR_INTR);
                existeErro = true;
            }
        } while (existeErro);
        return numeroInt;
    }
    
    /**
     * @param mensagem
     * @return Integer
     */
    public static Integer readIntPane(String mensagem) {
        return readIntPane(null, mensagem, "?");
    }
    
    /**
     * @param titulo
     * @param mensagem
     * @param icone
     * @return 
     */
    public static Integer readIntPane(String titulo, String mensagem, String icone) {
        String entrada;
        Boolean existeErro;
        Integer numeroInt = 0;

        do {
            existeErro = false;
            try {
                entrada = showInputDialog(null, mensagem, titulo, new Simbolo().get(icone));
                if (entrada == null) {
                    break;
                }
                numeroInt = Integer.parseInt(entrada.trim());
            } catch (NumberFormatException e) {
                printPane("ERRO", ERROR_INTR, "x");
                existeErro = true;
            }
        } while (existeErro);
        return numeroInt;
    }
    
    /**
     * @param mensagem
     * @return Float
     */
    @SuppressWarnings("resource")
	public static Float readFloat(String mensagem) {
        String entrada;
        Boolean existeErro;
        Float numeroFloat = 0f;

        do {
            existeErro = false;
            try {
                print(mensagem);
                entrada = new Scanner(System.in).nextLine().trim();
                numeroFloat = Float.parseFloat(entrada);
            } catch (NumberFormatException e) {
                printLine(ERROR_REAL);
                existeErro = true;
            }
        } while (existeErro);
        return numeroFloat;
    }
    
    /**
     * @param mensagem
     * @return Float
     */
    public static Float readFloatPane(String mensagem) {
        return readFloatPane(null, mensagem, "?");
    }
    
    /**
     * @param titulo
     * @param mensagem
     * @param icone
     * @return Float
     */
    public static Float readFloatPane(String titulo, String mensagem, String icone) {
        String entrada;
        Boolean existeErro;
        Float numeroFloat = 0.0f;

        do {
            existeErro = false;
            try {
                entrada = showInputDialog(null, mensagem, titulo, new Simbolo().get(icone));
                if (entrada == null) {
                    break;
                }
                numeroFloat = Float.parseFloat(entrada.trim());
            } catch (NumberFormatException e) {
                printPane("ERRO", ERROR_REAL, "x");
                existeErro = true;
            }
        } while (existeErro);
        return numeroFloat;
    }
    
    /**
     * @param mensagem
     * @return Double
     */
    @SuppressWarnings("resource")
	public static Double readDouble(String mensagem) {
        String entrada;
        Boolean existeErro;
        Double numeroDouble = 0.0;

        do {
            existeErro = false;
            try {
                print(mensagem);
                entrada = new Scanner(System.in).nextLine().trim();
                numeroDouble = Double.parseDouble(entrada);
            } catch (NumberFormatException e) {
                printLine(ERROR_REAL);
                existeErro = true;
            }
        } while (existeErro);
        return numeroDouble;
    }
    
    /**
     * @param mensagem
     * @return Double
     */
    public static Double readDoublePane(String mensagem) {
        return readDoublePane(null, mensagem, "?");
    }
    
    /**
     * @param titulo
     * @param mensagem
     * @param icone
     * @return Double
     */
    public static Double readDoublePane(String titulo, String mensagem, String icone) {
        String entrada;
        Boolean existeErro;
        Double numeroDouble = 0.0;

        do {
            existeErro = false;
            try {
                entrada = showInputDialog(null, mensagem, titulo, new Simbolo().get(icone));
                if (entrada == null) {
                    break;
                }
                numeroDouble = Double.parseDouble(entrada.trim());
            } catch (NumberFormatException e) {
                printPane("ERRO", ERROR_REAL, "x");
                existeErro = true;
            } catch (NullPointerException e) {
                showMessageDialog(null, ERROR_DATA, "ERRO", ERROR_MESSAGE);
                existeErro = true;
            }
        } while (existeErro);
        return numeroDouble;
    }
    
    @SuppressWarnings("resource")
	public static String readString(String mensagem) {
        print(mensagem);
        return new Scanner(System.in).nextLine().trim();
    }
    
    /**
     * @param mensagem
     * @return String
     */
    public static String readStringPane(String mensagem) {
        return readStringPane(null, mensagem, "?");
    }
    
    /**
     * @param titulo
     * @param mensagem
     * @param icone
     * @return String
     */
    public static String readStringPane(String titulo, String mensagem, String icone) {
        String entrada = new String();
        Boolean existeErro;

        do {
            existeErro = false;
            try {
                entrada = showInputDialog(null, mensagem, titulo, new Simbolo().get(icone));
            } catch (NullPointerException e) {
                printPane("ERRO", ERROR_DATA, "x");
                existeErro = true;
            }
        } while (existeErro);
        return entrada;
    }
    
    /**
     * @param mensagem
     * @return Character
     */
    public static Character readCharPane(String mensagem) {
        return readCharPane(null, mensagem, "?");
    }
    
    /**
     * @param titulo
     * @param mensagem
     * @param icone
     * @return Character
     */
    public static Character readCharPane(String titulo, String mensagem, String icone) {
        Character caractere = ' ';
        Boolean existeErro;

        do {
            existeErro = false;
            try {
                String entrada = showInputDialog(null, mensagem, titulo, new Simbolo().get(icone));
                if (entrada == null) {
                    break;
                }
                caractere = entrada.trim().charAt(0);
            } catch (StringIndexOutOfBoundsException e) {
                printPane("ERRO", ERROR_DATA, "x");
                existeErro = true;
            }
        } while (existeErro);
        return caractere;
    }
    
    // Declaração de classe interna.
    private static class Simbolo {
        
        public HashMap<String,Integer> tabela = new HashMap<>();
        
        public Simbolo() {
            tabela.put("x", ERROR_MESSAGE); 
            tabela.put("i", INFORMATION_MESSAGE); 
            tabela.put("?", QUESTION_MESSAGE);
            tabela.put("!", WARNING_MESSAGE);
            tabela.put("", PLAIN_MESSAGE);
            tabela.put(null, PLAIN_MESSAGE);
        }
        
        public Integer get(String tipo) {
            return tabela.get(tipo);
        }
    }
}

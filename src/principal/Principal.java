package principal;

import javax.swing.JOptionPane;
import model.Relogio;

public class Principal {

    public static void main(String[] args) {
        Relogio casio = new Relogio(23, 1, 1);

        int opcao = -1;
        while (opcao != 99) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                       Menu de op\u00e7\u00f5es:
                                                                       1 - Setar Tempo
                                                                       2 - Mostrar Tempo:
                                                                       3 - Tempo em segundos
                                                                       4 - Incrementar Hora
                                                                       5 - Incrementar Minuto
                                                                       6 - Incrementar Segundo
                                                                       7 - Decrementar Hora
                                                                       8 - Decrementar Minuto
                                                                       9 - Decrementar Segundo
                                                                       99 - Sair"""));
            if (opcao == 1) {
                int Hora, Minuto, Segundo;
                Hora = (Integer.parseInt(JOptionPane.showInputDialog(null, "Digite as horas:")));
                Minuto = (Integer.parseInt(JOptionPane.showInputDialog(null, "Digite os minutos:")));
                Segundo = (Integer.parseInt(JOptionPane.showInputDialog(null, "Digite os segundos:")));
                casio.setHora(Hora);
                casio.setMinuto(Minuto);
                casio.setSegundo(Segundo);
            } else {
                if (opcao == 2) {
                    System.out.println("O tempo é " + casio.getHorasString());

                } else {
                    if (opcao == 3) {
                        System.out.println("O tempo em segundos é: " + casio.getSegundos());
                    } else {
                        if (opcao == 4) {
                            casio.incrementarHora();
                            System.out.println("O tempo atual agora é: " + casio.getHorasString());
                        } else {
                            if (opcao == 5) {
                                casio.incrementarMinuto();
                                System.out.println("O tempo atual agora é: " + casio.getHorasString());

                            } else {
                                if (opcao == 6) {
                                    casio.incrementarSegundo();
                                    System.out.println("O tempo atual agora é: " + casio.getHorasString());
                                } else {
                                    if (opcao == 7) {
                                        casio.decrementarHora();
                                        System.out.println("O tempo atual agora é: " + casio.getHorasString());
                                    } else {
                                        if (opcao == 8) {
                                            casio.decrementarMinuto();
                                            System.out.println("O tempo atual agora é: " + casio.getHorasString());
                                        } else {
                                            if (opcao == 9) {
                                                casio.decrementarSegundo();
                                                System.out.println("O tempo atual agora é: " + casio.getHorasString());
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }

}

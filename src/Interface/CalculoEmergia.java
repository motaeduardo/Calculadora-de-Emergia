/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Interface;
import javax.swing.JTextField;
import java.util.List;  

public class CalculoEmergia {

    public static double calcularTotalEmergia(JTextField[] camposQuantidade, List<Insumo> insumos) {
        double totalEmergia = 0.0;

        for (int i = 0; i < 8; i++) {
            try {
                String texto = camposQuantidade[i].getText().trim();

                if (!texto.isEmpty()) {
                    double quantidade = Double.parseDouble(texto);
                    double coeficienteEmergetico = insumos.get(i).getCoeficienteEmergetico();
                    totalEmergia += quantidade * coeficienteEmergetico;
                }

            } catch (NumberFormatException | IndexOutOfBoundsException e) {
                System.out.println("Erro ao processar insumo na posição " + i + ": " + e.getMessage());
            }
        }

        return totalEmergia;
    }

    public static double calcularEmergiaPorKg(double totalEmergia, double producaoKg) {
        if (producaoKg == 0) {
            throw new ArithmeticException("Produção em kg não pode ser zero.");
        }
        return totalEmergia / producaoKg;
    }
}

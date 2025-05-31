/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

public class Insumo {
    private final String nome;
    private final double CoeficienteEmergetico;

    public Insumo(String nome, double CoeficienteEmergetico) {
        this.nome = nome;
        this.CoeficienteEmergetico = CoeficienteEmergetico;
    }

    public double getCoeficienteEmergetico() {
        return CoeficienteEmergetico;
    }

    public String getNome() {
        return nome;
    }
}

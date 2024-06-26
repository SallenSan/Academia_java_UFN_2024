package entidade;

public class Paciente {
    private double altura;
    private double peso;
    private String nome;

    public Paciente(double altura, double peso) {
        this.altura = altura;
        this.peso = peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double calcularIMC(){
        return peso / (altura * altura);
    }

    public String diagnostico(){
        double imc = calcularIMC();
        if (imc < 16) {
            return "Baixo peso muito grave = IMC abaixo de 16 kg/m²";
        } else if (imc < 17) {
            return "Baixo peso grave = IMC entre 16 e 16,99 kg/m²";
        } else if (imc < 18.5) {
            return "Baixo peso = IMC entre 17 e 18,49 kg/m²";
        } else if (imc < 25) {
            return "Peso normal = IMC entre 18,50 e 24,99 kg/m²";
        } else if (imc < 30) {
            return "Sobrepeso = IMC entre 25 e 29,99 kg/m²";
        } else if (imc < 35) {
            return "Obesidade grau I = IMC entre 30 e 34,99 kg/m²";
        } else if (imc < 40) {
            return "Obesidade grau II = IMC entre 35 e 39,99 kg/m²";
        } else {
            return "Obesidade grau III (obesidade mórbida) = IMC igual ou maior que 40 kg/m²";
        }
    }

    @Override
    public String toString() {
        return String.format("O diagnóstico do pac. %s é %s", nome, diagnostico());
    }
    }




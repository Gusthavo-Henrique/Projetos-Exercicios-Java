public class Calculadora {
    //atributos
    private double valor1;
    private double valor2;
    
    //metodo construtor
    public Calculadora(double valor1, double valor2) {
        this.valor1 = 0;
        this.valor2 = 0;
    }
    //metodos get/set
    public double getValor1() {
        return valor1;
    }
    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }
    public double getValor2() {
        return valor2;
    }
    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    //metodos de calculo
    public void Soma() {
        double soma =  (this.valor1) + (this.valor2);
        System.out.println("A soma de "+getValor1() + " e " +getValor2() +" é: " +soma);
    }

    public void Subtracao() {
        double subtracao =  (this.valor1) - (this.valor2);
        System.out.println("A subtração de "+getValor1() + " e " +getValor2() +" é: " +subtracao);
    }
    public void Multiplicacao() {
        double multiplicacao =  (this.valor1) * (this.valor2);
        System.out.println("A multiplicação de "+getValor1() + " e " +getValor2() +" é: " +multiplicacao);
    }
    public void Divisao() {
        double divisao =  (this.valor1) / (this.valor2);
        System.out.println("A divisão de "+getValor1() + " e " +getValor2() +" é: " +divisao);
    }


}

import Model.ComplexNumber1;
import Model.ComplexNumberM;

public class main2 {
    public static void main(String[] args) {
        ComplexNumberM.ComplexNumber start = new ComplexNumberM.ComplexNumber();
        ComplexNumberM.ComplexNumber first_pair = new ComplexNumberM.ComplexNumber(2,3);
        ComplexNumberM.ComplexNumber second_pair = new ComplexNumberM.ComplexNumber(6,8);
        ComplexNumberM.ComplexNumber summa = ComplexNumberM.ComplexNumber.add(first_pair, second_pair);
        ComplexNumberM.ComplexNumber rasnost = ComplexNumberM.ComplexNumber.substract(first_pair, second_pair);

        System.out.println(first_pair.toString()+" + "+second_pair.toString()+" = "+ summa.toString());
        System.out.println(first_pair.toString()+ " - " +second_pair.toString()+" = " +rasnost.toString());
    }
}

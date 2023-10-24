package Model;

public class rasnostCalculation extends ComplexNumber1{


    public void substract (ComplexNumber1 z){
        set(substract(this, z));
    }


    public void set(ComplexNumber1 z)
    {
        this.real = z.real;
        this.mnimaya = z.mnimaya;
    }


    public static ComplexNumber1 substract(ComplexNumber1 z1, ComplexNumber1 z2)
    {
        return new ComplexNumber1(z1.real - z2.real, z1.mnimaya - z2.mnimaya);
    }

}

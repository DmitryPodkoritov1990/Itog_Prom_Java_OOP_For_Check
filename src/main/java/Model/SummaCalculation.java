package Model;

public class SummaCalculation extends ComplexNumber1{

    public void add(ComplexNumber1 z){
        set(add(this, z));
    }

    public void set(ComplexNumber1 z)
    {
        this.real = z.real;
        this.mnimaya = z.mnimaya;
    }

    public static ComplexNumber1 add(ComplexNumber1 z1, ComplexNumber1 z2)
    {
        return new ComplexNumber1(z1.real + z2.real, z1.mnimaya + z2.mnimaya);
    }

}

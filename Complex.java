
//Page Number 51
class Complex
{
	int real;
	double imag;

Complex(){
	real=10;
	imag=2.1;
}

Complex (int i,double l)
{
	real=i;
	imag=l;
}
void sum(Complex c1)
{
	real = real+c1.real;
	imag = imag+c1.imag;
	System.out.println("The addition of two complex number:"+real+"+"+imag+"i");
}
    public static void main(String[] args)
    {
    	Complex c1= new Complex();
    	Complex c2= new Complex(10,2.1);
    	c2.sum(c1);
    }

}
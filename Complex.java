import java.util.Scanner;
class Complex {

                double real, imag;
                Complex() {
                        real = 0;
                        imag = 0;
                }

                Complex(double x, double y){
                        real = x;
                        imag = y;
                }

                void display() {
                        System.out.println(real+" + "+"("+imag+")"+"i");
                }

                Complex conjugate(){
                        Complex conj = new Complex(real,-imag);
                        return conj;
                }

                double arg(){
                        double angle = Math.sqrt(real*real + imag*imag);
                        return Math.toRadians(angle);
                }

                static Complex add(Complex c1, Complex c2){
                        Complex sum = new Complex();
                        sum.real = c1.real + c2.real;
                        sum.imag = c1.imag + c2.imag;
                        return sum;
                }


                public static void main(String[] args){
                        int uptoPlus1=0,uptoPlus2=0;
                        double r1,i1,r2,i2;
                        String s1, s2;
                        Scanner input = new Scanner(System.in);

                        System.out.println("Enter the first complex number in the form (a+bi)");
                        s1 = input.nextLine();
                        
                        System.out.println("Enter the second complex number in the form (a+bi)");
                        s2 = input.nextLine();
                        s1.trim();
                        s2.trim();
                        s1 = s1.replace("\n","");
                        s2 = s2.replace("\n","");
                        while(s1.charAt(uptoPlus1)!='+'){
                            uptoPlus1++;
                        }
                        while(s2.charAt(uptoPlus2)!='+'){
                            uptoPlus2++;
                        }
                        String real1 = s1.substring(0,uptoPlus1);
                        String real2 = s2.substring(0,uptoPlus2);
                        System.out.println("String upto plus sign = "+real1);
                        System.out.println("String upto plus sign = "+real2);
                        String imag1 = s1.substring(uptoPlus1+1,s1.length()-1);
                        String imag2 = s2.substring(uptoPlus2+1,s2.length()-1);
                        System.out.println("String after plus sign = "+imag1);
                        System.out.println("String after plus sign = "+imag2);
                        r1 = Double.parseDouble(real1);
                        i1 = Double.parseDouble(imag1);
                        r2 = Double.parseDouble(real2);
                        i2 = Double.parseDouble(imag2);
                        System.out.println("The sum of the 2 given complex numbers is");
                        Complex C1 = new Complex(r1,i1);
                        Complex C2 = new Complex(r2,i2);
                        Complex sum = add(C1,C2);
                        sum.display();
                }

}

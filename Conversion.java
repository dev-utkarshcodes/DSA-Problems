class Conversion
{
    public static void main(String []args)
    {
        int n1=Integer.parseInt("101101",2);//convert binary to decimal
        int n2=Integer.parseInt("55",8);// convert octal to decimal
        int n3=Integer.parseInt("D",16);//convert hexadecimal to decimal(integer)
        System.out.println(n2);
        System.out.println(n1);
        System.out.println(n3);
    }

}
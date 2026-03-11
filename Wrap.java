class Wrap
{ //Wraper class is used to make the java fully object oriented Proramming.
    public static void main(String []x)
    {
        // System.out.println(x[0]);
        // System.out.println(x[1]);
        int s=0;
        for(int i=0;i<x.length;i++)
        {
            s = s + Integer.parseInt(x[i]);
        }
        System.out.println("Sum = "+s);
        System.out.println("Average = "+s/x.length);
    }
}
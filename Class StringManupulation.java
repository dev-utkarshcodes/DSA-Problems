class StringManupulation
{
    public static void main (String []args)
    {
        String A="hello";
        String B = "world";

        // int z=A.length()+B.length();
        System.out.println(A.length()+B.length()); //Prints the size of the string
        // check the word A is lexicografically/Alphabatically comes first or not.
        int z=A.compareTo(B);
        if(z==0)
        {
            System.err.println("yes");
        }
        else
        {
            System.out.println("No");
        }
        // Capitalize the First Latter Of word.
        String Acap=A.substring(0, 1).toUpperCase() + A.substring(1);
        String Bcap=B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(Acap+" "+Bcap);
    }
}
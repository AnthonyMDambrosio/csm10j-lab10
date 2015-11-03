/*********************************
Programmer : Anthony D'Ambrosio 
Date       : 11/2/2015
Title      : csm10j-lab10
*********************************/

package unchecked;

public class UncheckedExceptions
{
    public static void ThrowIndexOutOfBounds()
    {
        int someArray[] = new int[ 10 ];
        System.out.println( someArray[ 10 ] );
    }
    
    public static void CatchIndexOutOfBounds()
    {
        try
        {
            int someArray[] = new int[ 10 ];
            System.out.println( someArray[ 10 ] );
        }
        catch (ArrayIndexOutOfBoundsException AioobeRef)
        {
            System.out.println("Caught ArrayIndexOutOfBounds");
        }
    }
    
    public static void CatchIndexOutOfBoundsFinally()
    {
        try
        {
            int someArray[] = new int[ 10 ];
            System.out.println( someArray[ 9 ] );
        }
        catch (ArrayIndexOutOfBoundsException AioobeRef)
        {
            System.out.println("Caught ArrayIndexOutOfBounds");
        }
        finally
        {
            System.out.println("Finally statement executed");
        }
    }
    
    
}

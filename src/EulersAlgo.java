//@(#)euler.java
 //This method attempts to find solutions to dx/dt = (e^t)(sin(x)) via
 //Euler's iterative method and find an approximate value for x(10)


import java.text.DecimalFormat;

public class EulersAlgo
{
    public static void main(String[] Leonhard)
    {

        DecimalFormat df = new DecimalFormat("#.0000");
        double h = 0.05;          // h is the step-size
        double t_0 = 1;                // initial condition
        double x_0 = 1;               // initial condition
        double x_f = 7;               // I want to find x(7) using this method and compare it to an exact value of x(7)
        double[] t_k;
        t_k = new double[ (int)( ( x_f - x_0 ) / h ) + 1 ] ;                 // this two arrays hold the values of x_k and t_k
        double[] x_k;
        x_k = new double[ (int)( ( x_f - x_0 ) / h ) + 1 ] ;

        int i;  // the counter
        
        System.out.println( "k\t       t_k\t       x_k" ); // table header

        for ( i = 0; i < (int)( ( x_f - x_0 ) / h ) + 1; i++ )
        {
            if ( i == 0 )  // this if statement handles the initial conditions
            {
                t_k[i] = t_0;
                x_k[i] = x_0;
            }
            else if ( i > 0 )
            {
                t_k[i] += i*h;
                x_k[i] = x_k[i-1] + h*( Math.exp(t_k[i-1]))*(Math.sin(x_k[i-1])   );

            }

            System.out.println( i + "      " + df.format(t_k[i])   + "      " +  df.format( x_k[i])  );
        }
    }
}
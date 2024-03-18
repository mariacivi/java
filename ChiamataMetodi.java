public class ChiamataMetodi {
public static void main ( String [] args ){
int num = -5;
num = doubleAbs ( num );
System . out . println ( num ); // stampa 10
}
private static int doubleAbs ( int n ){
int res = abs ( n );
return 2 * res ;
}
private static int abs ( int n ){
if ( n < 0) n = -n ;
return n ;
}
}
package chap01;

public class Max4Practice {

    static int max4(int a, int b, int c, int d){
        int max = a;
        if( b > max) max = b;
        if( c > max) max = c;
        if( d > max) max = d;

        return max;
    }
}
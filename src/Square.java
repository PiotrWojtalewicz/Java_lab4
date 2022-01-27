public class Square extends Figure {

    int getField(int a, int b ){
        return a * b;
    };
    int getCircuit(int c, int d, int e, int f ){
        return c + d + e + f   ;
    }

    @Override
    int field() {
        return 0;
    }

    @Override
    int circuit() {
        return 0;
    }
}

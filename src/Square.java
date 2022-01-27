public class Square extends Figure {

    int getField(int edge, int edg ){
        return edge * edg;
    };
    int getCircuit(int side, int flank, int bok, int krawedz ){
        return side + flank + bok + krawedz   ;
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

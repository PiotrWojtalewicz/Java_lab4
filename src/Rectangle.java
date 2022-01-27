public class Rectangle extends Figure{

    int getField(int a, int b){
        return  a*b ;
    }
    int getCircule (int c, int d){
        return 2*c + 2*d;
    }

    @Override
    int circuit() {
        return 0;
    }

    @Override
    int field() {
        return 0;
    }
}

public class Square {
    public int size;

    public Square ( int size){
        this.size = size;
    }

    public int getArea() {
        return this.size * this.size;
    }
    public int takeArea (){
        return this.size * 4;
    }
}

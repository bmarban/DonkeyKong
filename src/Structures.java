public class Structures extends Objects {
    private int size;
    private boolean accessible;

    public Structures(int positionX, int positionY, String shape, int size, boolean accessible) {
        super(positionX, positionY, shape);

        this.size = size;
        this.accessible = accessible;
    }

    //Accessible mainly used for stairs so Mario can go up or if they are broken
    public boolean isAccessible() {return accessible;}
    public void setAccessible(boolean accessible) {this.accessible = accessible;}

    public int getSize() {return size;}

    @Override
    public String toString() {return (super.toString() + "\nSize: " + getSize() + "\nAccessible: " + isAccessible());}
}

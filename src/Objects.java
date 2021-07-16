abstract class Objects extends Items {
    private String shape;

    //constructor
    public Objects(int positionX, int positionY, String shape) {
        super(positionX, positionY);
        this.shape = shape;
    }

    public String getShape() {return shape;}
    public void setShape(String shape) {this.shape = shape;}

    @Override
    public String toString() {
         return (super.toString() + "\nShape: " + shape);
    }
}


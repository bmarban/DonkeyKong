public class Artefact extends Objects {
    private int speed; //how fast the items move

    //constructor
    public Artefact(int positionX,
                    int positionY,
                    String shape,
                    int speed) {
        super(positionX, positionY, shape);

        if (speed < 0) // speed check
            throw new IllegalArgumentException(
                    "Speed must be greater or equal to 0");
        this.speed = speed;
    }

    public int points; //how many points you get or lose with each artefact
    //assuming moving items are always bad and deducting points and non moving items add points

    public int getPoints() {
        if (getShape() == null) { //if shape is null then Artefact is not showing or has been destroyed so no points
            points = 0;
        } else if (speed == 0) {
            points = 5;
        } else if (speed < 5) {
            points = -5;
        } else {points = -10;}

        return points;
    }

    //method overloading if special boosted game play for hard game type
    public int getPoints(boolean boosted) {
        if (boosted == true && getShape() != null) {
            if (speed == 0) {
                points = 250;
            } else if (speed < 5) {
                points = -500;
            } else {
                points = -1000;
            }
        }
        else {
            points = getPoints();
        }
        return points;
    }

    public void destroyed() {setShape(null);}

    @Override
    public String toString() {return (super.toString() + "\nSpeed: " + speed + "\nPoints: " + getPoints());}

}

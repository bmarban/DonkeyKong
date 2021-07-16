abstract class Items {

    private int positionX;
    private int positionY;

    public Items (int positionX, int positionY) {

        if (positionX < 0 || positionY < 0) // positioning of object based on X and Y coordinates
            throw new IllegalArgumentException(
                    "X and Y coordinates must be greater than 0");

        this.positionX = positionX;
        this.positionY = positionY;
    }

    public Items () {
        this.positionX = 0;
        this.positionY = 0;
    }
    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    @Override
    public String toString() {
        return ("Position X: " + positionX + "\nPosition Y: " + positionY);
    }
}

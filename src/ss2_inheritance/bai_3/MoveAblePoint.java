package ss2_inheritance.bai_3;

public class MoveAblePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MoveAblePoint(float xSpeed, float ySpeed, float x, float y) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveAblePoint() {
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] xy = {xSpeed, ySpeed};
        return xy;
    }

    public void setSpeed(float xSpeed, float ySpeed) {

    }
    public MoveAblePoint move() {
        super.setX(xSpeed);
        super.setY(ySpeed);
        return this;
    }

    @Override
    public String toString() {
        return "MoveAblePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                ", x=" + super.getX() +
                ", y=" + super.getY() +
                '}';
    }



    public static void main(String[] args) {
        MoveAblePoint moveAblePoint=new MoveAblePoint(7.7f,3.3f,5.7f,6.2f);
        System.out.println(moveAblePoint.move());

    }
}

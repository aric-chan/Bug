//********************************************************************
//  Bug.java
//  A prgram of moving bug
//********************************************************************
import java.util.Random;
public class Bug {
    private int dis;
    private boolean isRight;
    private String face;
    public Bug() {
        //place the bug randomly along the line ranging from -10 to 10
        Random rand = new Random();
        dis = rand.nextInt(21) - 10;
        //set bug face direction randomly
        isRight = rand.nextBoolean();
    }

    // move the bug according to its facing direction
    public void move() {
        if (isRight == false)
            dis--;
        else if (isRight == true)
            dis++;
    }

    //turn the bug to opposite direction
    public void turn () {
        if (isRight == true)
            isRight = false;
        else if (isRight == false)
            isRight = true;
    }

    //output bug's location and facing direction
    public String toString (){
        if (isRight == false)
            face = "Left";
        else if (isRight == true)
            face = "Right";
        return face+" "+dis;
    }

}

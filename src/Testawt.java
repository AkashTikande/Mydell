//Q 7) b) Create an application to create window in java deriving from the Frame class to
//display message “Welcome to World of Java”. [8]

// This programme is belonging to java unit no.6 -
import java.awt.*;
public class Testawt {
    Testawt() {
        Frame fm = new Frame(); //Creating a frame
        Label lb = new Label("Welcome to world of Java"); //Creating a label
        fm.add(lb); //adding label to the frame
        fm.setSize(300, 300); //setting frame size.
        fm.setVisible(true); //set frame visibilty true
    }

    public static void main(String args[]) {
        Testawt ta = new Testawt();
    }

}

/*import java.awt.*;
* public clas TestAwt
* {
* test()
* {
* frame fm =new frame()
* Lable lb= new label("Welcomee to world of jave);
* fm.add(lb);
* fm.setSize(width: 300,Height : 300);
*
* fm.setVisible(true);
* }
* ]*/


/*
import java.awt.*;
public lcass TeastAwt
{
test()
frame fm =new frame();
Lable lb = new lable("Welcome to java progrsmming:")
fm.add(lb);
fm.setSize(Width :300,Height:300)
fm.add(lb)
fm.setVisibility(true);
}
}
* */
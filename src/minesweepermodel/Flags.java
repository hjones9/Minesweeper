package minesweepermodel;
 
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
 
/**
 *
 * @author Kayden.Rumsey
 */
public class Flags {
   
 
    public boolean run(AtomicInteger atomicCount, AtomicBoolean atomicReact, Button get, MouseEvent event) {
 
        Image image2 = new Image("https://lh3.googleusercontent.com/quaYoevP5DEiig0JnRqjpYJ_T15T8as9ydPnMYOjRhGohBy8Lq40hIUEygXTF2o6XjpSAbE=s85", 50, 50, true, true);
        ImageView imageView2 = new ImageView(image2);
        Image image3 = new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8d/President_Barack_Obama.jpg/220px-President_Barack_Obama.jpg", 50, 50, true, true);
        ImageView imageView3 = new ImageView(image3);
        
        if (event.getButton() == MouseButton.SECONDARY) {
            atomicReact.set(false);
            atomicCount.incrementAndGet();
            if (atomicCount.get() == 1) {
                    
                get.setGraphic(imageView3);
                atomicReact.set(true);
 
            } else if(atomicCount.get() == 2) {
                atomicCount.set(0);
 
            }
        }
       return atomicReact.get();
        
    }
 
}
 
 

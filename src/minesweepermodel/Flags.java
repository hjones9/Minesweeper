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
 
         Image image2 = new Image("https://lh3.googleusercontent.com/Pgu26IbOs6o7GWvlbbj3jC93kD0J3kySGtGQ0GcpLvvkwC3BimXSZ26uWvuEDl5j6ssv=s85", 50, 50, true, true);
        ImageView imageView2 = new ImageView(image2);
        
        
        if (event.getButton() == MouseButton.SECONDARY) {
            atomicReact.set(false);
            atomicCount.incrementAndGet();
            if (atomicCount.get() == 2) {
 
                get.setGraphic(null);
                atomicCount.set(0);
                atomicReact.set(true);
 
            } else {
                get.setGraphic(imageView2);
 
            }
        }

       return atomicReact.get();
        
    }
 
}
 
 

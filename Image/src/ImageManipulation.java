
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import static java.time.Clock.system;
import javax.imageio.ImageIO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sumitg
 */
public class ImageManipulation {

    
    public static void main(String[] args){
        try{
            Image picture = ImageIO.read(new File("picture.png"));
        } catch (IOException e){
            String workingDir = System.getProperty("user.dir");
            System.out.println("Current working directory : " + workingDir);
            e.printStackTrace();
        }
        picture.getByte();
    }
}

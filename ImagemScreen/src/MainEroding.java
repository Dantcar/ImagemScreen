/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Size;
import org.opencv.highgui.Highgui;
import org.opencv.imgproc.Imgproc;


/**
 *
 * @author Décio
 */
public class MainEroding {
    
    public static void main(String[] args){
        
        try{
            
            int erosion_size = 2;
            //int dilation_size = 5;
            
            System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
            
            Mat source = Highgui.imread("D://teste.png", Highgui.CV_LOAD_IMAGE_COLOR);
            
            Mat destination = new Mat(source.rows(), source.cols(), source.type());
            
            destination = source;
            
            Mat element = Imgproc.getStructuringElement(Imgproc.MORPH_RECT, 
                    new Size(2 * erosion_size + 1, 2 * erosion_size + 1));
            
            Imgproc.erode(source, destination, element);
            
            Highgui.imwrite("D://Erosion.jpg", destination);
            
            
        }catch(Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
        
    }
    
}//final class MainEroding

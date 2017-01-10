
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Décio
 */
public class PutFiltro {

    public PutFiltro() {
        try {

            System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

        } catch (Exception e) {
            System.out.println("class PutFiltro - Exception: " + e.getMessage());
        }

    }
    
    public static Mat mainBorda(Mat source) {
        Mat destination = new 
            Mat(source.rows(),source.cols(), source.type());
        try{
            
        //System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

       /*
            Mat source = Highgui.imread("D:\\teste.png",
                Highgui.CV_LOAD_IMAGE_COLOR);
       */
            
                
        int top, bottom, left, right;
        
        int borderType;
        
        //initialize arguments for the filter border
        
        top = (int) (0.05 * source.rows());
        bottom = (int) (0.05 * source.rows());
        
        left = (int) (0.15 * source.cols());
        right = (int) (0.15 * source.cols());
        
        destination = source;
        
        //Imgproc.copyMakeBorder(source, destination, top, bottom, left, right, Imgproc.BORDER_WRAP); //borda com a imagem
        Imgproc.copyMakeBorder(source, destination, top, bottom, left, right, Imgproc.BORDER_CONSTANT); //borda preta
        //Imgproc.copyMakeBorder(source, destination, top, bottom, left, right, Imgproc.BORDER_DEFAULT); //borda transparente
        //Imgproc.copyMakeBorder(source, destination, top, bottom, left, right, Imgproc.BORDER_ISOLATED); // borda escura??
        //Imgproc.copyMakeBorder(source, destination, top, bottom, left, right, Imgproc.BORDER_REFLECT); //borda com reflexo da própria imagem
        //Imgproc.copyMakeBorder(source, destination, top, bottom, left, right, Imgproc.BORDER_REFLECT101);
        //Imgproc.copyMakeBorder(source, destination, top, bottom, left, right, Imgproc.BORDER_REFLECT_101);
        //Imgproc.copyMakeBorder(source, destination, top, bottom, left, right, Imgproc.BORDER_REPLICATE); //borda efeito movimento
        //Imgproc.copyMakeBorder(source, destination, top, bottom, left, right, Imgproc.BORDER_TRANSPARENT); //borda não funciona
        
       //Highgui.imwrite("D:\\borderWrap.jpg", destination);
        
                
        }catch(Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
        return destination;
    }
    
    
    
}

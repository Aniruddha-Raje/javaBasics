package imageProcessing;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageTest {
	private static final int IMG_WIDTH = 10;
	private static final int IMG_HEIGHT = 10;

	public static void main(String [] args){

	try{

		BufferedImage originalImage = ImageIO.read(new File("/home/anirudha/Desktop/mkyong.jpg"));
		int type = originalImage.getType() == 0? BufferedImage.TYPE_INT_ARGB : originalImage.getType();

		BufferedImage resizeImageJpg = resizeImage(originalImage, type);
		ImageIO.write(resizeImageJpg, "jpg", new File("/home/anirudha/Desktop/mkyong_jpg.jpg"));

		BufferedImage resizeImagePng = resizeImage(originalImage, type);
		ImageIO.write(resizeImagePng, "png", new File("/home/anirudha/Desktop/mkyong_png.jpg"));

	}catch(IOException e){
		System.out.println(e.getMessage());
	}

    }

    private static BufferedImage resizeImage(BufferedImage originalImage, int type){
		BufferedImage resizedImage = new BufferedImage(IMG_WIDTH, IMG_HEIGHT, type);
		Graphics2D g = resizedImage.createGraphics();
		g.drawImage(originalImage, 0, 0, IMG_WIDTH, IMG_HEIGHT, null);
		g.dispose();
	
		return resizedImage;
    }

    
}

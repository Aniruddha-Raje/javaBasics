package basics.fileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Aniruddha.Raje
 *
 */
public class FileReaderWriter {
	public static void main(String args[]) throws IOException {
	      FileReader in = null;
	      FileWriter out = null;

	      try {
	         in = new FileReader("/home/aniruddha/Desktop/input.txt");
	         out = new FileWriter("/home/aniruddha/Desktop/outputFileWriter.txt");
	         
	         int c;
	         while ((c = in.read()) != -1) {
	            out.write(c);
	         }
	      }finally {
	         if (in != null) {
	            in.close();
	         }
	         if (out != null) {
	            out.close();
	         }
	      }
	   }
}

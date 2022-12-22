import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class ExtractData
{
	
	private void writeData()
	{
		try
		{
			FileWriter writer=new FileWriter("D://javaMorseCode.txt");
			writer.write("A.-\r\n"
					+ "B-...\r\n"
					+ "C-.-.\r\n"
					+ "D-..\r\n"
					+ "E.\r\n"
					+ "F..-.\r\n"
					+ "G--.\r\n"
					+ "H....\r\n"
					+ "I..\r\n"
					+ "J.---\r\n"
					+ "K-.-\r\n"
					+ "L.-..\r\n"
					+ "M--\r\n"
					+ "N-.\r\n"
					+ "O---\r\n"
					+ "P.--.\r\n"
					+ "Q--.-\r\n"
					+ "R.-.\r\n"
					+ "S...\r\n"
					+ "T-\r\n"
					+ "U..-\r\n"
					+ "V...-\r\n"
					+ "W.--\r\n"
					+ "X-..-\r\n"
					+ "Y-.--\r\n"
					+ "Z--..\r\n"
					+ "0-----\r\n"
					+ "1.----\r\n"
					+ "2..---\r\n"
					+ "3...--\r\n"
					+ "4....-\r\n"
					+ "5.....\r\n"
					+ "6-....\r\n"
					+ "7--...\r\n"
					+ "8---..\r\n"
					+ "9----.\r\n"
					+ "..-.-.-\r\n"
					+ ",--..--\r\n"
					+ "?..--..\r\n"
					+ "--....-\r\n"
					+ "/-..-.\r\n"
					+ ":---...\r\n"
					+ "'.----.\r\n"
					+ "--....-\r\n"
					+ ")-.--.-\r\n"
					+ ";-.-.-.\r\n"
					+ "(-.--.\r\n"
					+ "=-...-\r\n"
					+ "@.--.-.\r\n"
					+ "!-.-.--\r\n"
					+ "&.-...\r\n"
					+ "$...-..-\r\n"
					+ "\".-..-.\r\n"
					+ "_..--.-\r\n"
					+ "--....-\r\n"
					+ "+.-.-.");
			writer.close();
			
		}

		catch(IOException filewrite)
		{
			FrameWork errorPrint =new FrameWork();
			errorPrint.output.setText("Error occors while extracting data");
		}
	}
	boolean existanceCheck()
	{
		File fileObject =new File("D://text file for java//javaMorseCode.txt");
		if(fileObject.exists())
		{
			return true;
		}
		else
		{
			ExtractData extract=new ExtractData();
			extract.writeData();
			return true;
		}
	}
	
}	


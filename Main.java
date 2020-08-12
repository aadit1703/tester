import compiler.parser.Parser;
import java.io.FileReader;

public class Main
{
	static final String myName = "Aadit Shah";
	static final String myRedId = "822089509";
	
	public static void main(String... args)
	{
		System.out.println("Student: "+myName+"\nRed ID: "+myRedId+" \n");

		if(args.length<1)
		{
			System.out.println("Program usage: java Compiler2 <input_file>");
			return;
		}	
	
		try
		{
			Parser parser = new Parser(new FileReader(args[0]));
			parser.parse();
			parser.print();

		}
		catch(Exception ex)
		{
			System.out.println(ex);
			ex.printStackTrace();
			return;
		}

		System.out.println("Success");
	}
}
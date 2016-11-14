
import java.util.Scanner;
import java.io.FileInputStream;

public class FunWithFileIO {

    public static void main(String[] args) throws Exception
    {
        Scanner scanner = null;
        String string = null;
    
        if( args.length > 0 )       
            // obtain a scanner attached to the filename that was provided
            scanner = new Scanner( new FileInputStream( args[0]) );
        else
        {
            System.out.println("A filename must be supplied via command line parameters");
            System.exit(-1);
        }

        while( scanner.hasNextLine() )
        {
            string = scanner.nextLine();
            
            if( string.charAt(0) == ';')
                ; // do nothing, strip comments from the data
            else if( !Character.isDigit(string.charAt(0)) && string.length() > 2 )
            {
                System.out.println("line: " + string );
            
                String[] entries;
                char commandChar;
                
                commandChar = string.charAt(0);
                System.out.println( "command: " + commandChar);
            
                entries = string.substring(2).split("[,]");
                
                for( int i = 0; i < entries.length; i++ )
                {
                    System.out.println( entries[i].trim() );
                }
            }               
        }
        
        scanner.close();
    }
}

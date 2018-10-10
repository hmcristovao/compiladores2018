package apoio;
// java -classpath /usr/local/lib/javacc/bin/javacc.jar javacc Compilador.jj

import java.io.BufferedReader;
import java.io.File;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.ObjectOutput;

public interface Config extends Serializable {

    /**
     *
     */
    public String NOMEARQ = Config.lerDoDisco();
    public String EXTFONT = ".spc";
    public String EXT1PASSAGEM = ".j";
    public String EXT2PASSAGEM = ".cir";

    public static void salvarEmDisco(String x) throws IOException {
    	OutputStreamWriter bufferOut = new OutputStreamWriter(new FileOutputStream("config.txt"),"UTF-8");
  
    	bufferOut.write(x);
		
		bufferOut.close();
    }

    static public String lerDoDisco() {
        String path = null;
        try {
			BufferedReader myBuffer = new BufferedReader(new InputStreamReader(new FileInputStream("config.txt"), "UTF-8"));
			path = myBuffer.readLine();
	
	//	    multiplas linhas;
	//    	while (myBuffer != null) {
	//	    	path += myBuffer.readLine();
	//	    }
		 
	        myBuffer.close();
        } catch (Exception e) { 
        	e.getMessage();
        }
        return path;
    }

    static public ArrayList<String> lerDoDiscoMultiplos() throws FileNotFoundException {
        Scanner leitor = new Scanner(new File("config.spc"));
        ArrayList<String> linhas = new ArrayList<String>();
        while (leitor.hasNextLine()) {
            linhas.add(leitor.nextLine());
        }
        leitor.close();
        return linhas;
        //String[] vetorDeLinhas = linhas.toArray();
    }
}

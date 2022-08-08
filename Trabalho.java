import java.io.*;

public class Trabalho {

    public static void main(String[] args) {

        //CSV = Comma-Separated Values 
        //   text file that uses a comma to separate values

        // The path of the file that contains the data.
        String file = "C:/Users/guiav/OneDrive/Área de Trabalho/Programação/Java/Trabalho/Entrevistados.csv";
        // Creating a variable called reader of type BufferedReader and initializing it with null.
        BufferedReader reader = null;
        // Creating a variable called line of type String and initializing it with an empty string.
        String line = "";
        // Creating an object of the class Evetor.
        Evetor v = new Evetor ();
       // Reading the file and creating an object of the class Entrevistado for each line of the file.
        try {
            reader = new BufferedReader(new FileReader(file));
            while((line = reader.readLine()) != null) {
                String[] row = line.split(";");
                Entrevistado entrevistado = new Entrevistado(row[0].charAt(0), row[1], row[2], row[3], row[4], row[5]);
                v.adiciona(entrevistado);
                System.out.println();
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                //TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
       // Printing the result of the method relatorio1() of the class Evetor.
       System.out.println(v.relatorio1()); 
       // Printing the result of the method relatorio2() of the class Evetor.
       System.out.println(v.relatorio2()); 
       // Printing the result of the method relatorio3() of the class Evetor.
       System.out.println(v.relatorio3()); 
       // Printing the result of the method relatorio4() of the class Evetor.
       System.out.println(v.relatorio4()); 
       // Printing the result of the method relatorio5() of the class Evetor.
       System.out.println(v.relatorio5());
       // Printing the result of the method relatorio6() of the class Evetor.
       System.out.println(v.relatorio6());  
       // Printing the result of the method relatorio7() of the class Evetor.
       System.out.println(v.relatorio7());  
       // Printing the result of the method relatorio8() of the class Evetor.
       System.out.println(v.relatorio8());  
    }
}
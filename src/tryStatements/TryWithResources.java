package tryStatements;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

    /**
     * try-with-resources statement allows to open AutoCloseable Objects which will be closed at the end of try block
     * Closeable interface extends AutoCloseable, so we can use all Closeable Objects as well
     * We still must catch the exception that might appear while opening our AutoCloseable Objects, like
     * FileNotFoundException while opening FileReader or IOException while opening BufferedReader etc.
     */
    void tryWithResourcesExample() {
        int i = 0;
        try(
                SimpleAutoCloseable simple = new SimpleAutoCloseable();
                BufferedReader reader = new BufferedReader(new FileReader("c:\\hello.txt"));
                ) {
         i = 10;
            System.out.println("End of try statement");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally");
            i = 15;
        }

        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        TryWithResources tryWithResources  = new TryWithResources();
        tryWithResources.tryWithResourcesExample();
    }

    class SimpleAutoCloseable implements AutoCloseable {
        @Override
        public void close() {
            System.out.println("Closed");
        }
    }
}

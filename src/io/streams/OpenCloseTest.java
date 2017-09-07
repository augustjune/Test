package io.streams;


import java.io.*;

public class OpenCloseTest{

    private static final String INPUT_PATH = "src/io/streams/files/input/";
    private static final String OUTPUT_PATH = "src/io/streams/files/output/";
    private static final String DEFAULT_FILE_NAME = "OpenCloseDefaultFile.txt";

    void tryInputStreamOpen() {
        try (
                InputStream  inputStream = new FileInputStream(INPUT_PATH + "emptyTextFile.txt");
                ){
        } catch (FileNotFoundException e) {
            System.err.println("tryInputStreamOpen() -- exception caught: FileNotFoundException");
        } catch (IOException e) {
            System.err.println("tryInputStreamOpen() -- exception caught: IOException");
        }
    }

    void tryOutputStreamOpen() {
        try (
                OutputStream outputStream = new FileOutputStream(OUTPUT_PATH + DEFAULT_FILE_NAME);
                ){

        } catch (FileNotFoundException e) {
            System.err.println("tryOutputStreamOpen() -- exception caught: FileNotFoundException");
        } catch (IOException e) {
            System.err.println("tryOutputStreamOpen() -- exception caught: IOException");
        }
    }

    void tryInputStreamRead() {
        try (
                InputStream inputStream = new FileInputStream(INPUT_PATH + DEFAULT_FILE_NAME);
                ){
            while (inputStream.available()>0) {
                inputStream.read();
            }
        } catch (FileNotFoundException e) {
            System.err.println("tryInputStreamRead() -- exception caught: FileNotFoundException");
        } catch (IOException e) {
            System.err.println("tryInputStreamRead() -- exception caught: IOException");
        }
    }

}

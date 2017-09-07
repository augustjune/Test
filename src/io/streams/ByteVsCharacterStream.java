package io.streams;

import java.io.*;

public class ByteVsCharacterStream extends FileTest {

    private static final String INPUT_PATH = "src/io/streams/files/input/";
    private static final String OUTPUT_PATH = "src/io/streams/files/output/";

    private static final String BYTE_OUTPUT_PATH = OUTPUT_PATH + "byteStreamResult/";
    private static final String CHAR_OUTPUT_PATH = OUTPUT_PATH + "charStreamResult/";


    private FileInputStream byteInStream;
    private FileOutputStream byteOutStream;

    private FileReader charReader;
    private FileWriter charWriter;

    void testSimpleText() {
        String fileName = "simpleText.txt";
        try (
            FileInputStream byteInStream = new FileInputStream(INPUT_PATH + fileName);
            FileReader charReader = new FileReader(INPUT_PATH + fileName);
            FileOutputStream byteOutStream = new FileOutputStream(BYTE_OUTPUT_PATH + fileName);
            FileWriter charWriter = new FileWriter(CHAR_OUTPUT_PATH + fileName);
                ){

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

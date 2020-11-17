package forpractice.gameworld;

import java.io.BufferedReader;
import java.io.FileReader;

public class Utils {

    public static String loadFile(String path) {
        StringBuilder stringBuilder = new StringBuilder();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String currLine;
            while((currLine = reader.readLine()) != null) {
                stringBuilder.append(currLine + "\n");
            }
            reader.close();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return stringBuilder.toString();
    }

}

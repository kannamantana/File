import javax.imageio.IIOException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Main {

    public static void dirCreate (String dirPath, StringBuilder log) {
        File dir = new File(dirPath);
        Date date = new Date();
        if (dir.mkdir()) {
            log.append( date + " : Каталог " + dirPath + " успешно создан" + "\n");
        } else {
            log.append(date + " : Каталог " + dirPath + " не создан" + "\n");
        }
    }

    public static void fileCreate (String dirPath, String fileName, StringBuilder log) {
        File file = new File(dirPath, fileName);
        Date date = new Date();

        try {
            if (file.createNewFile()) {
                log.append( date + " : Файл " + fileName + " успешно создан" + "\n");
            } else {
                log.append( date + " : Файл " + fileName + " не создан" + "\n");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {

        StringBuilder log = new StringBuilder();

        dirCreate("Games", log);
        dirCreate("Games/src", log);
        dirCreate("Games/res", log);
        dirCreate("Games/savegames", log);
        dirCreate("Games/temp", log);
        dirCreate("Games/src/main", log);
        dirCreate("Games/src/test", log);
        dirCreate("Games/res/drawables", log);
        dirCreate("Games/res/vectors", log);
        dirCreate("Games/res/icons", log);

        fileCreate("Games/src/main", "Main.java" , log);
        fileCreate("Games/src/main", "Utils.java" , log);
        fileCreate("Games/temp", "temp.txt" , log);

        try (FileWriter writer = new FileWriter ("Games/temp/temp.txt", false)) {
            writer.write (log.toString());
            writer.flush();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }

        }
        }


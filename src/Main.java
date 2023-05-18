import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        StringBuilder log = new StringBuilder();

        File src = new File("C:/Games/src");
        if (src.mkdir())
            System.out.println("Директория успешно создана");
        else
            System.out.println("Что-то пошло не так");

        File res = new File("C:/Games/res");
        if (res.mkdir())
            System.out.println("Директория успешно создана");

        File file = new File("C:/Games/savegames");
        if (file.mkdir())
            System.out.println("Директория успешно создана");

        File temp = new File("C:/Games/temp");
        if (temp.mkdir())
            System.out.println("Директория успешно создана");

        File main = new File("C:/Games/src/main");
        if (main.mkdir())
            System.out.println("Директория успешно создана");

        File test = new File("C:/Games/src/test");
        if (test.mkdir())
            System.out.println("Директория успешно создана");

        File drawables = new File("C:/Games/res/drawables");
        if (drawables.mkdir())
            System.out.println("Директория успешно создана");

        File vectors = new File("C:/Games/res/vectors");
        if (vectors.mkdir())
            System.out.println("Директория успешно создана");

        File icons = new File("C:/Games/res/icons");
        if (icons.mkdir())
            System.out.println("Директория успешно создана");

        File mainFile = new File ("C/Games/main/Main.java");
        try {
            if (mainFile.createNewFile())
                System.out.println("Файл успешно создан");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File utilsFile = new File ("C/Games/main/Utils.java");
        try {
            if (utilsFile.createNewFile())
                System.out.println("Файл успешно создан");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File tempFile = new File ("C/Games/temp/temp.txt");
        try {
            if (tempFile.createNewFile())
                System.out.println("Файл успешно создан");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
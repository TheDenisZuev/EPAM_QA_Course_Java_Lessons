package JavaIO;

// Реализовать программу которая будет получать в качестве аргумента командной строки путь к директории,
// например "D:/movies". Записать в текстовый файл структуру папок и файлов в виде,
// похожем на выполнение программы tree /F.

import java.io.*;

public class MainTask {
    public static void main(String[] args) {
        String path = "src/JavaIO/Cinema/Horror/Freaky.txt";
        File catalog = new File(path);

        if(catalog.exists() && catalog.isDirectory()){
            File array[] = catalog.listFiles();
            listFilesAndCatalogs(array, 0,0);
        }
        else {
            readFile(path);
            getSpecifications(path);
        }
    }

    public static void listFilesAndCatalogs(File[] array, int index, int level){
        if (index == array.length)
            return;
        for (int i = 0; i < level; i++){
            System.out.println("|\t");
        }
        if (array[index].isFile()){
            System.out.println(array[index].getName());
        }
        else if (array[index].isDirectory()){
            System.out.println(array[index].getName());
            listFilesAndCatalogs(array[index].listFiles(), 0, level + 1);
        }
        listFilesAndCatalogs(array, ++index, level);
    }

    public static void readFile(String path){
        try {
            File file = new File(path);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            System.out.println("File contains:");
            String line;
            while ((line = bufferedReader.readLine()) != null)
                System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getSpecifications(String path){
        File file = new File(path);
        File cinemaFile = new File(file.getParent());
        File[] pathName;
        pathName = cinemaFile.listFiles();
        int files = 0;
        int catalogs = 0;
        int lengthFiles = 0;

        for(File pathname : pathName){
            if(pathname.isDirectory()){
                catalogs++;
                System.out.println();
            }
            else {
                files++;
                String nameFile = pathname.getName();
                lengthFiles += nameFile.length();
            }
        }
        System.out.println("Files = " + files);
        System.out.println("Catalogs = " + catalogs);
        System.out.println("Average filename of the all files is " + lengthFiles / files);
    }
}

package BasicsOfOOP.ex1;
/*
 * Создать объект класса Текстовый файл, используя классы Файл, Директория.
 * Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
 */

public class exe {
    public static void main(String[] args) {
        Directory directory = new Directory("Текст");
        String fileName = "Просто файл";
        TextFile tFile = new TextFile(directory, fileName);
        String line1 = "Предложение намбер уан.";
        tFile.addText(line1);

        System.out.println("Файл создан: \"" + tFile.getFileName() + "\"");

        tFile.changeName("File reverb remaster v2.0");
        System.out.println("Название файла поменялось на \"" + tFile.getFileName() + "\"");

        System.out.println("\nВыведем содежимое файла.");
        tFile.printContent();

        System.out.println("\nДобавим еще предложение и выведем содержимое файла.");
        String line2 = "Предложение намбер ту.";
        tFile.addText(line2);
        tFile.printContent();

        System.out.println("\nВыведем содержимое директории.");
        for (File file : directory.getFiles()) {
            System.out.println(file);
        }

        System.out.println("\nСоздадим еще текстовый файл и выведем содержимое директории.");
        File tFile2 = new TextFile(directory, "ФАЙЛ222");
        for (TextFile file : directory.getFiles()) {
            System.out.println(file);
        }

        System.out.println("\nУдалим текстовый файл и выведем содержимое директории.");
        directory.removeFile("ФАЙЛ222");
        for (TextFile file : directory.getFiles()) {
            System.out.println(file);
        }
    }
}
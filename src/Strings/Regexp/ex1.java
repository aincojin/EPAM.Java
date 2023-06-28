package Strings.Regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex1 {
    public static void main(String[] args) {
        String text = "Когда мы слышим слово субмарина, на ум сразу приходит изображение невероятных подводных аппаратов, способных скрываться в глубинах морей и океанов. \n" +
                "Субмарины позволяют людям исследовать просторы подводного мира. \n" +
                "Они могут держаться на глубине, выполнять различные миссии и обеспечивать безопасность на море.\n" +
                "\n" +
                "Субмарины играют важную роль в морской обороне и научных исследованиях. \nОни используются во множестве задач, начиная от обеспечения безопасности водных путей, и заканчивая научными экспедициями и исследованиями подводного мира. \n" +
                "Субмарины обладают специальным оборудованием, которое позволяет собирать данные о состоянии морской среды.\n" +
                "\n" +
                "Однако, субмарины также несут в себе определенные риски и вызовы. \n" +
                "Погружение на большие глубины требует специальной подготовки и соблюдения строгих протоколов безопасности. \n" +
                "Команды субмарин обязаны быть высококвалифицированными и готовыми к долгим периодам находки под водой. \n" +
                "Инновационные технологии в области подводных исследований позволяют расширять наше понимание подводного мира.\n" +
                "\n" +
                "Таким образом, субмарины представляют собой уникальные технические достижения, которые позволяют людям исследовать глубины морей и океанов. \n" +
                "Они являются неотъемлемой частью научных исследований, помогая нам понять и сохранить прекрасный мир под водой.";
        menu(text);
    }

    public static void menu(String text) {
        String start = """
                Выберите вариант из предложенных и введите его номер:
                1) Отсортировать абзацы по количеству предложений.
                2) В каждом предложении отсортировать слова по длине.
                3) Отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, в случае равенства - по алфавиту.
                4) Завершить работу.
                """;
        String choice;
        System.out.println(start);

        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Введите номер варианта:");
            choice = in.next();
            switch (choice) {
                case "1" -> sortInParagraph(text);
                case "2" -> sortInSentence(text);
                case "3" -> sortLexemes(text);
                case "4" -> System.out.println("\nВы вышли.");
                default -> System.out.println("Такого варианта нет.");

            }
        } while (!choice.equals("4"));
    }
    public static void sortInParagraph(String text) {

        Pattern sentencePattern = Pattern.compile("[.!?] ");

        String[] para = text.split("\\n{2}");
        int[] countSentences = new int[para.length];
        int maxCountSent = 0;

        for (int i = 0; i < para.length; i++) {
            Matcher sentenceMatcher = sentencePattern.matcher(para[i]);
            int count = 0;
            while (sentenceMatcher.find()) {
                count++;
            }
            countSentences[i] = count;
            if (maxCountSent < countSentences[i]) {
                maxCountSent = countSentences[i];
            }
        }

        for (int i = maxCountSent; i > 0; i--) {
            for (int j = 0; j < countSentences.length; j++) {
                if (i == countSentences[j]) {
                    System.out.println("\n" + para[j]);
                }
            }
        }
        System.out.println();
    }
    public static void sortInSentence(String text){
        String paragraphs = text.replaceAll(",", "");

        String[] para = paragraphs.split("\\n{2}");

        for (int i = 0; i < para.length; i++) {
            para[i] = para[i].replaceAll("\n", "");
            String[] sent = para[i].split("[.!?] ");

             for(int j = 0; j < sent.length; j++){

                 sent[j] = sent[j].replaceAll("\\.", "");
                 String[] words = sent[j].split(" ");


                 for (int k = words.length - 1; k >= 0; k--) {
                     for (int m = 0; m < k; m++) {
                         if (words[m].length() < words[m + 1].length()) {
                             String tmp = words[m];
                             words[m] = words[m + 1];
                             words[m + 1] = tmp;
                         }
                     }
                 }
                 StringBuilder sortedSentence = new StringBuilder();
                 for (String word : words) {
                     sortedSentence.append(word).append(" ");
                 }
                 sortedSentence.append(". ");
                 System.out.println(sortedSentence);
             }
            System.out.println();
        }

    }
    public static void sortLexemes(String text) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите символ: ");
        String symbol = in.next();
        String paragraphs = text.replaceAll(",", "");
        String[] para = paragraphs.split("\\n{2}");

        for (int i = 0; i < para.length; i++) {
            para[i] = para[i].replaceAll("\n", "");
            String[] sent = para[i].split("[.!?] ");

            for (int j = 0; j < sent.length; j++) {

                sent[j] = sent[j].replaceAll("\\.", "");
                String[] words = sent[j].split(" ");

                for (int k = words.length - 1; k >= 0; k--) {
                    for (int m = 0; m < k; m++) {
                        int countRight = 0;
                        int countLeft = 0;
                        for (int n = 0; n < words[m].length(); n++) {
                            if (String.valueOf(words[m].charAt(n)).compareToIgnoreCase(symbol) == 0) {
                                countLeft++;
                            }
                        }
                        for (int n = 0; n < words[m + 1].length(); n++) {
                            if (String.valueOf(words[m + 1].charAt(n)).compareToIgnoreCase(symbol) == 0) {
                                countRight++;
                            }
                        }
                        if (countLeft < countRight || (countLeft == countRight && words[m].compareToIgnoreCase(words[m + 1]) > 0)) {
                            String tmp = words[m];
                            words[m] = words[m + 1];
                            words[m + 1] = tmp;
                        }

                    }
                }
                StringBuilder sortedSentence = new StringBuilder();
                for (String word : words) {
                    sortedSentence.append(word).append(" ");
                }
                sortedSentence.append(". ");
                System.out.println(sortedSentence);
            }
            System.out.println();
        }
    }
}

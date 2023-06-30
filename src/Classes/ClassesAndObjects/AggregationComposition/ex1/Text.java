package Classes.ClassesAndObjects.AggregationComposition.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Text {
    private Word headline;
    private ArrayList<Sentence> text;
    //создание заколовка текста без содержимого
    Text(Word headline){
        this.headline = headline;
        this.text = new ArrayList<>();
    }
    //создание заголовка с текстом(массивом предложений)
    Text(Word headline, ArrayList<Sentence> text){
        this.headline = headline;
        this.text = text;
    }

    public static void main(String[] args) {
        Word headline = new Word("HEADLINE");
        Sentence sentence1 = new Sentence("First sentence!");
        Sentence sentence2 = new Sentence("Second sentence.");
        ArrayList<Sentence> sentences = new ArrayList<>();
        sentences.add(sentence1);
        Text fullText = new Text(headline,sentences);

        fullText.addSentence(sentence2);

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentenceInput = in.nextLine();
        Sentence sentenceUser = new Sentence(sentenceInput);


        fullText.addSentence(sentenceUser);
        fullText.printHeadline();
        fullText.printText();


    }
    void addSentence(Sentence sentence){
        this.text.add(sentence);
    }
    void printText(){
        for(Sentence sentence : text){
            System.out.print(sentence + " ");
        }
    }
    void printHeadline(){
        System.out.println(headline);
    }

    public Word getHeadline() {
        return headline;
    }
    public void setHeadline(Word headline) {
        this.headline = headline;
    }

}

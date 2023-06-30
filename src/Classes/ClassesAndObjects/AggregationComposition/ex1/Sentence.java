package Classes.ClassesAndObjects.AggregationComposition.ex1;

public class Sentence {
    private String sentence;
    Sentence(String sentence){
        this.sentence = sentence;
    }
    @Override
    public String toString(){
        return sentence;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }
}

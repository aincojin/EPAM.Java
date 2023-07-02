package BasicsOfOOP.ex1;

class Text {
    private String text;

    Text(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void addText(String text) {
        String stringBuilder = this.text + ' ' +
                text;
        this.text = stringBuilder;
    }


}
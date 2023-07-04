package BasicsOfOOP.ex4;

public class Treasure {
    private String treasureName;
    private int value;

    Treasure(String treasureName, int value){
        this.treasureName = treasureName;
        this.value = value;
    }
    public String toString(){
        return "Вы нашли: " + treasureName + ". Ценность: " + value;
    }
    public String getTreasureName() {
        return treasureName;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

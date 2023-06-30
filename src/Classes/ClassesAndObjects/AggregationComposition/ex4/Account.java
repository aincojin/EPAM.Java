package Classes.ClassesAndObjects.AggregationComposition.ex4;

public class Account {
    private int accountId;
    private boolean isBlocked;
    private int gold;

    Account(int accountId, boolean isBlocked, int gold){
        this.accountId = accountId;
        this.isBlocked = isBlocked;
        this.gold = gold;
    }
    @Override
    public String toString (){
        return accountId + "\n" + gold + "\n";
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public boolean getIsBlocked() {
        return isBlocked;
    }

    public void setIsBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
}

/*Создйте  класс  Test2 c  двумя  переменными.  Добавьте  конструктор  с  входными  параметрами.  Добавьте
конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра
класса.*/

package Classes.ClassesAndObjects;

public class Test2 {
    private int x;
    private int y;
    public Test2(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Test2(){
        x = 0;
        y = 0;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
}

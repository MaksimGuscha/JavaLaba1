package bsu.rfe.java.group8.lab1.Guscha.varA9;

public class Eggs extends Food {
    private String number;

    public Eggs (String number){ //конструктор
        super("Eggs");
        this.number = number;
    }
    @Override
    public void consume(){
        System.out.println(this + " съедено");
    }
    public String toString (){
        return super.toString() + " в количестве '" + number + "'";
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public boolean equals(Object args)
    {
        if (super.equals(args)) { // Шаг 1
            if (!(args instanceof Eggs)) return false; // Шаг 2
            return number.equals(((Eggs)args).number); // Шаг 3
        } else
            return false;
    }
}

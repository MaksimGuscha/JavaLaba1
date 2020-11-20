package bsu.rfe.java.group8.lab1.Guscha.varA9;

public class Cheese extends Food{
    public Cheese(){
        super("Cheese");
    }
    @Override
    public void consume (){
        System.out.println(this + " съеден");
    }
}

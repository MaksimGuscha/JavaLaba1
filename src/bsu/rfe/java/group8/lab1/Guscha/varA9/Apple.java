package bsu.rfe.java.group8.lab1.Guscha.varA9;

public class Apple extends Food {
    private String size;
    public Apple (String size) {
        super("Apple");
        this.size = size;
    }
    @Override
    public void consume() {
        System.out.println(this + " " + "съедено");
    }
    public void setSize(String size){
        this.size = size;
    }
    public String getSize() {
        return size;
    }
    public String toString (){
        return super.toString() + " размера '" + size +"'";
    }
    public boolean equals(Object args) {
        if (super.equals(args)) {
            if (!(args instanceof Apple)) return false;
            return size.equals(((Apple)args).size); // Шаг 3
        } else
            return false;
    }
}

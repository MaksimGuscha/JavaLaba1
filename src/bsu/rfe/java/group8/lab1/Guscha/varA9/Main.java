package bsu.rfe.java.group8.lab1.Guscha.varA9;

public class Main {

    public static void main(String[] args) {
        Food[] breakfast = new Food[20];
        int itemsSoFar = 0;
        for (String arg: args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Cheese")) {
                breakfast[itemsSoFar] = new Cheese();

            } else
            if (parts[0].equals("Apple")) {
                if(parts[1].equals("большое")){
                    breakfast[itemsSoFar] = new Apple(parts[1]);

                }
                if(parts[1].equals("среднее")){
                    breakfast[itemsSoFar] = new Apple(parts[1]);

                }
                if(parts[1].equals("маленькое")){
                    breakfast[itemsSoFar] = new Apple(parts[1]);

                }
            }
            if (parts[0].equals("Eggs")){
                if(parts[1].equals("1")){
                    breakfast[itemsSoFar] = new Eggs(parts[1]);

                }
                if(parts[1].equals("2")){
                    breakfast[itemsSoFar] = new Eggs(parts[1]);

                }
                if(parts[1].equals("3")){
                    breakfast[itemsSoFar] = new Eggs(parts[1]);

                }
            }
            itemsSoFar++;
        }
        for (Food item: breakfast)
            if (item!=null)
                item.consume();
            else
                break;

    }
}


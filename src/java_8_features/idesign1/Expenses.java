package java_8_features.idesign1;

public class Expenses{
    private String expenseType;
    private Double cost;

    Expenses(String expenseType, Double cost){
        //Fill your code here
        this.expenseType = expenseType;
        this.cost = cost;
    }
    String getExpenseType(){
        return this.expenseType;
    }
    Double getCost(){
        return this.cost;
    }

    @Override
    public String toString() {
        return getExpenseType()+":"+getCost();
    }
}


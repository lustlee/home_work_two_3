package geektech;

public class BankAccount {
    private double amount;

    public BankAccount(){}

    public BankAccount(double amount){
        this.amount = amount;
    }

    public double getAmount(){
        return amount;
    }

    public double deposit(double sum){
        return this.amount += sum;
    }

    public double withDraw(double sum) throws LimitException{
        if(sum > this.amount) {
            throw new LimitException("Ошибка! LimitException ", this.amount);
        } else {
            return this.amount -= sum;
        }
    }
}
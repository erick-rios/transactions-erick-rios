package transactions.account;

import transactions.operations.*;
import java.util.Arrays;

public class Accoount {
    
    private int id;
    private Transaction [] transaction;

    public Account(int id){
        this.id = id;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }

    public void sendMoneyToAccount(Account accountTo, double money){

    }

    public void withdrawMoney(double moneyAmount){

    }

    public Transaction[] getTransactions(){

    }


    class Transaction{
        private Account accountFrom;
        private Account accountTo;
        private double moneyAmount;
        private StandardAccountOperations operation;

        public Transaction(Account accountFrom, Account accountTo, double moneyAmount, StandardAccountOperations operation){
            this.accountFrom = accountFrom;
            this.accountTo   = accountTo;
            this.moneyAmount = moneyAmount;
            this.operation   = operation;
        }

        public void setAccountFrom(Account accountFrom){
            this.accountFrom = accountFrom;
        }
        public void setAccountTo(Account accountTo){
            this.accountTo = accountTo;
        }
        public void setMoneyAmount(double moneyAmount){
            this.moneyAmount = moneyAmount;
        }
        public void setStandardAccountOperations(StandardAccountOperations operations){
            this.operation = operation;
        }
        public Account getAccountFrom(){
            return this.accountFrom;
        }
        public Account getAccountTo(){
            return  this.accountTo;
        }
        public double getMoneyAmount(){
            return this.moneyAmount;
        }
        

    }
}

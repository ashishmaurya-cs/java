
package corejava;
public class BankSystem {
    int account_no;
    String name;
    float balance;
    
                    void insert(int account_no,String name,float balance){
                    this.account_no=account_no;
                    this.name=name;
                    this.balance=balance;
                    }
   void display(){
        System.out.println(account_no+" "+name+" "+balance);
    }
    
                        void deposit(float amount){
                        this.balance = this.balance+amount;
                            System.out.println(amount+" Deposited");
                        }

    
    void withdraw(float amount){
        if(balance<amount){
            System.out.println("insufficient balance");
        }
        else{
        this.balance=this.balance-amount;
            System.out.println(amount+" withdrawn");
        }
    }

                        void balanceCheck(){
                            System.out.println("Balance is : "+balance);
                        }
    
    public static void main(String[] args) {
     
        BankSystem b1=new BankSystem(); 
        b1.insert(368610100, "Ram Ashish Maurya", 10000);
        b1.display();
         b1.deposit(10000);
         b1.balanceCheck();
        b1.withdraw(10000);
        b1.balanceCheck();
    }
}

    
     
    
    
    
    

abstract class ATM
{
abstract void withdrawmoney();
}

class MyATM extends ATM
{
void withdrawmoney()
{
System.out.println("Withdraw Cash");
}
}
public class Withdraw
{
public static void main(String[]args)
{
MyATM a = new MyATM();
a.withdrawmoney();
}
}




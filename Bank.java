/*Name- Rahul Dey
  Sec-B
  Roll-63*/
import javax.swing.JOptionPane;
class Bank
{
	private int bal=0;
	public void deposit()
	{
		int i;
		String s1=JOptionPane.showInputDialog("Enter the amount that you want to deposit","type here");
		i=Integer.parseInt(s1);
		bal=bal+i;
		JOptionPane.showMessageDialog(null,"Your money has been deposited.");
	}
	public void withdraw()
	{
		int j;
		String s2=JOptionPane.showInputDialog("Enter the amount that you want to withdraw","type here");
		j=Integer.parseInt(s2);
		if(j<bal)
		{
			bal=bal-j;
			JOptionPane.showMessageDialog(null,"Your money has been withdrawn");
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Insufficient Balance.");
			System.exit(0);
		}
	}
	void balance()
	{
		JOptionPane.showMessageDialog(null,"Your current balance is Rs."+bal+"/-");
	}
	public static void main(String rahul[])
	{
		Bank b=new Bank();
		int k;
		while(true)
		{
			String s3=JOptionPane.showInputDialog("1.Deposit\n2.Withdraw\n3.Check Balance\n4.Exit\nEnter your choice..");
			k=Integer.parseInt(s3);
			switch(k)
			{
				case 1:b.deposit();
						break;
				case 2:b.withdraw();
						break;
				case 3:b.balance();
						break;
				case 4:System.exit(0);
				default:JOptionPane.showMessageDialog(null,"Wrong Input!!!Please try again.");
			}
		}
	}
}

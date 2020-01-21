public class BankFactory
{

    public ICICI getIcici() {
		Notification ic= new ICICI();
		return (ICICI) ic;
	}

	public HDFC getHdfc() 
	{
		Notification hd= new HDFC();
		return (HDFC) hd;
	}
}
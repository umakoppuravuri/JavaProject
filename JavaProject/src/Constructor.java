
public class Constructor {
	String Sname;
	int RNo;
	
	public Constructor(String Sname,int RNo)
	{
		this.Sname=Sname;
		this.RNo=RNo;
	}

	public static void main(String[] args) {
		Constructor Student1= new Constructor("Uma",101);
		Constructor Student2= new Constructor("Mahesh",102);
		Constructor Student3= new Constructor("Lalitha",103);
		
            
	}	

	
}

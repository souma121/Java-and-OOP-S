abstract class Programming{
	public abstract void Develop();
	public abstract void Rank();
}

abstract class Html extends Programming{
	@Override
	public void Develop()
	{
		System.out.println("HIgh hTml");
	}
}
class D extends Html{
	@Override
	public void Rank()
	{
		System.out.println("3rd");
	}
}

public  class Exam{
	public static void main(String args[]){
		D r=new D();
		r.Develop();
		r.Rank();
	}
}
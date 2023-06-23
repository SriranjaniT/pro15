package pro15;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num=20;
        System.out.println("Factors of: "+num+" are");
        for(int i=1;i<=num;i++)
        {
        	if (num%i==0)
        		System.out.println(i+" ");
        }
	}

}

public class hello{

private int id;
private String name;

hello(int id,String name){
this.id=id;
this.name=name;
}

public void getdata(){

	System.out.println(id+""+name);
}
public static void main(String []s){

	hello h=new hello(1,"hitesh");
	System.out.print(h.getdata());
}
}
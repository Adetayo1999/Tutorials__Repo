

public class Tom{
   private String name;
   private int age;

    public static void main(String[] argument){
           Tom adetayo = new Tom("Tomiwa" , 45);

           System.out.println(adetayo.getSth());
    }
    public Tom(String name , int age){
       this.name = name;
       this.age = age;
    }
    public String getSth(){
        return "Hello "+this.name +" age is "+this.age;
    }
}
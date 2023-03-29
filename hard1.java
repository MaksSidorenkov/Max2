import javax.print.attribute.standard.NumberUpSupported;

public class hard1{
    public static int sum(int a){
       int b = (int)(Math.random()*a) ;
       return b;
    }

    public static void main(String[] args) {
        System.out.println(sum(48));
    }
}


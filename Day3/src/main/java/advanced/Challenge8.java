package advanced;


public class Challenge8 {
    public static void main(String[] args) {

        int i=1,res=0;

        while (i<=5) {
            res = res + i * i;
            i++;
        }
        System.out.println("1² + 2² + 3² + 4² + 5² = "+res);
    }
}

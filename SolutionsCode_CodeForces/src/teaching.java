public class teaching{
    public static void main(String[] args) {
        Test t = new Test();
        t.add(10, 20);
        int result = Test.sum; // accessing variable
        System.out.println("sum = "+result);
    }
}
class Test{
    static int sum;
    void add(int a, int b) {
        sum = a+b;
    }
}

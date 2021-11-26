public class TestWhile {

public static void method(){
    int variable = 7;
    variable = variable > 10 ? variable-10 : variable+10;
    System.out.println(variable);

    int sum = 10;
    for (int i = 10; i < 100; i = i + 10) {
        sum += i;
        System.out.println(sum);
    }

}
}




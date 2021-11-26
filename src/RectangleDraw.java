public class RectangleDraw {

public static void Draw(){
    //rectangle
    int n = 6;
    int m = 11;
    char s = '+';
    String side = "";
    String row = "";
    String wow="";

        for (int i =0; i < m; i++) {
        side = side+ s;
    }
 for (int j =0; j<(m-2); j++){

        wow = wow + " ";}
    row = s+wow+s;

        System.out.print(side);
        System.out.println("");
        for (int k=0; k<n; k++){System.out.println(row);}

        System.out.print(side);
}
}

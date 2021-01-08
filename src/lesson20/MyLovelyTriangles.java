package lesson20;

public class MyLovelyTriangles {
    public static void main(String[] args) {
   firstTriangle(5);
ravnobedrennyiTriangle(5);

}

    private static void ravnobedrennyiTriangle(int line) {
        String stroka = "";
        String star = "*";
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < line; j++) {

            }
           stroka = stroka + star;
           // stroka += star;

            System.out.println(stroka);}


        }


    private static void firstTriangle(int line) {
        String stroka = "";
        String star = "*";
        //stroka += star;
        for (int i = 0; i < line; i++) {
            stroka =  star+ stroka ;
            System.out.println(stroka );
        }
    }
}

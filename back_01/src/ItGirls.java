public class ItGirls {
    public static void main(String[] args){
//        System.out.println("Hello, IT girls!");
        printTypes();
    }
    public static void printTypes(){
/*        char valCh = 'ы';
        char unicodeCh = '\u044b';
//        short b = (short)unicodeCh;
//        System.out.println(b);
        char utfCh = 1099;
        System.out.println(valCh);
        System.out.println(utfCh);
        System.out.println(unicodeCh);

        String str = "String type";
        String newStr = new String("String type");
        System.out.println("str = " + str);
        System.out.println("newStr = " + newStr);

        System.out.println("\nУпаковка примитивов в ссылочные типы\n");
        byte bt;
        bt = 127;
        Byte clBt = Byte.valueOf(bt);
        bt = clBt.byteValue();
        System.out.printf("Byte %s, byte %s\n", clBt, bt);

        double dbl = 3.25;
        Double clDbl;
        clDbl = Double.valueOf(dbl);
        dbl = clDbl.doubleValue() + 1;
        clDbl = dbl;
        System.out.printf("Double %s, double %s\n", clDbl, dbl);*/

        /*System.out.println("Прямоугольник");
        int a = 4;
        int b = 8;
        int square = a * b / 2;
        double c = Math.sqrt(a^2 + b^2);
        DecimalFormat df = new DecimalFormat("#.##");
        double perim = c + a + b;
        if (perim > 15 && square < 30) {
        System.out.printf("square %scm^2, perim %scm\n", square, df.format(perim));
        } else {
            System.out.println("wrong result");
        }

        int b1 = 50;
        int c1 = 20;
        b1++;
        c1--;
        System.out.println(b1 >= 51 || c1 < 22);

        String java = "Training Java";
        Date date = new Date();
        DateFormat datef = new SimpleDateFormat("dd-MM-yyyy");
        System.out.printf("%s %s %s\n", java.length(), java.charAt(4), datef.format(date));
 */
        Programmer alya = new Programmer();
        alya.name = "Alya";
        alya.age = 38;
        alya.weight = 56;
        Programmer andrey = new Programmer("Andrey", 44, 80);
        Programmer julia = new Programmer("Julia", 40, 70);
        alya.print();
        julia.print();
        andrey.print();

        alya.eat(0.2);
        julia.eat(0.3);
        julia.eat(0.4);
        andrey.eat(0.3);
        andrey.eat(0.5);

        Dog milli = new Dog("Milli", 1, 2.5);
        milli.eat(0.1);
        Feeder feeder = new Feeder();
        feeder.feed(milli, 0.25);
        feeder.feed(alya, 0.25);
        feeder.feed(andrey, 0.25);
    }
}

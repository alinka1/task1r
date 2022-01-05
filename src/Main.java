public class Main {
//    Вывести шахматную доску с заданными размерами высоты и ширины, по принципу:
//            *  *  *  *  *  *
//            *  *  *  *  *  *
//            *  *  *  *  *  *
//            *  *  *  *  *  *
//    Программа запускается через вызов главного класса с параметрами.


    public static void main(String[] args) {
        try {
            printChess(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        } catch (Exception exc) {
            System.out.println("Ошибка");
        }
    }

    public static void printChess(int length, int weight) {
        for (int i = 0; i < length; i++) {
            if (i % 2 != 0) {
                System.out.print(" ");
            }
            for (int j = 0; j < weight; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

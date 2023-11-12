import java.util.ArrayList;
import java.util.Scanner;

public class Island {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер острова по вертикали Y : ");
        int y = scanner.nextInt();
        System.out.println();
        System.out.print("Введите размер острова по горизонтали X : ");
        int x = scanner.nextInt();
        System.out.println();
        System.out.println("Имеем остров с размерами : Ширина: " + x + " Высота: " + y);
//        int isl [] [];
//        isl = new int[y][x];
        ArrayList<Integer> islIn = new ArrayList<>();
        int[][] isl = new int[y][x];
        int g = 0;
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                isl[i][j] = g;
                g++;
            }
        }
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(isl[i][j] + " ");
                islIn.add(isl[i][j]);
            }
            System.out.println();
        }
        System.out.println(islIn);


        ArrayList<ArrayList<Animal>> islandOfAnimal = new ArrayList<ArrayList<Animal>>();
    }
}
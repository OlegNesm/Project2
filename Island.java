import java.util.ArrayList;
import java.util.List;
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

        List<AliveEntity> islandOfAnimal = new ArrayList<>();

        List<String> ani = new ArrayList<>();
        ani.add("caterpillar.200");
        ani.add("grass.100");
        ani.add("bear.5");
        ani.add("boa.30");
        ani.add("buffalo.10");
        ani.add("deep.20");
        ani.add("duck.200");
        ani.add("eagle.20");
        ani.add("fox.30");
        ani.add("goat.140");
        ani.add("horse.20");
        ani.add("mouse.500");
        ani.add("rabbit.150");
        ani.add("sheep.140");
        ani.add("wolf.30");
        ani.add("boar.50");
//        System.out.println(ani);

//      fillTheIsland(ani, islandOfAnimal);
        System.out.println(islandOfAnimal);

    }
    public static void fillTheIsland (List<String>  ani, List<AliveEntity> lists) {
        for (int i = 0; i < ani.size(); i++) {
            String s = ani.get(i);
//            System.out.println(s);
            String s1 = s.substring(0, s.indexOf('.'));  // вытягиваю наименование животного
//            System.out.println(s1);
            String s2 = s.substring(s.indexOf('.')+1); // вытягиваю его мах популяцию
//            System.out.println(s2);
//            System.out.println();
//            int population = Integer.parseInt(s2); //
//            System.out.println(population);
            double pop = Math.random()* (Integer.parseInt(s2)) ; // получаю рандомное значение для заселения
            int popReliz = (int) pop; // преобразую дабл в инт
//            System.out.println(popReliz);
            for (int j = 0; j <popReliz ; j++) {
                lists.add(Fabrica.createEntity(s1));
            }

        }

    }


}
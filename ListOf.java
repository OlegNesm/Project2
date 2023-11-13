import java.util.ArrayList;
import java.util.List;

public class ListOf {


    public static void main(String[] args) {
         List<ArrayList<Integer>> examList = new ArrayList<>() ;

        for (int i = 0; i < 3; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
                for (int k = 0; k <5 ; k++) {
                    temp.add(i+k);
                }
            examList.add(temp);

            System.out.println(examList);

        }
        System.out.println(examList);
    }
}

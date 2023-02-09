import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class main {
    public static void main(String[] args) {
//1 Объявить два списка список ArrayList, в каждый добавить по 20 случайных чисел.
// Удалить из первого списка элементы отсутствующие во втором списке.
// Отсортировать первый список методом sort класса Collections.

        ArrayList<Integer> list = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 20; i++){
            list.add(rnd.nextInt(10));
        }
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        Random rnd2 = new Random();
        for (int j = 0; j<20; j++){
            list2.add(rnd2.nextInt(10));
        }
        System.out.println(list2);

        list.retainAll(list2);
        System.out.println(list);

        list.sort(new Comparator<Integer>() {
                      @Override
                      public int compare(Integer o1, Integer o2) {
                          return o1-o2;
                      }
                  }); System.out.println(list);

//2 * Отсортировать второй список методом sort списка и компаратором по уменьшению.
        list2.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(list2);

//3 **Отсортировать первый список пузырьковой сортировкой самостоятельно, без использования доп методов и классов.
        int [] list1 = new int [list.size()];
        for (int i =0; i<list.size();i++){
            list1[i] = list.get(i);
        } System.out.println(Arrays.toString(list1));
        int index = list1.length-1;
        System.out.println(index);
        while (index > 0) {
            for ( int i = 0; i < index; i++) {
                int tmp = 0;
                if (list1[i] <= list1[i+1]) {
                    tmp = list1[i];
                    list1[i] = list1[i + 1];
                    list1[i + 1] = tmp;
                }

                System.out.println(Arrays.toString(list1));
            }return;
        }

    }
}

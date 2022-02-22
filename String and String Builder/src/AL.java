import java.util.ArrayList;

public class AL {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list +"->"+ list.size());
        list.add(10);
        System.out.println(list +"->"+ list.size());
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(2,25);
        System.out.println(list +"->"+ list.size());

        int val = list.get(1);
        System.out.println(val);


        list.set(1,10000);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        ArrayList<String> list2 = new ArrayList<>();

        list2.add("Priyansh sharma");
        list2.add("Shreyansh sharma");
        list2.add("Nishal Purohit ");
        list2.add("Palak purohit");
        list2.add("Shivani sharma");
        list2.add("Pragya purohit");

        list2.get(5);
        System.out.println(list2);

        for (int i=0; i<list.size();i++){
            int val1 = list.get(i);
            System.out.println(val1);
        }

        for (String val2 : list2){
            System.out.println(val2);
        }



    }
}

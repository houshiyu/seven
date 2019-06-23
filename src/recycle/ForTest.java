package recycle;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ForTest {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0;i<10;i++){
            list.add( new Integer(i*i));
        }

        System.out.println(list.size());
        System.out.println(list.get(7));

        //for 循环
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        int index = 0;
        while(index < list.size()){
            System.out.println(list.get(index));
            index++;
        }


        index = 0;
        do{
            System.out.println(list.get(index));
            index++;
        } while (index<list.size());

        for(Integer num : list){
            System.out.println(num);
        }

    }
}

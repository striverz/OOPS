package _08InnerClasses;

import java.util.ArrayList;

public class _05AnonymousWithInbuiltCollections {
    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<>(){
            @Override
            public boolean add(Integer num){
                System.out.println("The value is "+num);
                return true;
            }

        };

        arr.add(12);


    }
}

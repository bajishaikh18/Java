package Annotations;

import java.util.ArrayList;

public class SupressWarnings {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList rawList = new ArrayList();
        rawList.add("Hello");

        ArrayList<String> stringArrayList = rawList;
        System.out.println(stringArrayList.get(0));
    }
}

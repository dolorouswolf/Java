/*
 * Copyright (c) 2017. zminds@163.com All Rights Reserved.
 */

package offer;import java.util.*;

/**
 * Created by rodney on 19/02/2017.
 */
public class Jihe {
    public static void main(String[] args) {
        Set<String> ss = new HashSet<>(100);
        ss.add("123");
        ss.add("123");
        ss.remove("123");
        for (Iterator<String> iterator = ss.iterator(); iterator.hasNext(); ) {
            String next = iterator.next();
            System.out.println(next);
        }
        System.err.println(ss.size());

        Set<String> st = new TreeSet<>();
        st.add("sss");
        st.add("sss");
        st.remove("sss");
        System.err.println(st.size());

        for (Iterator<String> iterator = st.iterator(); iterator.hasNext(); ) {
            String next = iterator.next();
            System.out.println(next);
        }

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("123");
        arrayList.add("123");
        arrayList.add(null);
//        for (Iterator<String> iterator = arrayList.iterator(); iterator.hasNext(); ) {
//            String next = iterator.next();
//            System.out.println(next);
//        }
        System.err.println(arrayList.size());

        for (ListIterator<String> iterator = arrayList.listIterator(arrayList.size()); iterator.hasPrevious(); ) {
            String next = iterator.previous();
            System.out.println(next);

        }

        HashMap<String,String> hashMap= new HashMap<>(10);
        hashMap.put("123","321");
        hashMap.put(null,null);
        System.out.println(        hashMap.get("123"));
        System.out.println(hashMap.containsKey(null));
        hashMap.put("123","ffasdf");
        System.out.println(hashMap.size());
        System.out.println(        hashMap.get("123"));
//        hashMap.clear();
        System.out.println(hashMap.size());
        System.out.println(        hashMap.containsValue("ffasdf"));
        HashMap<String,String> hashMap1= (HashMap<String, String>) hashMap.clone();
        System.out.println(hashMap1.isEmpty());



        Hashtable<String,String> hashtable = new Hashtable<>();
//        hashtable.put(null,null);
        System.out.println(hashtable.size());
    }


}



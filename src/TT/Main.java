package TT;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {


    private static ArrayList convertirIntToString(ArrayList arr) {
        ArrayList<String> sArr= new ArrayList();
        for (int i = 0; i < arr.size(); i++) {
            String s = String.valueOf(arr.get(i));
            sArr.add(s);
        }
        return sArr;
    }

    private static ArrayList convertirStringToInt(ArrayList<String> arr) {
        ArrayList<Integer> iArr= new ArrayList();
        for (int i = 0; i < arr.size(); i++) {
            int n = Integer.valueOf(arr.get(i));
            iArr.add(n);
        }
        return iArr;
    }

    private static void igualarCifras(ArrayList<String> sArr,int maxCifras){

        for (int i = 0; i < sArr.size(); i++) {
            sArr.set(i, StringUtil.rPad(sArr.get(i), '0', maxCifras));
        }
    }

    private static int contarCifras(ArrayList<String> sArr){
        int a = 0;

        for (int i = 0; i < sArr.size(); i++) {
            if(sArr.get(i).length() > a) a=sArr.get(i).length();
        }

        return a;
    }

    private static void ordenarEnListas(ArrayList<String> sArr, int x, int maxCifras){

        ArrayList<String> l0 = new ArrayList<>();
        ArrayList<String> l1 = new ArrayList<>();
        ArrayList<String> l2 = new ArrayList<>();
        ArrayList<String> l3 = new ArrayList<>();
        ArrayList<String> l4 = new ArrayList<>();
        ArrayList<String> l5 = new ArrayList<>();
        ArrayList<String> l6 = new ArrayList<>();
        ArrayList<String> l7 = new ArrayList<>();
        ArrayList<String> l8 = new ArrayList<>();
        ArrayList<String> l9 = new ArrayList<>();


        for (int i = 0; i < sArr.size(); i++) {
            switch (sArr.get(i).charAt(maxCifras - x)){
                case '0': {
                    l0.add(sArr.get(i));
                    break;
                }
                case '1': {
                    l1.add(sArr.get(i));
                    break;
                }
                case '2': {
                    l2.add(sArr.get(i));
                    break;
                }
                case '3': {
                    l3.add(sArr.get(i));
                    break;
                }
                case '4': {
                    l4.add(sArr.get(i));
                    break;
                }
                case '5': {
                    l5.add(sArr.get(i));
                    break;
                }
                case '6': {
                    l6.add(sArr.get(i));
                    break;
                }
                case '7': {
                    l7.add(sArr.get(i));
                    break;
                }
                case '8': {
                    l8.add(sArr.get(i));
                    break;
                }case '9': {
                    l9.add(sArr.get(i));
                    break;
                }

            }


        }


        sArr.removeAll(sArr);

        sArr.addAll(l0);
        sArr.addAll(l1);
        sArr.addAll(l2);
        sArr.addAll(l3);
        sArr.addAll(l4);
        sArr.addAll(l5);
        sArr.addAll(l6);
        sArr.addAll(l7);
        sArr.addAll(l8);
        sArr.addAll(l9);

        //System.out.println(sArr);
    }

    public static ArrayList radixSort(ArrayList<Integer> arr){
        ArrayList<String> sArr = convertirIntToString(arr);
        int maxCifras = contarCifras(sArr);
        igualarCifras(sArr, maxCifras);
        for (int i = 1; i <= maxCifras; i++) {
            ordenarEnListas(sArr, i, maxCifras);
        }
        arr.removeAll(arr);
        arr = convertirStringToInt(sArr);

        return arr;
        
    }

    public static void main(String[] args) {

        ArrayList arr=  new ArrayList(Arrays.asList(3, 673, 106, 45, 2,23));

        arr = radixSort(arr);

        System.out.println("\n");

        ArrayList arr2=  new ArrayList(Arrays.asList(3, 6734, 106, 54, 33333, 24, 12313, 45, 2,23));

       arr2= radixSort(arr2);

        ArrayList arr3=  new ArrayList(Arrays.asList(3, 6, 1, 5, 2,8));

        arr3 = radixSort(arr3);

        System.out.println("arr = " + arr);
        System.out.println("\narr2 = " + arr2);
        System.out.println("\narr3 = " + arr3);

    }
}

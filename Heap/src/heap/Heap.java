/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author ZEDAIRX
 */
public class Heap {
public static void Heap(Integer[] arr, int k)
    {
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < k; i++)
            System.out.print(arr[i] + " ");
    }
  public static ArrayList<Integer> Heap(int[] arr, int k)
    {
        Integer[] obj_array = Arrays.stream( arr ).boxed().toArray( Integer[] :: new);
        Arrays.sort(obj_array, Collections.reverseOrder());
        ArrayList<Integer> list = new ArrayList<>(k);
 
        for (int i = 0; i < k; i++)
            list.add(obj_array[i]);
     
        return list;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer arr[] = new Integer[] { 1, 12, 52, 7, 35, 36, 77 };
        int k = 7;
        Integer arr[] = new Integer[] { 3, 23, 63, 8, 46, 38, 85 };
        int k = 7;
        Integer arr[] = new Integer[] { 5, 34, 74, 9, 57, 39, 93 };
        int k = 7;
        Heap(arr, k);

        int[] prim_array = { 1, 12, 52, 7, 35, 36, 77, 3, 23, 63, 8, 46, 38, 85, 5, 34, 74, 9, 57, 39, 93 };
          System.out.print(Heap(prim_array, k));

    }
    
}

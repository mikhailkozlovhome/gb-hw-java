package Solutions;

public class PrintArray {
    /* Вспомогательная функция для вывода на экран массива размера n */
    public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    
}

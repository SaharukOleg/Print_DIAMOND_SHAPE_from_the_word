public class Program {
    public static void main(String[] args) {
        char[] arr = "titani".toCharArray();
        for (int i = 0; i < (arr.length % 2 == 1 ? arr.length : arr.length - 1); i++) { 
            for (int j = 0; j < arr.length; j++) {
                if (i <= (arr.length % 2 == 1 ? arr.length / 2 : arr.length / 2 - 1)) {
                    if ((j < arr.length / 2 - ((arr.length % 2 == 1) ? i : i + 1) || (j > arr.length / 2 + i))) {
                        System.out.print(" ");
                    } else {
                        System.out.print(arr[j]);
                    }
                } else {
                    if ((j <= -(arr.length / 2 - (arr.length % 2 == 0 ? i : i - 1))
                            || (j >= arr.length / 2 + (arr.length - (arr.length % 2 == 0 ? i + 1 : i))))) {
                        System.out.print(" ");
                    } else {
                        System.out.print(arr[j]);
                    }
                }
                System.out.println();
            }
        }
    }
}






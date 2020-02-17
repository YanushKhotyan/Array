package by.htp.jd5.array;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.Random;

public class Array {

    public static void main(String[] args) {

        printSum(taskOne(4, 20));
        printArray(taskTwo(20));
        System.out.println("");
        taskThree();
        taskFour();
        taskFive(15);
        taskSix(14);
        taskSeven(45, 30);
        System.out.println("");
        taskEight(100);
        taskNine();
        taskTen();
        taskEleven();
        taskTwelve();
        taskThirteen(3, 2, 50);
        taskFourTeen();
        taskFiveTeen(2, 10);
        taskSixTeen();
        taskSeventeen();

        taskNineteen();
        taskTwenty();
    }

    private static int[] array;

    public static int[] initAdvancedArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] = advancedRandom();
        }
        return array;
    }

    public static int[] initAdvancedArrayV2(int a) {
        for (int i = 0; i < array.length; i++) {
            array[i] = advancedRandomV2(a);
        }
        return array;
    }

    public static int[] initArray(int n) {
        array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = random(n);
        }
        return array;
    }

    private static int random(int a) {
        int b = (int) (Math.random() * a);
        return b;
    }

    private static int advancedRandom() {
        int b = (int) (Math.random() * (200 + 1)) - 100;
        return b;
    }

    private static int advancedRandomV2(int a) {
        int b = (int) (Math.random() * (a + a + 1)) - a;
        return b;
    }

    /**
     * 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
     */
    public static int taskOne(int k, int n) {
        array = initArray(n);
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % k == 0) {
                temp += array[i];
            }
        }
        return temp;
    }

    private static void printSum(int sum) {
        System.out.println("Sum is " + sum);
    }

    private static void printArray(int[] _array) {
        System.out.print("Array [");
        for (int value : _array) {
            System.out.print(" " + value + " ");
        }
        System.out.print("]");
    }

    /**
     * 2. В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов.
     */
    public static int[] taskTwo(int a) {
        array = initArray(a);
        int[] nullArray;
        int b = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                b++;
            }
        }
        return nullArray = new int[b];
    }

    /**
     * 3. Дана последовательность целых чисел а1 а2,..., аn . Выяснить, какое число встречается раньше - положительное или
     * отрицательное.
     */
    public static void taskThree() {
        array = initAdvancedArray();
        if (array[0] >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    /**
     * 4. Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она возрастающей.
     */
    public static boolean taskFour() {
        array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // array = initAdvancedArray();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                if (array[i] > array[j]) {
                    System.out.println("Последовательность не возрастающея. ");
                    return false;
                }
            }
        }
        System.out.println("Последовательность возрастающея.");
        return true;
    }

    /**
     * 5. Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из четных чисел этой последовательности.
     * Если таких чисел нет, то вывести сообщение об этом факте.
     */
    public static void taskFive(int a) {
        array = initArray(a);
        int[] _array = getTemp(array);
        int b = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                _array[b] = array[i];
                b++;
            }
        }

        if (_array == null) {
            System.out.println("В массиве нет четных чисел");
        }
        System.out.println(Arrays.toString(_array));
    }

    public static int[] getTemp(int[] _array) {
        int b = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                b++;
            }
        }
        int[] array = new int[b];
        return array;
    }

    /**
     * 6. Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину числовой оси, содержащую все эти числа.
     */
    public static void taskSix(int a) {
        array = initArray(a);
        int min = 5;
        int max = 5;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Из точки " + min + " " + max);
    }

    /**
     * 7. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим числом.
     * Подсчитать количество замен.
     */
    public static void taskSeven(int a, int z) {
        array = initArray(a);
        for (int i = 0; i < array.length; i++) {
            if (array[i] > z) {
                array[i] = z;
            }
        }
        printArray(array);
    }

    /**
     * 8. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
     * положительных и нулевых элементов.
     */
    public static void taskEight(int n) {
        array = initAdvancedArrayV2(n);
        int tempPlus = 0;
        int tempMinus = 0;
        int tempZero = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                tempPlus++;
            } else if (array[i] < 0) {
                tempMinus++;
            } else if (array[i] == 0) {
                tempZero++;
            }
        }
        System.out.println("В массиве " + tempMinus + " отрицательных, " + tempPlus + " положительных и " + tempZero + " нулевых элементов.");
    }

    /**
     * 9. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
     */
    public static void taskNine() {
        array = initAdvancedArray();
        int min = 0;
        int minIndex = 0;
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
        array[minIndex] = max;
        array[maxIndex] = min;
    }

    /**
     * 10. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
     */
    public static void taskTen() {
        array = initAdvancedArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                int a = array[i];
                System.out.print(" , " + a);
            }
        }
    }

    /**
     * 11. Даны натуральные числа а1 ,а2 ,..., аn . Указать те из них, у которых остаток от деления на М равен L (0 < L < М-1).
     */
    public static void taskEleven() {
        array = initAdvancedArray();
        for (int i = 0; i < array.length; i++) {
            int m = 5;
            int l = 0;
            l = array[i] % m;
            if (0 < l && l < m - 1) {
                l = array[i];
                System.out.print(" , " + l);
            }
        }
    }

    /**
     * 12. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых являются
     * простыми числами.
     */
    public static void taskTwelve() {
        double[] arr = new Random().doubles(50, 0., 20.).toArray();
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(i)) {
                sum += arr[i];
            }
        }
        System.out.println("");
        System.out.println("Sum: " + sum);
    }

    public static boolean isPrime(int x) {
        if (x < 2) return false;
        int temp;
        for (int i = 2; i <= x / 2; i++) {
            temp = x % i;
            if (temp == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 13. Определить количество элементов последовательности натуральных чисел, кратных числу М и заключенных в
     * промежутке от L до N.
     */
    public static void taskThirteen(int l, int m, int n) {
        array = initAdvancedArray();
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % m == 0) {
                if (l < array[i] && array[i] < n)
                    temp++;
            }
        }
        System.out.print("Количество элементов равно " + temp);
    }

    /**
     * 14. Дан одномерный массив A[N]. Найти
     */
    public static void taskFourTeen() {
        array = initAdvancedArray();

        int min = 0;
        int max = 0;

        int[] chetArray = getChetNeChetArray(0);
        int[] neChetArray = getChetNeChetArray(1);


        for (int i = 0; i < chetArray.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        for (int i = 0; i < neChetArray.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        int sum = max + min;
        System.out.println("");
        System.out.println("Sum " + sum);

    }

    public static int[] getChetNeChetArray(int a) {
        int temp = 0;

        int[] generateArray = new int[array.length];

        for (int i = a; i < array.length; i += 2) {
            generateArray[temp] = array[i];
            temp++;
        }
        return generateArray;
    }

    /**
     * 15. Дана последовательность действительных чисел a...  Указать те ее элементы, которые принадлежат отрезку [с, d].
     */
    public static void taskFiveTeen(int c, int d) {
        array = initAdvancedArray();

        for (int i = c; i < d; i++) {

            System.out.print(" , " + array[i]);
        }
        System.out.println(" ");
    }

    /**
     * 16. Даны действительные числа
     */
    public static void taskSixTeen() {
        array = initAdvancedArray();

        int maxSum = array[0] + array[array.length - 1];

        for (int i = 1; i < array.length / 2; i++) {

            if ((array[i] + array[array.length - i - 1]) > maxSum) {

                maxSum = array[i] + array[array.length - i - 1];
            }

        }
        System.out.println("maxSum " + maxSum);
    }

    /**
     * 17. Дана последовательность целых чисел Образовать новую последовательность, выбросив из исходной
     * те члены, которые равны
     */
    public static void taskSeventeen() {
        array = initAdvancedArray();
        int min = 0;

        int[] newArray = new int[array.length];
        int temp = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
            } else {
                newArray[temp] = array[i];
                temp++;
            }
        }
        printArray(newArray);
    }

    /**
     * 18*. «Суперзамок». Секретный замок для сейфа состоит из 10 расположенных в рад ячеек, в которые надо вставить
     * игральные кубики. Но дверь открывается только в том случае, когда в любых трех соседних ячейках сумма точек на
     * передних гранях кубиков равна 10. (Игральный кубик имеет на каждой грани от 1 до 6 точек). Напишите программу,
     * которая разгадывает код замка при условии, что два кубика уже вставлены в ячейки.
     */


    /**
     * 19. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких чисел
     * несколько, то определить наименьшее из них.
     */
    public static void taskNineteen() {
        array = initAdvancedArray();
        int[] popular = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    popular[i]++;
                }
            }
        }

        int valResult = array[0];
        int popResult = popular[0];
        for (int i = 0; i < popular.length; i++) {
            if (popular[i] > popResult) {
                popResult = popular[i];
                valResult = array[i];
            }
            if ((popResult == popular[i]) && (array[i] < valResult)) {
                valResult = array[i];
            }
        }
        System.out.println("Популярное число "+valResult);

    }

    /**
     * 20. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй элемент
     * (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
     */
    public static void taskTwenty(){
        array = initAdvancedArray();

        for(int i = 0; i < array.length; i+=2){
            array[i] = 0;
        }
        printArray(array);
    }
}


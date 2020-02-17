package massSort;

/**
 * @author khotyan.y <br />
 * Copyright 2020 Ifuture Plc. All rights reserved.
 * <p>
 * TODO: add description
 */
public class ArrayPartTwo
{
    public static void main(String[] args)
    {
        printArray(taskOne());
        System.out.println("\n" + "-------------");
        printArray(randomArray(2, 3));
        System.out.println("\n" + "-------------");
        taskThree(3, 4);
        System.out.println("\n" + "-------------");
        taskFour(3, 4);
        System.out.println("\n" + "-------------");
        taskFive(8, 3);
        System.out.println("\n" + "-------------");
        taskSix(8, 4);
        System.out.println("\n" + "-------------");
        taskSeven(5, 5);
        System.out.println("\n" + "-------------");
        taskEight(10, 10);
        System.out.println("\n" + "-------------");
        taskNine(2, 2);
        System.out.println("\n" + "-------------");
        taskTen(2, 3); // not done
        System.out.println("\n" + "-------------");
        System.out.println("\n" + "Eleven");
        taskEleven();
        System.out.println("\n" + "-------------");
        taskTwelve(6);
        System.out.println("\n" + "-------------");
        taskThirteen(4);
        System.out.println("\n" + "-------------");
        taskFourteen(6);
        System.out.println("\n" + "-------------");
        taskFifteen(6);
        System.out.println("\n" + "-------------");
        taskSixteen(6);
        System.out.println("\n" + "-------------");
        taskSeventeen(6);
        System.out.println("\n" + "-------------");
        taskEighteen(6);
        System.out.println("\n" + "-------------");
        taskNineteen(6); // not done
        System.out.println("\n" + "-------------");
    }

    public static void printArray(int[][] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.println("\n");
            for (int j = 0; j < array[i].length; j++)
            {
                System.out.print(array[i][j] + "\t");
            }
        }
    }

    /**
     * 1. Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной строке была ровно одна единица, и
     * вывести на экран.
     */
    public static int[][] taskOne()
    {
        int[][] array = {{1, 0, 1}, {1, 0, 0}, {1, 1, 1}, {0, 0, 0}};
        return array;
    }

    /**
     * 2. Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами из [0, 9].
     */
    public static int[][] randomArray(int a, int b)
    {
        int[][] array = new int[a][b];

        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {

                array[i][j] = (int) (Math.random() * (200 + 1)) - 100;
            }
        }
        return array;
    }

    /**
     * 3. Дана матрица. Вывести на экран первый и последний столбцы.
     */
    public static void taskThree(int a, int b)
    {
        int[][] array = randomArray(a, b);

        for (int i = 0; i < array.length; i++)
        {
            System.out.println("\n");
            for (int j = 0; j < array[i].length; j += b - 1)
            {
                System.out.print(array[i][j] + "\t");
            }
        }
    }

    /**
     * 4. Дана матрица. Вывести на экран первую и последнюю строки.
     */
    public static void taskFour(int a, int b)
    {
        int[][] array = randomArray(a, b);

        for (int i = 0; i < array.length; i += a - 1)
        {
            System.out.println("\n");
            for (int j = 0; j < array[i].length; j++)
            {
                System.out.print(array[i][j] + "\t");
            }
        }
    }

    /**
     * 5. Дана матрица. Вывести на экран все четные строки, то есть с четными номерами.
     */
    public static void taskFive(int a, int b)
    {
        int[][] array = randomArray(a, b);

        for (int i = 0; i < array.length; i += 2)
        {
            System.out.println("\n");
            for (int j = 0; j < array[i].length; j++)
            {
                System.out.print(array[i][j] + "\t");
            }
        }
    }

    /**
     * 6. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
     */
    public static void taskSix(int a, int b)
    {
        int[][] array = randomArray(a, b);

        for (int i = 1; i < array.length; i += 2)
        {
            System.out.println("\n");
            for (int j = 0; j < array[i].length; j++)
            {
                if (array[i][j] > array[i][j += b - 1])
                {
                    System.out.print(array[i][j] + "\t");
                }
            }
        }
    }

    /**
     * 7. Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных элементов
     */
    public static void taskSeven(int a, int b)
    {
        int[][] array = randomArray(a, b);
        int sum = 0;
        for (int i = 1; i < array.length; i++)
        {
            System.out.println("\n");
            for (int j = 0; j < array[i].length; j++)
            {
                if (array[i][j] < 0 && array[i][j] % 2 != 0)
                {
                    sum += Math.abs(array[i][j]);
                    System.out.print(array[i][j] + "\t");
                }
            }
        }
    }

    /**
     * 8. Дан двухмерный массив n×m элементов. Определить, сколько раз встречается число 7 среди элементов
     * массива.
     */
    public static void taskEight(int a, int b)
    {
        int[][] array = randomArray(a, b);
        int temp = 0;
        for (int i = 1; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                if (array[i][j] == 7)
                {
                    temp++;
                }
            }
        }
        System.out.println(temp);
    }

    /**
     * 9. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
     */
    public static void taskNine(int a, int b)
    {
        int[][] array = randomArray(a, b);
        printArray(array);
        System.out.println("");
        System.out.print("-------");
        for (int i = 0; i < array.length; i++)
        {
            System.out.println("\n");
            for (int j = 0; j < array[i].length; j += 2)
            {
                System.out.print(array[i][i] + "\t");
            }
        }
    }

    /**
     * 10. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
     */
    public static void taskTen(int a, int b)
    {
        int[][] array = randomArray(5, 5);
        for (int i = a; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                System.out.print(array[i][j] + "\t");
            }
        }
        for (int i = 0; i < array.length; i++)
        {
            System.out.println("\n");
            for (int j = b; j < array[i].length; j++)
            {
                if (array[i][j] == array[a][j] || array[i][j] == array[i][b])
                    System.out.print(array[i][j] + "\t");
            }
        }
    }

    /**
     * 11. Дана матрица размера m x n. Вывести ее элементы в следующем порядке: первая строка справа налево, вторая
     * строка слева направо, третья строка справа налево и так далее.
     */
    public static void taskEleven()
    {
        int[][] array = randomArray(5, 5);

        for (int i = 0; i < array.length; i++)
        {
            if (i % 2 == 0)
            {
                for (int j = array[0].length - 1; j >= 0; j--)
                {
                    System.out.print(array[i][j] + " ");
                }
            }
            else
            {
                for (int j = 0; j < array[0].length; j++)
                {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println("");
        }
    }


    /**
     * 12. Получить квадратную матрицу порядка n:
     */
    public static void taskTwelve(int n)
    {
        int[][] array = new int[n][n];
        int temp = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (i != 0)
            {
                temp++;
            }
            for (int j = 0; j < array[i].length; j++)
            {

                array[i][i] = temp;
            }
        }
        printArray(array);
    }

    /**
     * 13. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
     */
    public static void taskThirteen(int n)
    {
        int[][] array = new int[n][n];
        int temp = n;

        for (int i = 0; i < array.length; i++)
        {

            if (i % 2 == 0)
            {
                for (int j = 0; j < array[i].length; j++)
                {

                    array[i][j] = j + 1;
                }
            }
            else
            {
                for (int j = 0; j < array.length; j++)
                {

                    array[i][j] = temp;
                    temp--;
                }
                temp = n;
            }

        }
        printArray(array);
    }

    /**
     * 14. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
     */
    public static void taskFourteen(int n)
    {
        int[][] array = new int[n][n];

        int temp = 1;
        int tempValue = n - 1;
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                if (j == tempValue)
                {
                    array[i][tempValue] = temp;
                    temp++;
                    tempValue--;
                }
            }
        }
        printArray(array);
    }

    /**
     * 15. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
     */
    public static void taskFifteen(int n)
    {
        int[][] array = new int[n][n];

        int temp = n;
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                if (i == j)
                {
                    array[i][i] = temp;
                    temp--;
                }
            }
        }
        printArray(array);
    }

    /**
     * 16. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
     */
    public static void taskSixteen(int n)
    {
        {
            int[][] array = new int[n][n];
            int temp = 1;
            int tempTwo = 2;
            for (int i = 0; i < array.length; i++)
            {
                temp++;
                tempTwo++;
                for (int j = 0; j < array[i].length; j++)
                {
                    array[i][i] = temp * tempTwo;
                }
            }
            printArray(array);
        }
    }

    /**
     * 17. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
     */
    public static void taskSeventeen(int n)
    {
        {
            int[][] array = new int[n][n];
            int temp = 1;
            int tempTwo = n - 1;

            for (int i = 0; i < array.length; i++)
            {
                for (int j = 0; j < array[i].length; j++)
                {
                    if (array[i][j] == array[0][j] || array[i][j] == array[i][0])
                    {
                        array[i][j] = temp;
                    }
                    else if (array[i][j] == array[i][tempTwo])
                    {
                        array[i][tempTwo] = temp;
                    }
                    else if (array[i][j] == array[tempTwo][j])
                    {
                        array[tempTwo][j] = temp;
                    }

                }
            }
            printArray(array);
        }
    }

    /**
     * 18. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
     */
    public static void taskEighteen(int n)
    {
        int[][] array = new int[n][n];
        int temp = 0;
        int tempTwo = n + 1;

        for (int i = 0; i < array.length; i++)
        {
            temp++;
            tempTwo--;
            for (int j = 0; j < tempTwo; j++)
            {
                array[i][j] = temp;
            }
        }
        printArray(array);
    }

    /**
     * 19. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
     */
    public static void taskNineteen(int n)
    {
        int[][] array = new int[n][n];

        for (int i = 0; i < array.length; i++)
        {

            for (int j = 0; j < array[i].length; j++)
            {

            }
        }
        printArray(array);
    }
}


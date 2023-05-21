# Week 3 Practice

1. What output is produced by the following statement? Explain.
    
    System.out.println ("50 plus 25 is " + 50 + 25);

2. What is the output produced by the following statement? Explain.

    System.out.println ("He thrusts his fists\n\tagainst" + " the post\nand still insists\n\the sees the \"ghost\"");

3. Given the following declarations, what result is stored in each of the listed assignment statements?

    int iResult, num1 = 15, num2 = 18, num3 = 13, num4 = 4; double fResult, val1 = 14.0, val2 = 3.3;
    
    `iResult = num3 / num4;`
    `fResult = num3 / num4;`
    `fResult = val1 / num4;`
    `fResult = (double) num3 / num4;`
    `fResult = (double) (num2 / num3);`
    `iResult = num3 % num4;`

4. What is wrong with the following code fragment? Rewrite it so that it produces correct output.
    ```
    if (total == MAX)
        if (total < sum)
            System.out.println ("total == MAX and is < sum.");
        else
            System.out.println ("total is not equal to MAX");
    ```
5. What output is produced by the following code fragment?
    ```
    int num = 1, max = 20;
    while (num < max)
    {
        if (num%2 == 0)
        System.out.println (num);
        num++;
    }
    ```
6. What output is produced by the following code fragment?
    ```
    for (int num = 0; num <= 200; num += 2)
        System.out.println (num);
    ```
7. What output is produced by the following code fragment?
    ```
    for (int val = 200; val >= 0; val -= 1)
        if (val % 4 != 0)
            System.out.println (val);
    ```
8. Transform the following while loop into a for loop (make sure it produces the same output).
    ```
    int num = 1;
    while (num < 20)
    {
        num++;
        System.out.println (num);
    }
    ```
9. What is wrong with the following code fragment? What are three distinct ways it could be changed to remove the flaw?
    ```
    count = 50;
    while (count >= 0)
    {
        System.out.println (count);
        count = count + 1;
    }
    ```

10. What does the following program segment do?
    ```
    final int LIMIT = 5;
    int count = 0;
    do
    {
        count = count + 1;
        System.out.println (count);
    }
    while (count < LIMIT);
    System.out.println ("Done");
    ```
# Sort Methods Assignment

For this project your will analyze the performance of three sorting methods: Selection Sort, Bubble Sort and Merge Sort. The performance analysis will be based on the number of comparisons required to sort integer arrays of various sizes. To gather sufficient data, sort arrays containing 2,000, 4,000, 6,000, 8,000, and 10,000 integers. Each array must contain randomly generated values over the range 0.0  n < 10,000.0. For valid comparison sort the same array by each method. (Use the copyArray method from the Selection Sort Lab to make copies of an integer array.) Gather data for each method for each array size at least three times. For example, data should be gathered for the Selection Sort on an array of 6,000 integers at least three times. (Refer to the Selection Sort Lab, pp 506-509 for Selection Sort, pp 510-511 for Bubble Sort and pp 513-520 for Merge Sort.) Similar to the Selection Sort lab, implement each sorting method in the SortMethod class.

Plot a graph of your results using the spreadsheet provided. The graph will compare array size versus number of comparisons. Use the average of the three runs of each method for each array size. For example, average the three values collected for the Selection Sort on a 4,000-integer array. Each run must sort a different randomly-generated array. Connect the data points for each method. Clearly label the plot for each method. Also graph the theoretical average case performance for each method. For example, Selection Sort has an average case performance of n2 where n is the size of the array. An array of size 2,000 performs approximately 4,000,000 comparisons. The graph and the data collected to support it must be submitted with the project.

Review your data and graph to answer the following question. Submit your answers with your data and graph spreadsheet.
1. Which of the sorting methods that you implemented performs best? Briefly explain you answer.
2. Which of the sorting methods that you implemented performs worst? Briefly explain your answer.
3. How does the data gathered for each sort method you implemented compare to its theoretical performance? Assuming the theoretical performance differs from the data gathered, explain the purpose of theoretical performance.

Grading for this project will be based on
- implementation (60%),
- data and graph spreadsheet, and questions in a text document (20%), and
- readability (20%).

To obtain any portion of implementation you must submit a program that compiles and executes all or some subset to the project. You will receive 20% for each sort method you successfully implement as detailed above. The results graph must be submitted with your final project code. For readability, make sure your code is properly formatted with appropriate comments throughout.
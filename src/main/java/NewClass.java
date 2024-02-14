public class NewClass {
    public static int getLargest(int arr[], int sz) {
        int iterate1 = 0;
        int iterate2 = 0;
        int largest = 0;
        //The first 3 lines are to initialize the 3 variables/iterations 1 and 2 and the third line is the variable which will store the largest
        //First 3 lines will execute once

        while (iterate1 < sz - 1) {
            iterate2++;
            //The while loop while execute 1 less than "sz times"
            if (iterate2 == sz) { //nested if loop is inside the while loop so everytime the outer loop iterates than the intner loop will iterate sz or n times

                iterate1++;
                iterate2 = iterate1;
                continue;
            }
            int product = arr[iterate1] * arr[iterate2]; //Will iterate line once to initialize
            if (product > largest)
                largest = product;
        }
        return largest;
    }
}
//Because there is a nested loop, this will call for the quadratic equation, making O(n) become O(sz^2), where sz in this problem represents n
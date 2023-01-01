public class TimerService {
    // we want a way to perform an operation on a series of numbers
    /**
     * return a string containing numbers from 0 to 'number'
     * eg, when numdber is 5 return 
     * 0 1 2 3 4 5
     * @param number
     * @return
     */
    public String count(int number){
        String buildString = "";
        /**
         * my for loop created a variable named i that is of value 0 when the loop is encountered for the first time.
         * the for loop runs the code contained within so long as the condition i < number is true.
         * at the end of every iteration of the for loop, i is incremented.
         */
        for(int i = 0; i <= number; i++){
            buildString = buildString + i + " ";
           // System.out.println(buildString);

        }
        return buildString;
    }
    // method overloading
    public String count(int start, int end){
        String buildString = "";
        for(int i = start; i <= end; i++){
            buildString = buildString + i + " ";
        }
        return buildString;
    }
    /**
     * method will count from start to end, checking every number within if the value
     * is even, and only if it is even, it will append the value to a string that is 
     * returned at the end of the method
     * @param start
     * @param end
     * @return all even numbers from start to end, inclusive
     */
    public String countEvenNumbers(int start, int end){
        String buildString = "";
        for(int i = start; i <= end; i++){
            if(i % 2 == 0){
                buildString = buildString + i + " ";
            }
        }
        return buildString;
    }
}

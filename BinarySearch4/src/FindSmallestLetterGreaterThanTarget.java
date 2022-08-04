public class FindSmallestLetterGreaterThanTarget {

    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        System.out.println(nextGreatestLetter(letters, target));
    }

    static char nextGreatestLetter(char[] letters, char target) {


        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            //find middle
//            int mid = (start+end)/2;
            //this might be possible that (start+end) might exceeds the range of int
            //so we use this
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return letters[start % letters.length];
    }
    //return the index of element smallest number >=target}
}



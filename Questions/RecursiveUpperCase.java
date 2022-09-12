public class RecursiveUpperCase {

    public static void main(String[] args) {
        String[] words = {"yellow", "black", "green", "grey"};
        String[] result = convertToUpper(words);
        _print(result);

    }

    public static String[] convertToUpper(String[] words, int length) {
        if(length >= 0) {
            words[length] = words[length].toUpperCase();
            length--;
            convertToUpper(words, length);
            return words;
        } else {
            return words;
        }
    }

    public static String[] convertToUpper(String[] arr) {
        //Add code here
        if(arr.length==0) {
            return arr;
        }
        String[] newArr = new String[arr.length-1];
        for(int i=0; i<arr.length-1; i++){
            newArr[i] = arr[i+1];
        }
        arr[0] = arr[0].toUpperCase();
        newArr = convertToUpper(newArr);
        for(int i=0; i<newArr.length; i++){
            arr[i+1] = newArr[i];
        }
        return arr;
    }

    public static void _print(String[] res) {
        for(int i=0; i<res.length; i++) {
            if(i == res.length - 1) {
                System.out.print(res[i]);
            } else {
                System.out.print(res[i] + " ");
            }
        }
        System.out.println();
    }
}

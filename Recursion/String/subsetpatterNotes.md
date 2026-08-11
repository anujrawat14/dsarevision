```java
/*
    SUBSETS / SUBSEQUENCES USING RECURSION

    For every character, we have 2 choices:
    1. Take the character
    2. Don't take the character

    Example: "abc"

    Output:
    abc
    ab
    ac
    a
    bc
    b
    c
    ""
*/


// ============================================================
// APPROACH 1: Directly Print the Subsets
// ============================================================

/*
    In this approach, we don't store the subsets anywhere.

    When str becomes empty, the current subset (p) is printed.

    Time Complexity: O(2^n)
    Space Complexity: O(n) -> recursion stack
*/

// class Main {

//     static void subset(String p, String str) {

//         // Base case
//         // When there are no characters left,
//         // p represents one complete subset.
//         if (str.isEmpty()) {
//             System.out.println(p);
//             return;
//         }

//         char ch = str.charAt(0);

//         // Take the current character
//         subset(p + ch, str.substring(1));

//         // Don't take the current character
//         subset(p, str.substring(1));
//     }

//     public static void main(String[] args) {

//         // Start with an empty subset
//         subset("", "abc");
//     }
// }


// ============================================================
// APPROACH 2: Store Subsets in an ArrayList Passed as Parameter
// ============================================================

/*
    Here, we create an ArrayList in main() and pass the same
    ArrayList to every recursive call.

    Whenever we reach the base case, we add the current
    subset to the ArrayList.

    Time Complexity: O(2^n)
    Space Complexity: O(2^n) -> storing all subsets
                       + O(n) -> recursion stack
*/

// import java.util.ArrayList;

// class Main {

//     static ArrayList<String> subset(
//             String p,
//             String str,
//             ArrayList<String> arr) {

//         // Base case
//         if (str.isEmpty()) {
//             arr.add(p);
//             return arr;
//         }

//         char ch = str.charAt(0);

//         // Take the current character
//         subset(p + ch, str.substring(1), arr);

//         // Don't take the current character
//         subset(p, str.substring(1), arr);

//         return arr;
//     }

//     public static void main(String[] args) {

//         ArrayList<String> result = new ArrayList<>();

//         subset("", "abc", result);

//         System.out.println(result);
//     }
// }


// ============================================================
// APPROACH 3: Return ArrayList From Each Recursive Call
// ============================================================

/*
    In this approach, we DON'T pass an ArrayList as a parameter.

    Instead:
    
    1. The left recursive call returns all subsets
       where the current character is taken.

    2. The right recursive call returns all subsets
       where the current character is NOT taken.

    3. We combine both lists using addAll().

    Time Complexity: O(2^n)
    Space Complexity: O(2^n) -> storing all subsets
                       + O(n) -> recursion stack
*/

import java.util.ArrayList;

class Main {

    static ArrayList<String> subset(String p, String str) {

        // Base case
        // When str becomes empty, p is one complete subset.
        if (str.isEmpty()) {

            ArrayList<String> list = new ArrayList<>();

            list.add(p);

            return list;
        }

        // Take the first character
        char ch = str.charAt(0);

        // ----------------------------------------------------
        // LEFT: Take the current character
        // ----------------------------------------------------
        ArrayList<String> left =
                subset(p + ch, str.substring(1));

        // ----------------------------------------------------
        // RIGHT: Don't take the current character
        // ----------------------------------------------------
        ArrayList<String> right =
                subset(p, str.substring(1));

        // Combine both results
        left.addAll(right);

        return left;
    }

    public static void main(String[] args) {

        // Get all subsets of "abc"
        ArrayList<String> result = subset("", "abc");

        System.out.println(result);
    }
}
```

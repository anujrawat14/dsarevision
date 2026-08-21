public List<String> generate(int open, int close, int max, String process) {

    // Base case
    if (process.length() == 2 * max) {
        List<String> list = new ArrayList<>();
        list.add(process);
        return list;
    }

    List<String> ans = new ArrayList<>();

    // Add opening bracket
    if (open < max) {
        ans.addAll(generate(open + 1, close, max, process + "("));
    }

    // Add closing bracket
    if (close < open) {
        ans.addAll(generate(open, close + 1, max, process + ")"));
    }

    return ans;
}

public List<String> generateParenthesis(int n) {
    return generate(0, 0, n, "");
}

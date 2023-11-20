package DP.Memo;

public class BooleanExpressionTrueNumberOfWays {
    public static void main(String[] args) {
        System.out.println("Boolean Expression True Number Of Ways ");

        String exp = "F|T^F";
        int ways = evaluateExpWays(exp);
        System.out.println("The total number of ways: " + ways);
    }

    static final int MOD = 1000000007;

    static int evaluateExpWays(String exp) {
        int n = exp.length();
        Long[][][] memo = new Long[n][n][2];
        return (int) evaluateExpressionWays(exp, 0, n - 1, 1, memo);
    }

    static long evaluateExpressionWays(String exp, int i, int j, int isTrue, Long[][][] memo) {
        if (i > j) return 0;

        if (i == j) {
            if (isTrue == 1) return exp.charAt(i) == 'T' ? 1 : 0;
            else return exp.charAt(i) == 'F' ? 1 : 0;
        }

        if (memo[i][j][isTrue] != null) return memo[i][j][isTrue];

        long ways = 0;
        for (int ind = i + 1; ind <= j - 1; ind += 2) {
            long lT = evaluateExpressionWays(exp, i, ind - 1, 1, memo);
            long lF = evaluateExpressionWays(exp, i, ind - 1, 0, memo);
            long rT = evaluateExpressionWays(exp, ind + 1, j, 1, memo);
            long rF = evaluateExpressionWays(exp, ind + 1, j, 0, memo);

            char operator = exp.charAt(ind);
            if (operator == '&') {
                if (isTrue == 1) ways = (ways + (lT * rT) % MOD) % MOD;
                else ways = (ways + (lF * rT) % MOD + (lT * rF) % MOD + (lF * rF) % MOD) % MOD;
            } else if (operator == '|') {
                if (isTrue == 1) ways = (ways + (lF * rT) % MOD + (lT * rF) % MOD + (lT * rT) % MOD) % MOD;
                else ways = (ways + (lF * rF) % MOD) % MOD;
            } else {
                if (isTrue == 1) ways = (ways + (lF * rT) % MOD + (lT * rF) % MOD) % MOD;
                else ways = (ways + (lF * rF) % MOD + (lT * rT) % MOD) % MOD;
            }
        }

        memo[i][j][isTrue] = ways;
        return ways;
    }


}

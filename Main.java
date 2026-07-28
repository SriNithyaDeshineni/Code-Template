import java.io.*;
import java.util.*;

public class Main {

    // ============================================================
    // FAST INPUT CLASS
    // Uses BufferedReader + StringTokenizer for faster input
    // ============================================================
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        // Reads next word/token
        String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        // Reads integer
        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        // Reads long
        long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        // Reads double
        double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        // Reads complete line
        String nextLine() throws IOException {
            return br.readLine();
        }
    }

    // Object for fast input
    static FastReader in = new FastReader();

    // Fast output
    static PrintWriter out = new PrintWriter(System.out);

    // Common modulus used in CP
    static final long MOD = 1000000007L;

    // ============================================================
    // MATHEMATICAL FUNCTIONS
    // ============================================================

    // Greatest Common Divisor (Euclidean Algorithm)
    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Least Common Multiple
    static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }

    // Binary Exponentiation
    // Time Complexity : O(log n)
    static long power(long a, long b) {

        long ans = 1;

        while (b > 0) {

            if ((b & 1) == 1)
                ans *= a;

            a *= a;
            b >>= 1;
        }

        return ans;
    }

    // Modular Exponentiation
    // Computes (a^b) % MOD
    static long modPower(long a, long b) {

        long ans = 1;
        a %= MOD;

        while (b > 0) {

            if ((b & 1) == 1)
                ans = (ans * a) % MOD;

            a = (a * a) % MOD;
            b >>= 1;
        }

        return ans;
    }

    // ============================================================
    // BIT MANIPULATION
    // ============================================================

    // Check whether ith bit is set
    static boolean checkBit(int n, int i) {
        return ((n >> i) & 1) == 1;
    }

    // Set ith bit
    static int setBit(int n, int i) {
        return n | (1 << i);
    }

    // Clear ith bit
    static int clearBit(int n, int i) {
        return n & ~(1 << i);
    }

    // Toggle ith bit
    static int toggleBit(int n, int i) {
        return n ^ (1 << i);
    }

    // Count number of set bits
    static int countSetBits(int n) {
        return Integer.bitCount(n);
    }

    // Check whether number is power of two
    static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    // Returns lowest set bit
    static int lowestSetBit(int n) {
        return n & -n;
    }

    // ============================================================
    // ARRAY UTILITIES
    // ============================================================

    // Reads an integer array
    static int[] inputArray(int n) throws IOException {

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();

        return arr;
    }

    // Prints array
    static void printArray(int[] arr) {

        for (int x : arr)
            out.print(x + " ");

        out.println();
    }

    // Swap two array elements
    static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // ============================================================
    // SOLVE FUNCTION
    // Write problem-specific logic here
    // ============================================================

    static void solve() throws Exception {



    }

    // ============================================================
    // MAIN METHOD
    // ============================================================

    public static void main(String[] args) throws Exception {

        // Number of test cases
        int t = 1;

        // Uncomment if multiple test cases exist
        // t = in.nextInt();

        while (t-- > 0) {
            solve();
        }

        out.flush();
    }
}

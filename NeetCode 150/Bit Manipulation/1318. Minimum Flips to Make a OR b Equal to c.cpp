// Simple brute force solution checking each bit one by one
class Solution {
public:
    int minFlips(int a, int b, int c) {
        int flips = 0;
        while( a != 0 || b != 0 || c!= 0){
            if((c & 1) == 1){
                if((a & 1) == 0 && (b & 1) == 0){
                    flips++;
                }
            } else {
                if((a & 1) == 1) flips++;
                if((b & 1) == 1) flips++;
            }
            a >>= 1;
            b >>= 1;
            c >>= 1;
        }
        return flips;
    }
};

// Simple brute force solution checking each bit one by one(much better run time)
class Solution {
public:
    int minFlips(int a, int b, int c) {
        int flips = 0;
        while( a != 0 || b != 0 || c!= 0){
            if((c & 1) == 1){
                if((a & 1) == 0 && (b & 1) == 0){
                    flips++;
                }
            } else {
                flips += (a & 1) + (b & 1);
            }
            a >>= 1;
            b >>= 1;
            c >>= 1;
        }
        return flips;
    }
};

// Second approach using inbuilt function
class Solution {
public:
    int minFlips(int a, int b, int c) {
        int result = ((a|b) ^ c);
        int result1 = (a & b);
        int result2 = (result & result1);

        return __builtin_popcount(result) + __builtin_popcount(result2);
    }
};
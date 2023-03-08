class SumOfN{
    // This is rthe recursive approach to solve the problem
    // Recurrance relation:T(N)=O(1)+t(N-1)-->O(N)-->Time complexity and space complexity is O(N)
    // Because it is taking n space of the stack
    public static int sum(int n){
        // Base condition
        if(n==1) return n;
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        System.out.println(sum(4));
    }
}
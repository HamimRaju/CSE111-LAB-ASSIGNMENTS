public class Task_09 {
    public static void main(String[] args) {
        int[][] A = { { 1, 0, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 0, 1, 0 },
                { 0, 1, 0, 1 } };

        boolean isIdentity = true;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if ((i == j && A[i][j] == 1) || (i != j && A[i][j] == 0)) {
                    isIdentity = true;
                } 
                else {
                    isIdentity = false;
                    break;
                }
            }
            if (!isIdentity) {
                break;
            }
        }
        if (isIdentity) {
            System.out.println("Identity Matrix.");
        } 
        else {
            System.out.println("Not Identity Matrix.");
        }
    }
}

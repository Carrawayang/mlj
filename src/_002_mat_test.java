import matrix.mat;

public class _002_mat_test {
    public static void main(String[] args) throws Exception {
        mat m0 = new mat();
        mat m1 = new mat(1);
        mat m2 = new mat(2, 2);
        mat m3 = new mat(3, 3, 3);
        mat m4 = new mat(4, 4, 4, 4);
        mat m5 = new mat(5, 5, 5, 5, 5);
        m0.show();
        m1.show();
        m2.show();
        m3.show();
        m4.show();
        m5.show();
        double [][] arr = {{1, 4}, {9, 16}};
        m2.setMat2d(arr);
        m2.show();
        m2.transpose();
        m2.show();
    }
}


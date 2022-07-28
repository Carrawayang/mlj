package matrix;
import java.lang.reflect.Field;
import java.util.Random;
public class mat{
    double mat0d;
    double [] mat1d;
    double [][] mat2d;
    double [][][] mat3d;
    double [][][][] mat4d;
    double [][][][][] mat5d;
    boolean [] select = {false, false, false, false, false, false};
    int[] shape;

    public double getMat0d() {
        return mat0d;
    }

    public void setMat0d(double mat0d) {
        this.mat0d = mat0d;
    }

    public double[] getMat1d() {
        return mat1d;
    }

    public void setMat1d(double[] mat1d) {
        this.mat1d = mat1d;
    }

    public double[][] getMat2d() {
        return mat2d;
    }

    public void setMat2d(double[][] mat2d) {
        this.mat2d = mat2d;
    }

    public double[][][] getMat3d() {
        return mat3d;
    }

    public void setMat3d(double[][][] mat3d) {
        this.mat3d = mat3d;
    }

    public double[][][][] getMat4d() {
        return mat4d;
    }

    public void setMat4d(double[][][][] mat4d) {
        this.mat4d = mat4d;
    }

    public double[][][][][] getMat5d() {
        return mat5d;
    }

    public void setMat5d(double[][][][][] mat5d) {
        this.mat5d = mat5d;
    }

    public boolean[] getSelect() {
        return select;
    }

    public void setSelect(boolean[] select) {
        this.select = select;
    }

    public int[] getShape() {
        return shape;
    }

    public void setShape(int[] shape) {
        this.shape = shape;
    }

    public void swap(double i, double j){
        double tag;
        tag =i;
        i = j;
        j = tag;
    }

    public static void swap(double[][] arr, int a, int b) {
        double tmp = arr[a][b];
        arr[a][b] = arr[b][a];
        arr[b][a] = tmp;
    }

    public void swap(Double a, Double b) throws Exception {
        Field field = Double.class.getDeclaredField("value");
        field.setAccessible(true);   // 设置可以访问成员的私有不可变的变量
        field.set(a, b);
        field.set(b, a);
    }


    public mat(int... shape){
        this.shape = shape;
        if(shape.length == 0){
            mat0d = 0.0;
            select[0] = true;
        }
        if(shape.length == 1){
            mat1d = new double[shape[0]];
            select[1] = true;
        }if(shape.length == 2){
            mat2d = new double[shape[0]][shape[1]];
            select[2] = true;
        }if(shape.length == 3) {
            mat3d = new double[shape[0]][shape[1]][shape[2]];
            select[3] = true;
        }if(shape.length == 4) {
            mat4d = new double[shape[0]][shape[1]][shape[2]][shape[3]];
            select[4] = true;
        }if(shape.length == 5){
            mat5d = new double[shape[0]][shape[1]][shape[2]][shape[3]][shape[4]];
            select[5] = true;
    }
}

    public void transpose(){
        if(shape.length == 1){
            mat2d = new double[shape[0]][0];
            for (int i = 0; i < shape[0]; i++) {
                mat2d[i][0] = mat1d[i];
            }
        }
        if (shape.length == 2)
            for(int i =0; i < shape[0]; i++)
                for (int j = 0; j < shape[1]; j++)
                    swap(mat2d, i, j);
    }

    public void add(){

    }

    public void sub(){

    }

    public void show(){
        for (int i = 0; i < select.length; i++)
            if (select[i])
                System.out.printf("show the mat: selected %dd-mat%n", i);

        if (shape.length == 0)
            System.out.println(mat0d);

        if (shape.length == 1)
            for (int i = 0; i < mat1d.length; i++) {
                System.out.print(mat1d[i]);
                System.out.print(" ");
            }

        if (shape.length == 2)
            for (int i = 0; i < mat2d.length; i++) {
                for (int j = 0; j < mat2d[0].length; j++) {
                    System.out.print(mat2d[i][j]);
                    System.out.print(" ");
                }
                System.out.print('\n');
            }
    }
}
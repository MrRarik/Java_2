package exceptions;

public class Main {
    public static void main(String[] args) {
        String[][] arr = {{"1","1","1","1"},
                          {"1","1","1","1"},
                          {"1","1","1","1"},
                          {"1","1","1","1"}};
        try {
            System.out.println(checkArr(arr));
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка!");
            e.printStackTrace();
            System.out.println("Размер масива не равен 4х4");
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка!");
            e.printStackTrace();
            System.out.println("Испавте на цифру: " + arr[e.i][e.j]);
            System.out.println("В ячейке: " + "[" +e.i +"]" + "[" + e.j + "]");
        }
    }
        public static int checkArr(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int a = 0;
            if (arr.length != 4)  {
                throw new MyArraySizeException();
            }
        for (int i = 0; i < arr.length; i++) {
              if (arr[i].length != 4) throw new MyArraySizeException();
            for (int j = 0; j < arr.length; j++) {
                try {
                    a += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return a;
    }
}

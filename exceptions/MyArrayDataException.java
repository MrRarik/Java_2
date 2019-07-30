package exceptions;

public class MyArrayDataException extends NumberFormatException {
    int i;
    int j;

    MyArrayDataException(int i, int j) {
        this.i = i;
        this.j = j;
    }
}

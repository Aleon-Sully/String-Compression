public class CharAndCount {

    private char aChar;
    private int count;

    public CharAndCount(char aChar, int count) {
        this.aChar = aChar;
        this.count = count;
    }

    public char getaChar() {
        return aChar;
    }

    public void setaChar(char aChar) {
        this.aChar = aChar;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void increaseCount(){
        this.count++;
    }
}

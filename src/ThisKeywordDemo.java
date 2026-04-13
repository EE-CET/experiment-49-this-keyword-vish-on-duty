import java.util.Scanner;

class ThisDemo {
    int value;

    void setValue(int value) {
        this.value = value;
    }
    
    void display() {
        System.out.println("Value: " + value);
    }
}

public class ThisKeywordDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputVal = sc.nextInt();
        
        ThisDemo demo = new ThisDemo();
        demo.setValue(inputVal);
        demo.display();
        sc.close();
    }
}

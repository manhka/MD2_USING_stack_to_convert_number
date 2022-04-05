import java.util.Stack;

public class BinaryToDecimal {
    private int convertBinaryToDecimal(int binary){
    int decimalNumber=0;
    Stack<Integer> stackOfDecimal= new Stack<>();
    int remainder;
    while(binary!=0){
        remainder=binary%10;
        stackOfDecimal.push(remainder);
        binary=binary/10;

    }
    while(!stackOfDecimal.isEmpty()){
        if (stackOfDecimal.pop()==1){
            decimalNumber+=Math.pow(stackOfDecimal.size(), 2);
        }else {
            decimalNumber+=0;

        }
    }
    return decimalNumber;
}
    public static void main(String[] args) {
        BinaryToDecimal binaryToDecimal = new BinaryToDecimal();
        int binaryNumber=11001111;
        System.out.print("------------Binary number of  "+binaryNumber+ " convert to Decimal number is : " );
        System.out.print(binaryToDecimal.convertBinaryToDecimal(binaryNumber));;
    }
    }


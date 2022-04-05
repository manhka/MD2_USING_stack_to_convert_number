import java.util.Stack;

public class DecimalToBinary
{
    private void convertDecimalToBinary(int decimal){
        Stack<Integer> stackOfBinary=new Stack<>();

        int remainder;
        while(decimal!=0){
            remainder=decimal%2;
            decimal=decimal/2;
            stackOfBinary.push(remainder);
        }while(!stackOfBinary.isEmpty()){
            System.out.print(stackOfBinary.pop());
        }
    }

    public static void main(String[] args) {

        int decimalNumber = 25;
        DecimalToBinary decimalToBinary=new DecimalToBinary();
        System.out.print("------------Decimal number of  " +decimalNumber +" convert to Binary number is: ");
        decimalToBinary.convertDecimalToBinary(decimalNumber);
    }
        }

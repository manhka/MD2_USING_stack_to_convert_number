import java.util.Stack;

public class DecimalToHexadecimal {
    private static   String convertDecimalToHexadecimal(int decimal){
        Stack<Integer> stackOfHexadecimal=new Stack<>();
        int remainder;
        while(decimal!=0){
            remainder=decimal%16;
            decimal=decimal/16;
            stackOfHexadecimal.push(remainder);
        }
        String str="";
        while(!stackOfHexadecimal.isEmpty()){
            int x=stackOfHexadecimal.pop();
            if (x>=0&&x<=9){
                str+=x;
            }
            if (x==10){
                str+="A";
            }else if (x==11){
                str+="B";
            }else if (x==12){
                str+="C";
            }else if (x==13){
                str+="D";
            }else if (x==14){
                str+="E";
            }else if (x==15){
                str+="F";
            }
        }
        return str;
    }
    public static void main(String[] args) {
        int decimalNumber=155;
        // cach 1: USING toHexString method()
//        String str=Integer.toHexString(decimalNumber);
//        System.out.println("decimal number of "+ decimalNumber +"convert to Hexadecimal is:"+str);
        DecimalToHexadecimal decimalToHexadecimal=new DecimalToHexadecimal();
        System.out.println("decimal number of "+ decimalNumber +" convert to Hexadecimal is:"
                +decimalToHexadecimal.convertDecimalToHexadecimal(decimalNumber));
        ;

    }
}

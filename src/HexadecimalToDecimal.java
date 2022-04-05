import jdk.swing.interop.SwingInterOpUtils;

import java.util.Stack;

public class HexadecimalToDecimal {
    private int convertHexadecimalToDecimal(String hexadecimal){
        Stack<String> stackOfDecimal= new Stack<>();
        int decimalNumber=0;
        while (hexadecimal!=""){
            for (int i = 0; i < hexadecimal.length(); i++) {
                char x=hexadecimal.charAt(i);
                if (x=='A'){
//
                    stackOfDecimal.push(String.valueOf(x));
                }else if (x=='B'){
//                    decimalNumber+=10*Math.pow(hexadecimal.indexOf(x),16);
                    stackOfDecimal.push(String.valueOf(x));
                }else if (x=='C'){
//                    decimalNumber+=10*Math.pow(hexadecimal.indexOf(x),16);
                    stackOfDecimal.push(String.valueOf(x));
                }else if (x=='D'){
//                    decimalNumber+=10*Math.pow(hexadecimal.indexOf(x),16);
                    stackOfDecimal.push(String.valueOf(x));
                }else if (x=='E'){
//                    decimalNumber+=10*Math.pow(hexadecimal.indexOf(x),16);
                    stackOfDecimal.push(String.valueOf(x));
                }else if (x=='F'){
//                    decimalNumber+=10*Math.pow(hexadecimal.indexOf(x),16);
                    stackOfDecimal.push(String.valueOf(x));
                }else if (x>=0&&x<=9){
                    stackOfDecimal.push(String.valueOf(x));
                }while (!stackOfDecimal.isEmpty()){
                    String y=stackOfDecimal.pop();

                    if (y=="A"){
                        decimalNumber+=10*Math.pow(hexadecimal.indexOf(x),16);
                    }else if (y=="B"){
                        decimalNumber+=11*Math.pow(hexadecimal.indexOf(x),16);
                    }else if (y=="D"){
                        decimalNumber+=12*Math.pow(hexadecimal.indexOf(x),16);
                    }else if (y=="E"){
                        decimalNumber+=14*Math.pow(hexadecimal.indexOf(x),16);
                    }else if (y=="C"){
                        decimalNumber+=13*Math.pow(hexadecimal.indexOf(x),16);
                    }else if (y=="F"){
                        decimalNumber+=15*Math.pow(hexadecimal.indexOf(x),16);
                    }else
                    {
                        decimalNumber+=x*Math.pow(hexadecimal.indexOf(x),16);
                    }
                }

            }
        }
        return decimalNumber;
    }
    public static void main(String[] args) {
        //cach1: dung Integer.ParseInt()
        String hexadecimal="6F";
//        int decimal= Integer.parseInt(hexadecimal,16);
//        System.out.println("Hexadecimal number of "+hexadecimal +" convert to decimal number is: "+decimal);
        HexadecimalToDecimal hexadecimalToDecimal=new HexadecimalToDecimal();
        System.out.println("Hexadecimal number of "+hexadecimal +" convert to decimal number is: "
                +hexadecimalToDecimal.convertHexadecimalToDecimal(hexadecimal));
    }
}

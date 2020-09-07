package RomanNumbers;

public class Roman {

    public static String Milhar(int decimal){
        var test = decimal/1000;
        var resposta = "";
        for(int i = 1; i <= test; i++){
            resposta += "M";
        }
        return resposta;
    }
    public static String Centena(int decimal){
        var test = decimal % 1000;
        var resposta = "";
        test /= 100;
        if(test == 9){
            resposta += "CM";
        }else if(test >= 5){
            resposta += "D";
            for (int i = 5; i < test; i++){
                resposta += "C";
            }
        }else if(test == 4){
            resposta += "CD";
        }
        else{
            for (int i = 0; i < test; i++){
                resposta += "C";
            }
        }
        return resposta;
    }

    public static String Dezena(int decimal) {
        var test = decimal % 1000;
        test = decimal % 100;
        test /= 10;
        var resposta = "";
        if(test == 9){
            resposta += "XC";
        }else if(test >= 5){
            resposta += "L";
            for (int i = 5; i < test; i++){
                resposta += "X";
            }
        }else if(test == 4){
            resposta += "XL";
        }
        else{
            for (int i = 0; i < test; i++){
                resposta += "X";
            }
        }
        return  resposta;
    }

    public static String Unidade(int decimal) {
        var test = decimal % 1000;
        test = decimal % 100;
        test %= 10;
        var resposta = "";
        if(test == 9){
            resposta += "IX";
        }else if(test >= 5){
            resposta += "V";
            for (int i = 5; i < test; i++){
                resposta += "I";
            }
        }else if(test == 4){
            resposta += "IV";
        }
        else{
            for (int i = 0; i < test; i++){
                resposta += "I";
            }
        }
        return resposta;
    }


        public static String  solution(int decimal){
        var resposta = "";
        resposta += Milhar(decimal);
        resposta += Centena(decimal);
        resposta += Dezena(decimal);
        resposta += Unidade(decimal);

        return resposta;
    }
}

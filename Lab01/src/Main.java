class Main {
    public static void main(String[] args) {
        System.out.println(convertBinToDecimal("111"));
        System.out.println(convertOctToDecimal("301"));
        System.out.println(convertOctToDecimal_recur("301",2));
        System.out.println(convertOctToDecimalUsingRecursion("301"));
    }

    static public int convertBinToDecimal(String binary) {
        int conversion = 1;
        int result = 0;
        for (int i = 1; i <= binary.length(); i++){
            if (binary.charAt(binary.length() - i) == '1'){
                result += conversion;
            }
            conversion *= 2;
        }
        return result;
    }

    static public int convertOctToDecimal(String oct) {
        int conversion = 1;
        int result = 0;
        for (int i = 1; i <= oct.length(); i++) {
            int currentNum = Integer.parseInt(String.valueOf(oct.charAt(oct.length() - i)));
            result += currentNum * conversion;
            conversion *= 8;
        }
        return result;
    }

    static public int convertOctToDecimal_recur(String oct, int exp) {
        int digit = Integer.parseInt(String.valueOf(oct.charAt(oct.length() - (exp+1))));
        int converstionValue = (int) Math.pow(8,exp);
        if (exp == 0) {
            return digit;
        }
        else {
            return digit * converstionValue + convertOctToDecimal_recur(oct, exp -1);
        }
    }

    static public int convertOctToDecimalUsingRecursion(String oct){
        return convertOctToDecimal_recur(oct, oct.length()-1);
    }
}
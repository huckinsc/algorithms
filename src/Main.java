class Main {
    public static void main(String[] args) {
        System.out.println(convertToDecimal("111"));
    }

    static public int convertToDecimal(String binary) {
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
}
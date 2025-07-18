class Solution {
    public String solution(String phone_number) {
        StringBuilder phone_number_security = new StringBuilder();

        char[] arr = phone_number.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 4) arr[i] = '*';
            phone_number_security.append(arr[i]);
        }

        return phone_number_security.toString();
    }
}
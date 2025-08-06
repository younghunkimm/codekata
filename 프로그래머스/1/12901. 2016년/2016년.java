import java.time.LocalDate;

class Solution {
    public String solution(int a, int b) {
        return getYoil(a, b);
    }
    
    public String getYoil(int a, int b) {
        LocalDate date = LocalDate.of(2016, a, b);
        return date.getDayOfWeek().toString().substring(0, 3);
    }
}
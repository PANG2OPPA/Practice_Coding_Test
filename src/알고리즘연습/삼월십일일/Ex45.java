package 알고리즘연습.삼월십일일;

// 두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요. 배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다. 예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.

public class Ex45 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        if (n == 0 || m == 0) {
            answer[0] = 0;
            answer[1] = 0;
            return answer;
        }
        int a = n, b = m;
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        answer[0] = a;
        answer[1] = (n * m) / a;
        return answer;
    }

}

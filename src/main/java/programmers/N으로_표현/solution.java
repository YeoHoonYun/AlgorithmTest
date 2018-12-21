package programmers.N으로_표현;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-22
 * Github : https://github.com/YeoHoonYun
 */
public class solution {
    int answer = -1;

    public int solution(int N, int number){
        dfs(N, 0,0,number, "");
        return answer;
    }
    public void dfs(int n, int pos, int num, int number, String s){
        if (pos > 8)
            return;
        if(num == number){
            if(pos < answer || answer == -1){
                System.out.println(s);
                answer = pos;
            }
            return;
        }
        int nn = 0;
        for (int i = 0; i < 8; i++){
            nn = nn*10+n;
            dfs(n, pos + 1+i, num + nn, number, s + "+");
            dfs(n, pos + 1+i, num - nn, number, s + "-");
            dfs(n, pos + 1+i, num * nn, number, s + "*");
            dfs(n, pos + 1+i, num / nn, number, s + "/");
        }
    }
    /* python
    def solution(N, number):
    S = [{N}]
    for i in range(2, 9):
        lst = [int(str(N)*i)]
        for X_i in range(0, int(i / 2)):
            for x in S[X_i]:
                for y in S[i - X_i - 2]:
                    lst.append(x + y)
                    lst.append(x - y)
                    lst.append(y - x)
                    lst.append(x * y)
                    if x != 0: lst.append(y // x)
                    if y != 0: lst.append(x // y)
        if number in set(lst):
            return i
        S.append(lst)
    return -1
     */
}

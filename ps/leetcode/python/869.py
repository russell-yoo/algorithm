class Solution(object):
    # 10^9 => 2^30 까진 계산 해야한다.
    def pw(self, n):
        if n == 0:
            return 1
        if n % 2 == 0:
            result = self.pw(n // 2)
            return result * result
        else:
            result = self.pw(n//2)
            return result * result * 2



    def reorderedPowerOf2(self, n):
        d = dict()
        for i in range(1, 31):
            k = self.pw(i)
            arr = [0] * 10
            while k != 0:
                t = k%10
                arr[t]+=1
                k//=10
            d[i] = arr
        n_arr = [0] * 10
        while n != 0:
            t = n%10
            n_arr[t]+=1
            n //= 10
        answer = False
        for i in range(1, 31):
            is_ok = True
            for j in range(0, 10):
                if n_arr[j] != d[i][j]:
                    is_ok = False
                    continue
            if is_ok:
                answer = True
                break
        return answer







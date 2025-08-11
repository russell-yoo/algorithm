class Solution(object):
    def maxDistance(self, s, k):
        """
        :type s: str
        :type k: int
        :rtype: int
        """
        N = 0
        S = 0
        E = 0
        W = 0
        answer = 0
        for i in range(len(s)):
            if s[i] == "N":
                N += 1
            elif s[i] == "S":
                S += 1
            elif s[i] == "E":
                E += 1
            elif s[i] == "W":
                W += 1

            cur = i + 1
            if cur <= k:
                answer = max(answer, cur)
            else:
                tmp = 0
                tmp_k = k
                if N >= S:
                    used_k = min(tmp_k, S)
                    tmp += N - S + used_k * 2
                    tmp_k -= used_k
                else:
                    used_k = min(tmp_k, N)
                    tmp += S - N + used_k * 2
                    tmp_k -= used_k

                if E >= W:
                    used_k = min(tmp_k, E)
                    tmp += W - E + used_k * 2
                    tmp_k -= used_k
                else:
                    used_k = min(tmp_k, W)
                    tmp += E - W + used_k * 2
                    tmp_k -= used_k
                answer = max(answer, tmp)
        print(answer)

        return answer

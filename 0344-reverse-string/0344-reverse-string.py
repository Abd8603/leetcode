class Solution:
    def reverseString(self, s: List[str]) -> None:
        """
        Do not return anything, modify s in-place instead.
        """
        leng = len(s)
        mid = leng/2
        leng -= 1
        index = 0
        while(index < mid):
            x = leng - index
            temp = s[x]
            s[x] = s[index]
            s[index] = temp
            index += 1
        
        
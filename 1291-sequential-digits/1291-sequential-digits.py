class Solution:
    def sequentialDigits(self, low: int, high: int) -> List[int]:
        res = []

        for start in range(1, 10):
            current = start
            next_digit = start + 1

            while current <= high and next_digit <= 10:
                if current >= low:
                    res.append(current)

                current = current * 10 + next_digit
                next_digit += 1

        return sorted(res)

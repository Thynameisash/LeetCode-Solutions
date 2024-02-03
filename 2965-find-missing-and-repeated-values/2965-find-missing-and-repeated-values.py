class Solution:
    def findMissingAndRepeatedValues(self, grid: List[List[int]]) -> List[int]:
        n = len(grid)
        n_list = list(range(1, n**2 + 1))

        flat_list = [x for xs in grid for x in xs]

        repeating_el = [next(element for element in flat_list 
        if flat_list.count(element) > 1)]

        return repeating_el +  list(set(n_list) - set(flat_list))
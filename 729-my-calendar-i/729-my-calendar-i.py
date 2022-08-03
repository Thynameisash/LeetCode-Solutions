class MyCalendar:

    def __init__(self):
        self.calendar=[]

    def book(self, start: int, end: int) -> bool:
        # Check if new incoming value's range is less than existing ones
        for lower, upper in self.calendar:
            if lower<end and start<upper:
                return False
        # If new range is not less than any existing range, comes out of loop and appends it.
        self.calendar.append((start,end))
        return True


# Your MyCalendar object will be instantiated and called as such:
# obj = MyCalendar()
# param_1 = obj.book(start,end)
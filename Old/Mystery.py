# Takes A Positive Integer N
# Return How Many Times N Can Halved Before Reaching One
def mystery(x):
    # Count Of Integer Divisions
    count = 0
    # While X > 1
    while x > 1:
        # Half X
        x //= 2
        # Increment Count Of Divisions
        count += 1
    # Return Count Of Division
    return count

# Counts And Returns How Many Elements In
# The Sequence Are Out Of Order
def inversions(x):
    # Count The Number Of Pairs Out Of Order
    count = 0
    # Naïve Approach To Count Unsorted Pairs
    for i in range(len(x) - 1):
        for j in range(i + 1, len(x)):
            # If Pair Is Out Of Order
            if x[i] > x[j]:
                # Add To Count
                count += 1
    # Return Count
    return count

# Test Mystery
for i in [4, 11, 25]:
    print(f'mystery({i}) = {mystery(i)}')

print()

# Test Inversions
for i in ['ABBFHDL', 'ABCD', 'DCBA']:
    print(f'inversions("{i}") = {inversions(i)}')

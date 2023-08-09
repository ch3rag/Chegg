# Checks If The Number is Positive, Negative Or Zero
# Returns:
#   -1: If The Number is Negative
#    0: If The Number is Zero
#    1: If The Number is Positive
def heavy(x):
    if x < 0:
        # Numbers Less Than Zero Are Negative
        # Return -1
        return -1
    elif x > 0:
        # Numbers Greater Than Zero Are Positive
        # Return 1
        return 1
    else:
        # Number is Zero
        # Return 9
        return 0

# Test Code
print(heavy(-1))
print(heavy(5341))
print(heavy(0))
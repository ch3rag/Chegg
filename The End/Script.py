def squareroot(n, p):
    """function to compute squareroot using heron's algorithm
    n is the number to calculate the squareroot of,
    p is decimal points of precision"""
    xg = (1 + n)/2
    for i in range(1000):
        xl = n / xg
        xu = xg
        if round(xl, p) == round(xu, p):
            break
        xg = (xl + xu) / 2
    return(round(xl, p))

print(squareroot(5, 0))
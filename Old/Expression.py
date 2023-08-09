class Var_expr:
    def __init__(self, bexpr):
        self._val = bexpr

    def __str__(self):
        return self._val
    
class Bin_expr:
    def __init__(self, op, expr1, expr2):
        self._e1 = Expr(expr1)
        self._e2 = Expr(expr2)
        self._op = op
    
    def __str__(self):
        return f'<{str(self._e1)} {self._op} {str(self._e2)}>'

class Not_expr:
    def __init__(self, bexpr):
        self._val = Expr(bexpr)

    def __str__(self):
        return f'<not {str(self._val)}>'
 
class Expr:
    def __init__(self, bexpr):
        # a, b, c etc.
        if len(bexpr) == 1:
            self._val = Var_expr(bexpr[0])
        # (not a), (not b), (not (not a)), (not (a and b)) etc.
        elif bexpr[1] == 'not':
            self._val = Not_expr(bexpr[2:self.match_location(2, bexpr)])
        # (a and b), (a and (not b)), (a and (a and b)) etc.
        elif bexpr[2] == 'and':
            # (a and (not b)), (a and (a and b))
            if bexpr[3] == '(':
                e2End = self.match_location(3, bexpr)
                self._val = Bin_expr('and', bexpr[1], bexpr[3 : e2End + 1])
            else:
                # (a and b)
                self._val = Bin_expr('and', bexpr[1], bexpr[3])
        # ((not a) and b), ((a and b) and (not b)), ((a and b) and (a and b)) etc.
        elif bexpr[1] == '(':
            e1End = self.match_location(1, bexpr)
            if bexpr[e1End + 2] == '(':
                # ((a and b) and (not b))
                e2End = self.match_location(e1End + 2, bexpr)
                self._val = Bin_expr('and', bexpr[1 : e1End + 1], bexpr[e1End + 2 : e2End + 1])
            else:
                # ((not a) and b)
                self._val = Bin_expr('and', bexpr[1 : e1End + 1], bexpr[e1End + 2])

    def match_location(self, st, expr):
        n = 1
        i = st
        while n:
            i += 1
            if expr[i] == '(':
                n += 1
            if expr[i] == ')':
                n -= 1
        return i
    
    def __str__(self):
        return str(self._val)

if __name__ == '__main__':
    exprs = open('exprs.txt', 'r')
    for expr in exprs:
        ans = Expr(expr.split())
        print(f'String Representation Of Input: {ans}')

class Var_expr:
    def __init__(self, bexpr):
        self._val = bexpr

    def __str__(self):
        return self._val

    # Returns All SubExpersions
    def get_all_subexprs(self):
        return []
    
    # Returns All Symbols
    def get_all_symbols(self):
        return {self._val}
    
class Bin_expr:
    def __init__(self, op, expr1, expr2):
        self._e1 = Expr(expr1)
        self._e2 = Expr(expr2)
        self._op = op
    
    def __str__(self):
        return f'<{str(self._e1)} {self._op} {str(self._e2)}>'
    
    # Returns All SubExpersions
    def get_all_subexprs(self):
        return [str(self)] + self._e1.get_all_subexprs() + self._e2.get_all_subexprs()

    # Returns All Symbols
    def get_all_symbols(self):
        return self._e1.get_all_symbols().union(self._e2.get_all_symbols())

class Not_expr:
    def __init__(self, bexpr):
        self._val = Expr(bexpr)

    def __str__(self):
        return f'<not {str(self._val)}>'

    # Returns All SubExpersions
    def get_all_subexprs(self):
        return [str(self)] + self._val.get_all_subexprs()

    # Returns All Symbols
    def get_all_symbols(self):
        return self._val.get_all_symbols();
 
class Expr:
    def __init__(self, bexpr):
        # a, b, c, etc.
        if len(bexpr) == 1:
            self._val = Var_expr(bexpr[0])
        # (not a), (not b), (not (not a)), (not (a and b)), etc.
        elif bexpr[1] == 'not':
            self._val = Not_expr(bexpr[2 : self.match_location(0, bexpr)])
        else:
            if bexpr[1] == '(':
                # E1 = Expression: ((not a) and b), ((a and b) and (not c)), etc.
                e1 = bexpr[1 : self.match_location(1, bexpr) + 1]
            else:
                # E1 = Preposition: (a and (not b)), (a and b), etc.
                e1 = [bexpr[1]]
            if bexpr[len(e1) + 2] == '(':
                # E2 = Expression: ((not a) and (c and d)), ((a and b) and (not c)), etc.
                e2 = bexpr[len(e1) + 2 : self.match_location(len(e1) + 1, bexpr) + 1]
            else:
                # E2 = Preposition: (a and b), ((not a) and b), etc.
                e2 = [bexpr[len(e1) + 2]]
            self._val = Bin_expr('and', e1, e2)

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

    # Returns All SubExpersions
    def get_all_subexprs(self):
        return self._val.get_all_subexprs()
    
    # Returns All Symbols
    def get_all_symbols(self):
        return set(self._val.get_all_symbols())

if __name__ == '__main__':
    exprs = open('exprs.txt', 'r')
    for expr in exprs:
        ans = Expr(expr.split())
        print(f'String Representation Of Input: {ans}')
        print(f'All Sub-Expressions: {ans.get_all_subexprs()}')
        print(f'All Atomic Prepositions: {ans.get_all_symbols()}\n')

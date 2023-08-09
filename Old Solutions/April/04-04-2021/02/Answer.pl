indexL(X, Y, [X|_]) :- Y = 0.
indexL(X, Y, [_|L]) :- Y1 is Y - 1, indexL(X, Y1, L).
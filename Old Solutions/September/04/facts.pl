union([], [], []).
union(L1, [], L1).
union(L1, [H2|T2], [H2|X]) :-
    \+(member(H2, L1)), union(L1, T2, X).
union(L1, [H2|T2], X) :-
    member(H2, L1), union(L1, T2, X).

maximum(L1, L2, X) :-
    union(L1, L2, L), maximum(L, X).

maximum([X], X).
maximum([H|T], X) :-
    maximum(T, X), X > H.
maximum([H|T], H) :-
    maximum(T, X), H > X.


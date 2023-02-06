; Returns CDR Starting At The Item Number Passed In
(define (arbitrary-cdr n l)
  ; Conditional
  (cond
    ; If N < 1 OR N > Length Of The List, Return #f
    ((or (< n 1) (> n (length l))) #f)
    ; If N == 1, Return List
    ((= n 1) l)
    ; Else, Call Arbitrary-Cdr Recursively With N - 1 And CDR Of List
    (#t (arbitrary-cdr (- n 1) (cdr l)))))

; Test
(arbitrary-cdr 3 '(a b c d e))
(arbitrary-cdr 7 '(a b c d e))

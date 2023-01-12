#lang racket

(define swap
  (lambda (sym1 sym2 ls)
    (map (lambda (s)
           ; Using COND As Metioned In The Hint
           (cond
             ;  If   S == SYM1, Return SYM2
             ((equal? s sym1) sym2)
             ;  ElIf S == SYM2, Return SYM1
             ((equal? s sym2) sym1)
             ; Else Return S
             (#t s))) ls)))

(swap 'red 'blue '(red fish blue fish red fish))
(swap 'o 'i '(l o l l i p o p))
(swap 'spam 'ham '(green eggs and ham))

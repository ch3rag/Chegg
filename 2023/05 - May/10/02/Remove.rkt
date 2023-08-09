; Remove Function
; Parameters:
;   1. E: Atom, To Remove From The List
;   2. L: List, From Which Atom Is To Be Removed
; Description: Returns A List With E Removed
(define (remove e l)
  ; Conditional
  (cond
    ; Case - 1
    ; If L Is Null, Return L
    ((null? l) l)
    ; Case - 2
    ; First Element Of L Is Also A List
    ((list? (car l))
     ; Remove E From The First Element List And
     ; Cons The Result List To Rest Of The List With E Removed
     (cons (remove e (car l)) (remove e (cdr l))))
    ; Case - 3
    ; First Element Of L Is Equal To E
    ((eqv? e (car l))
     ; Discard First Element, And Check Rest Of The List
     (remove e (cdr l)))
    ; Case - Else
    ; First Element Of L Is NOT Equal To E
    ; CONS E To The Result List With E Removed
    (#t (cons (car l) (remove e (cdr l))))))

(remove 3 '((1 2 (3))((4 3 5 (6 3 (3 (3) 3) 7) (4 3)) (2 3)) (3)))

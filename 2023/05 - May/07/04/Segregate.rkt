; Segregate-Helper Function
; Parameters:
; 1. F: A Boolean Function
; 2. L: List Of Values
; 3. TL: List Of Values For Which F Is True
; 4. FL: List Of Values For Which F Is False
; Returns: Two Sublists, In Which First Sublist Contains The Values Which Passes Boolan Test
; As True And The Values Which Passes The Boolean Test As False Are In Second Sublist.
(define (segregate-helper f l tl fl)
  (cond
    ; If List L Is Empty, Return TL & FL
    ((null? l) (list tl fl))
    ; If Car Of L Passes Boolean Test Then
    ; Append It To TL And Check Rest Of The Values Recursively
    ((f (car l)) (segregate-helper f (cdr l) (append tl (list (car l))) fl))
    ; If Car Of L Fails Boolean Test Then
    ; Append It To FL And Check Rest Of The Values Recursively
    (#t (segregate-helper f (cdr l) tl (append fl (list (car l)))))))

; Segregate Function
; Parameters:
; 1. F: A Boolean Function
; 2. L: List Of Values
; Returns: Two Sublists, In Which First Sublist Contains The Values Which Passes Boolan Test
; As True And The Values Which Passes The Boolean Test As False Are In Second Sublist.
(define (segregate f l)
  ; Call Helper With F, L & Two Empty List
  (segregate-helper f l '() '()))

; Test Segregate
(segregate even? '(7 2 3 5 8))
(segregate integer? '(3.14 -5.2 8 16 99.7))
(segregate real? '())

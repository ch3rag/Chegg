; Question - 7
; SQRTS Function
; Returns Square Root Of Every Number Of In The List
(define (sqrts l)
  ; If List In Null Return It
  (if (null? l) l
      ; Else, Cons Square Root Of First Number Of List
      ; To The Result Of Calling SQRTS On Rest Of The List
      (cons (sqrt (car l)) (sqrts (cdr l)))))

; Question - 8
; SUM Function
; Returns The Sum Of The List
(define (sum l)
  (cond
    ; If List Is Null Return 0
    ((null? l) 0)
    ; If First Element Of List Is Also A List
    ; Then Call SUM On First Element To Get It's Sum
    ; Add This Sum  To The Sum Of Rest Of The List
    ((list? (car l)) (+ (sum (car l)) (sum (cdr l))))
    ; Else, First Element Of List Is Not A List
    ; Add First Element Of The List To Sum Of Rest Of The List
    (#t (+ (car l) (sum (cdr l))))))


; Question - 9
; SQRTS Using MAP
(define (sqrts-map l)
  ; Define A Lambda Function F(X) => SQRT(X)
  ; And Map It Onto List
  (map (lambda (x)
         (sqrt x)) l))


; Question - 10
; Elements Function
; Counts The Number Of Element In The List
(define (elements l)
  (cond
    ; If List Is Null Return 0
    ((null? l) 0)
    ; If First Element Of List Is Also A List
    ; Then Call Elements On First Element To Get It's Count
    ; Add This Count To The Count Of Rest Of The List
    ((list? (car l)) (+ (elements (car l)) (elements (cdr l))))
    ; Else, First Element Of List Is Not A List
    ; Add 1 To The Count Of Rest Of The List
    (#t (+ 1 (elements (cdr l))))))

; Test Code
(sqrts '(1.0 2.0 4.0))
(sum '(1 (2) ((3 4)) 5))
(sqrts-map '(1.0 2.0 4.0))
(elements '(1 (2 (3) 4) 5 6))
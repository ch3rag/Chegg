;;;;;;;;;;;;;;;; PART - 1 CODE ;;;;;;;;;;;;;;;;
; A: 3 + 5 - 7
(define (run1) (- (+ 3 5) 7))

; B: 2 * (8 + 5 + 4) - 25
(define (run2) (- (* 2 (+ 8 5 4)) 25))
; Result = 9

; C: 10 - (( 3 * 5) + (2 + (0 * 5)))
(define (run3) (- 10 (+ (* 3 5) (+ 2 (* 0 5)))))
; Result = -7

; D:  5 * (4 + (((10 + 10) + (5 * 8)) / (10 + 2)))
(define (run4) (* (+ (/ (+ (+ 10 10) (* 5 8)) (+ 10 2)) 4) 5))
; Result = 45

; E:  ((((((3 + 5) * (6 + 4)) / 2) / 2) – 5) / 3) + ((((2 * 10) + (5 * 4)) / 2) + (4 * 5))
(define (run5) (+ (/ (- (/ (/ (* (+ 3 5) (+ 6 4)) 2) 2) 5) 3) (/ (+ (* 2 10) (* 5 4)) 2)  (* 4 5)))
; Result = 45

;;;;;;;;;;;;;;;; PART - 2 CODE ;;;;;;;;;;;;;;;;
; Either-Zero?
; Returns False If Both Arguments Aren't Zero, True Otherwise
(define (either-zero? x y)
  (if (or (= x 0) (= y 0)) #t #f))

; Same-Sign?
; Returns True If Both Arguments Are Positive Or Both Are Negative, False Otherwise
(define (same-sign? x y)
  (if (or (and (> x 0) (> y 0)) (and (< x 0) (< y 0))) #t #f))

; Pos-Result-Multiply
; Recursively Multiplies Two Arguments Togther
; Result Is Positive No Matter The Sign Of X, Y
(define (pos-result-multiply x y)
  (cond
    ; Base Case
    ; If Y Equals 0 The Result Will Be 0
    ((= y 0) 0)
    ; X Is Negative
    ((< x 0) (pos-result-multiply (* x -1) y))
    ; Y Is Negative
    ((< y 0) (pos-result-multiply x (* y -1)))
    ; Both X And Y Are Positive
    (#t (+ x (pos-result-multiply x (- y 1))))))

; Neg-Result-Multiply
; Recursively Multiplies Two Arguments Togther
; Result Is Negative No Matter The Sign Of X, Y
(define (neg-result-multiply x y)
  ; Use Pos-Result-Multiply As Helper
  ; Multiply It's Result By -1
  (* (pos-result-multiply x y) -1))

; Recursively Multiplies X And Y Togther Using Helpers
(define (recursive-multiply x y)
  (cond
    ; If Either Is Zero, Return Zero
    ((either-zero? x y) 0)
    ; If They Are Same Sign Invoke Pos-Result-Multiply
    ((same-sign? x y) (pos-result-multiply x y))
    ; If They Are Different Sign Invoke Neg-Result-Multiply
    (#t (neg-result-multiply x y))))

; ReadAndMult
; Read Two Numbers And Multiply!
(define (ReadAndMult) 1)

;;;;;;;;;;;;;;;; TEST CODE ;;;;;;;;;;;;;;;;

(display "************************************")
(newline)
(display "Testing run functions")
(newline)
(display "(run1) - answer should be 1 - tested: ")
(run1)
(display "(run2) - answer should be 9 - tested: ")
(run2)
(display "(run3) - answer should be -7 - tested: ")
(run3)
(display "(run4) - answer should be 45 - tested: ")
(run4)
(display "(run5) - answer should be 45 - tested: ")
(run5)
(newline)
(display "Testing multiply helpers")
(newline)
(display "(either-zero? 0 0) - expected #t - got: ")
(either-zero? 0 0)
(display "(either-zero? 1 0) - expected #t - got: ")
(either-zero? 1 0)
(display "(either-zero? 1 1) - expected #f - got: ")
(either-zero? 1 1)
(newline)
(display "(same-sign? 1 1) - expected #t - got: ")
(same-sign? 1 1)
(display "(same-sign? -1 1) - expected #f - got: ")
(same-sign? -1 1)
(display "(same-sign? -1 -1) - expected #t - got: ")
(same-sign? -1 -1)
(newline)
(display "(pos-result-multiply 3 7) - expected 21 - got: ")
(pos-result-multiply 3 7)
(display "(neg-result-multiply 3 7) - expected -21 - got: ")
(neg-result-multiply 3 7)
(newline)
(display "Testing recursive-multiply")
(newline)
(display "(recursive-multiply 6 2) - expected 12 - got: ")
(recursive-multiply 6 2)
(display "(recursive-multiply -6 -2) - expected 12 - got: ")
(recursive-multiply -6 -2)
(display "(recursive-multiply 6 -2) - expected -12 - got: ")
(recursive-multiply 6 -2)
(display "(recursive-multiply -6 2) - expected -12 - got: ")
(recursive-multiply -6 2)
(newline)
(display "Testing ReadAndMult")
(display "Input 6 5 -->")
(ReadAndMult)
(display "30 <-- correct answer")
(newline)
#lang racket

; Converts Celcius To Fahrenheit
; F = (9 / 5) * C + 32
(define (c->f c)
  (+ 32 (* c (/ 9.0 5))))


; Calculates Discriminant Using A, B, C
; B^2 - 4.A.C
(define (discrim a b c)
  (- (* b b ) (* 4 a c)))

; Returns Postive Root
; (-B + D) / 2.A
(define (quad+ a b c)
  (/ (+ (* -1 b) (sqrt (discrim a b c))) (* 2.0 a)))

; Returns Negative Root
; (-B - D) / 2.A
(define (quad- a b c)
  (/ (- (* -1 b) (sqrt (discrim a b c))) (* 2.0 a)))


; Returns Which Quadrant The Point (X, Y) Lies
(define (quadrant x y)
  (cond
    ; X > 0, Y > 0 = First Quadrant
    ((and (> x 0) (> y 0)) 'I)
    ; X < 0, Y > 0 = Second Quadrant
    ((and (< x 0) (> y 0)) 'II)
    ; X < 0, Y < 0 = Third Quadrant
    ((and (< x 0) (< y 0)) 'III)
    ; X > 0, Y < 0 = Fourth Quadrant
    ((and (> x 0) (< y 0)) 'IV)
    ; X == 0, Y == 0 = Origin
    ((and (= x 0) (= y 0)) 'ORIGIN)
    ; X == 0, Any Y  = Y-Axis
    ((= x 0) 'Y-AXIS)
    ; Any X, Y == 0 = X-Axis
    ((= y 0) 'X-AXIS)))



; Computes Sum Of N Numbers
; 1 + 2 + 3 + .. + N
(define (sum-n n)
  (if (= n 1) n
      (+ n (sum-n (- n 1)))))

; Computes Sum Of Squares Of N Numbers
; 1 * 1 + 2 * 2 + 3 * 3 + .. + N * N
(define (sum-n-sq n)
  (if (= n 1) n
      (+ (* n n) (sum-n-sq (- n 1)))))

; Computes Difference B/W Square Of Sum Of N Numbers and Sum Of Squares Of N Numbers
(define (difference n)
  (- (expt (sum-n n) 2) (sum-n-sq n)))

(define matrix-map
  (lambda (f matrix)
    ; X Is Single Row Of The Matrix In The Form Of List
    ; Map F Onto X
    (map (lambda (x) (map f x)) matrix)))

(matrix-map (lambda (x) (* x 2)) '((1 2 3)(4 5 6)(7 8 9)))


(c->f 32)

(newline)

(discrim 5 6 1)
(quad+ 5 6 1)
(quad- 5 6 1)

(newline)

(quadrant 1 1)
(quadrant -1 2)
(quadrant -3 -2)
(quadrant 3 -2)
(quadrant 0 0)
(quadrant 0 -2)
(quadrant 4 0)

(newline)

(difference 10)




                           

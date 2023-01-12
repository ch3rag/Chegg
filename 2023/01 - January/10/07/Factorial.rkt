#lang racket

; Returns The Factorial Of N
(define (fact n)
  ; Let F = 1, Count = 1
  (let ((f 1)
        (count 1))
    ; Helper To Calculate The Factorial Of N Using Recursion
    (define (helper)
      (cond
        ; If Count = N, Return Done
        ((>= count n) 'Done)
        ; Else, Increment Count And Set F = F * Count
        (else
         (set! count (+ count 1))
         (set! f (* f count))
         ; Call Helper Recursively
         (helper))))
    ; Call Helper And Return F
    (helper) f))
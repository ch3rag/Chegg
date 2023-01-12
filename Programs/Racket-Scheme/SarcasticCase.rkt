#lang racket

; Converts A Sentence Into Sarcastic Case And Returns It
; Args: sentence - The Sentence To Convert
(define (sarcastic sentence)
  ; Loop Through Each Character Of  The String
  ; Define Following Variables For Loop:
  ; 1. Chars - List Of Each Character In The String, Afrer Every Iteration Remove First Character From List
  ; 2. UpCase - A Boolean Switch That Flips True And False Afre Evert Iteration.
  ;    The True And False Of UpCase Will Control How The Current Current Is Processed.
  ; 3. Result - A List That Will Accumulate Processed Chars
  (do ([chars (string->list sentence) (cdr chars)]
       [upcase #t (not upcase)]
       [result '()])
    ; If Chars If NULL, All Characters Are Processed
    ; Reverse The Result List, Covert It Into String And Return It
    ((null? chars) (list->string (reverse result)))
        ; At Every Iteration Cons Into Result Following:
        ; If Upcase If True, Convert Current Character To Upcase
        ; Else Convert Current Character To Downcase
        ; (This Coverted Character Will Be Cons To Result)
        (set! result (cons (if upcase (char-upcase (car chars)) (char-downcase (car chars))) result))))
    

(sarcastic "GOOD LUCK... you'll need it!")

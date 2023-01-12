; Creates A Clock
(define (make-clock hours minutes)
  ; Convert Hours And Minutes To Only Minutes
  (let ((currentTime (+ (* hours 60) minutes)))
    
    ; Adds A Zero To The Left Of The Value If It's Single Digit
    (define (left-pad value)
      ; Check If The Value Is Less Than 10
      (if (< value 10)
          ; If True, Append Zero And Then The Value
          (string-append "0" (number->string value))
          ; Else Return The Value As Is
          (number->string value)))
    
    ; Displays The Time In 12 Hours Format
    (define (time)
      (string-append
       (left-pad (modulo (floor (/ currentTime 60)) 12))
       ":"
       (left-pad (modulo currentTime 60))
       (if (> (floor (/ currentTime 60)) 11) " PM" " AM")
       ))

    ; Displays The Time In 24 Hours Format
    (define (military)
      (string-append
       (left-pad (floor (/ currentTime 60)))
       ":"
       (left-pad (modulo currentTime 60))
       ))

    ; Advances The Clock By One Second
    (define (tick) (set! currentTime (modulo (+ currentTime 1) 1440)))

    ; Returns A Function Based On Command
    (define (execute command)
      (cond
        ((equal? command 'time) time)
        ((equal? command 'military) military)
        ((equal? command 'tick) tick)))
    ; Return Execute Function
    execute))


(define clock (make-clock 2 0))
(define get-time (clock 'time))
(define get-mil (clock 'military))
(get-mil)
((clock 'tick))
(display (get-time))
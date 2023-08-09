(define (pay-back charge)
  ; For Charges Less Than 500
  (if (< charge 500) (* charge 0.0025)
      ; For Charges Less Than 1500
      (if (< charge 1500) (+ 1.25 (* (- charge 500) 0.0050))
          ; For Charges Less Than 2500
          (if (< charge 2500) (+ 1.25 5 (* (- charge 1500) 0.0075))
              ; For Charges More Than 2500
              (+ 1.25 5 7.5 (* (- charge 2500) 0.01))))))

(pay-back 400)
(pay-back 1400)
(pay-back 2000)
(pay-back 2600)
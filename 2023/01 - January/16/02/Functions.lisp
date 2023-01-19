; Calculates And Returns Sum Of All Numbers
; B/W N And P Inclusive
(defun a-sum (n p)
	; If N Is Greater Than P, Return 0
	(if (> n p) 0
		; Else Return N + A-SUM(N + 1, P)
		(+ n (a-sum (+ n 1) p))))


; Calculates And Returns Sum Of All Odd Numbers
; B/W N And P Inclusive
(defun sum-odd (n p)
	(cond
		; If N Is Greater Than P, Return 0
		((> n p) 0)
		; If N Is Even Return, Sum-Odd(N + 1, P)
		((evenp n) (sum-odd (+ n 1) p))
		; Else, N Is Odd, Return
		; N + Sum-Odd(N + 2, P)
		(t (+ n (sum-odd (+ n 2) p)))))

; Accepts F(X) As Argument And Returns F(1)
(defun my-function (f)
	(funcall f 1))

; Accepts F(X) As Argument And Returns
; Sigma F(I) For N <= I <= P
(defun sigma (f n p)
	(if (> n p) 0
		(+ (funcall f n) (sigma f (+ n 1) p))))

(print (a-sum 0 3))
(print (a-sum 1 3))
(print (a-sum 2 4))


(print (sum-odd 1 5))
(print (sum-odd 2 5))
(print (sum-odd 2 1))

(print (my-function #'(lambda (x) (+ (* 3 x x) 4.7))))

(print (sigma #'(lambda (x) x) 0 3))
(print (sigma #'(lambda (x) (* x x)) 0 3))
(defun odd-gt-million (x)
 ; If X is Integer
 (if (integerp x)
	; If X is Odd
 	(if (oddp x)
		; If X is Greater Than A Million
		(if (> x 1000000) t))))

(print (odd-gt-million 92010231))
(print (odd-gt-million 17))
(print (odd-gt-million 92010232))
(print (odd-gt-million 21/5))
(print (odd-gt-million 1718671.24))
(print (odd-gt-million '(2010231)))
(print (odd-gt-million 'APPLE))

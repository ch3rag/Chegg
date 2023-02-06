(defun arbitrary-cdr (n l)
	(cond
		((or (< n 1) (> n (length l))) NIL)
		((= n 1) l)
		(t (arbitrary-cdr (- n 1) (cdr l)))))

(print (arbitrary-cdr 3 '(a b c d e)))
(print (arbitrary-cdr 7 '(a b c d e)))
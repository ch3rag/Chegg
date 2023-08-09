(defun rn (sequence)
	(cond 
		((null sequence) '())
		((listp (car sequence)) 
			(append (append (rn (cdr sequence)) (list (rn (car sequence))))))
		(t (append (rn (cdr sequence)) (list (car sequence))))))

(print (rn '(a b (c d (e f)))))
(print (rn '(a (b c) d (e (f)))))


;; (defun cn (sequence &optional (depth 0))
;; 	(cond
;; 		((null sequence) depth)
;; 		((not (listp sequence)) depth)
;; 		((listp (car sequence)) 
;; 			(max (cn (car sequence) (1+ depth)) (cn (cdr sequence) depth)))))


(defun cn (sequence &optional (depth 0))
	(cond
		((null sequence) depth)
		((not (listp sequence)) depth)
		(t (max (cn (car sequence) (1+ depth)) (cn (cdr sequence) depth)))))
(print (cn '7))
(print (cn '()))
(print (cn '((7))))
(print (cn '((7) 8)))
(print (cn '(7 (8))))
(print (cn '(7 (8 (9)) (10))))
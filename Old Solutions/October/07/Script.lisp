; A - Finds Length of a List
(defun find-length (x)
	(cond
		; Return Nil If List Is Empty
		((null x) nil)
		; Base Condition For Recursion
		; If List Contains One Element Return 1
		((null (cdr x)) 1)
		; Else Return 1 + Length Of Rest Of The List
		(t (+ 1 (find-length (cdr x))))))

(print (find-length '(f r o b)))

; B - Returns All The Instances Of The Item In The List
; With It's Frequency
; We Will Keep Track Of The Frequency Using An Optional Argument 'f'
(defun find-member (e x &optional (f 0))
	(cond
		; If X is Empty And F == 0, Return NIL Else Return (f)
		((null x) (if (= f 0) NIL (list f)))
		; If E == X Cons E To (Find-Member E (Rest-Of-List) F+1)
		((equalp e (car x)) (cons e (find-member e (cdr x) (+ 1 f))))
		; E != X, Find-Member In Rest-Of-List
		(t (find-member e (cdr x) f))))

(print (find-member 'b '(f o o b a r b a z)))
(print (find-member 'b '(f o o b a r b a z b e e z)))
(print (find-member 'b '(f o o z)))
(defun set-union (L1 l2)
	; If L1 is Null, Return L2
	(if (null L1) L2
		; If CAR L1 is Member of L2
		(if (member (car L1) L2)
			; Do Not Append It To Result
			; Use Recursion To Union Rest Of The List
			(set-union (cdr L1) L2)
			; Append It To Result
			; Use Recursion To Union Rest Of The List
			(cons (car L1) (set-union (cdr L1) L2)))))

(print (set-union '() '(A C 7 F G)))
(print (set-union '(Y P A B) '(A C 7 F G)))
(print (set-union '(7 Y P A B) '(A C 7 F G)))
(print (set-union '(3 Y P A B) '(A C 7 F G)))
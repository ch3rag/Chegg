(defun sub-list3 (l x &optional (y NIL))
	; Set Size = Length Of List L
	(setq size (length l))
	; When Y Is NIL, Set It To Length Of The List
	(when (null y) (setq y size))
	; To Keep Track Whether X > Y
	(setq x-gt-y NIL)
	; When X > Y
	(when (> x y)
		; Set X-GT-Y To True
		(setq x-gt-y t)
		; Swap X With Y
		(setq temp x)
		(setq x y)
		(setq y temp))
	
	; Check Bounds For X And Y
	(when (< x 1) (setq x 1))
	(when (> y size) (setq y size))

	; Loop And Add Values
	(setq final '())
	(setq ct 0)
	(loop for e in l do
		(setq ct (1+ ct))
		(if (and (>= ct x) (<= ct y))
			(setq final (cons e final))))
	; We Don't Need To Reverse The List If X > Y
	(if (not x-gt-y) (setq final (reverse final))) final)

(print (sub-list3 '(1 4 10) 2 3))
(print (sub-list3 '(1 4 10) 2))
(print (sub-list3 '(1 7 12) 1 4))
(print (sub-list3 '(1 7 12) 0 1))
(print (sub-list3 '(1 4 10) 3 2))
(print (sub-list3 '(1 4 10) 3))
(print (sub-list3 '(1 7 12) 4 0))
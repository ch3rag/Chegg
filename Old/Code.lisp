; Display Prompt
(princ "What is the age?")
; Print A New Line
(terpri)
; Input Age From The Console
(defparameter *age* (read))

;; Your Code
(defvar *college-ready* nil)

(cond
    ((>= *age* 18)
        (setf *college-ready* 'yes)
        (format t "Ready for College~%"))
    ((< *age* 18)
        (setf *college-ready* 'no)
        (format t "Not Ready for College~%")))
        
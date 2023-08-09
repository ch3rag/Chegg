(defun slice (vec beg &optional (end (length vec)))
  "Return an array-slice into VEC from BEG to END.
   If VEC is already a displaced array, recursively ascend to the original
   non-displaced array and create a slice into it
   (to avoid multiple levels of indirection)."
  (loop (multiple-value-bind (disp-to disp-index) (array-displacement vec)
          (if disp-to
              (setf vec disp-to
                    beg (+ beg disp-index)
                    end (when end (+ end disp-index)))
              (return))))
  (let ((size (max 0 (- (or end (length vec)) beg))))
    (apply #'make-array size :element-type (array-element-type vec)
           (unless (zerop size)
             (list :displaced-to vec :displaced-index-offset beg)))))

(defstruct movie
  title  director year type)

(defparameter *size* 3)

(defvar *db*)

(setf *db* (make-array *size*  :initial-element nil))

(defvar *db-list*)

(setf *db-list*  nil)  

(defun quicksort (vec comp)
  (when (> (length vec) 1)
    (let ((pivot-i 0)
          (pivot (aref vec (1- (length vec)))))
      (dotimes (i (1- (length vec)))
        (when (funcall comp (aref vec i) pivot)
          (rotatef (aref vec i)
                   (aref vec pivot-i))
          (incf pivot-i)))
      (rotatef (aref vec (1- (length vec)))
               (aref vec pivot-i))
      (quicksort (slice vec 0 pivot-i) comp)
      (quicksort (slice vec (1+ pivot-i)) comp)))
  vec)

(defun add-movie (m)
  "Adds a movie to the DB and returns true"
  (dotimes (i *size*)
    (when (null (aref *db* i))
      (setf (aref *db* i) m)
      (return *db*))))

(defun add-movie-list (m)
  "Adds a movie to the end of *db-list* and returns the list"
  (setf *db-list* (append *db-list* (list m))))

; Sorts The DB By Movie Year
(defun sort-year ()
	(quicksort *db* (lambda (m n) (<= (movie-year m) (movie-year n)))) *db*)

; Sorts The DB By Movie Title
(defun sort-title ()
	(quicksort *db* (lambda (m n) (string<= (movie-title m) (movie-title n)))) *db*)


;; (add-movie (make-movie :title "Matrix" :year 1999))
;; (add-movie (make-movie :title "Gravity" :year 2013))
;; (add-movie (make-movie :title "Aliens" :year 1986))

;; (print *db*)
;; (print (sort-year))
;; (print (sort-title))

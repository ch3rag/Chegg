(defstruct movie
  title  director year type)

(defparameter *size* 3) 

(defvar *db*)

(setf *db* (make-array *size*  :initial-element nil))

(defun add-movie (m)
	"Adds a movie to *db* and returns *db*"
	; Only When Database Isn't Full And Movie Not Already In DB
	(when (not (or (= (num-movies) *size*) (in-db? (movie-title m))))
		(dotimes (i *size*)
			(when (null (aref *db* i))
			(setf (aref *db* i) m)
			(return *db*)))))

(defun in-db? (title)
  "Returns *db* if movie title is in the database; otherwise returns NIL"
  (dotimes (i *size*)
    (when (and (typep (aref *db* i) 'movie)
               (equal (movie-title (aref *db* i)) title))
      (return *db*))))

; Returns The Number Of Movies In The Database
(defun num-movies ()
	; Let Counter = 0
	(let ((count 0))
		; Loop Size Times
		(dotimes (i *size*)
			; When Current Reference In DB Is Not Null, Increment The Count
			(when (typep (aref *db* i) 'movie)
				(setf count (+ count 1)))) count))


;; (print (add-movie (make-movie :title "Run")))
;; (print (add-movie (make-movie :title "Top Gun")))
;; (print (add-movie (make-movie :title "Heat")))
;; (print (add-movie (make-movie :title "Run")))
;; (print (num-movies))
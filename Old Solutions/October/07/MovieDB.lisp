(defstruct movie
	title director year type)

(defparameter *size* 3) 

(defvar *db*)

(setf *db* (make-array *size* :initial-element nil))

(defun add-movie (m)
	"Adds a movie to *db* and returns *db*"
	(if (in-db? (movie-title m)) NIL
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

; Add Days Of Summer Of Summer And Wall-E
(add-movie (make-movie :Title "Days of Summer" :Director "Marc Webb" :Year 2009 :Type "Comedy"))
(add-movie (make-movie :Title "WALL-E" :Director "Andrew Stanton" :Year 2008 :Type "Animation"))


; Add Wall-E Again, Should Return NIL
(format t "Added Days Of Summer Of Summer And Wall-E")
(format t "~%~%Adding Wall-E Again:")

(print (add-movie (make-movie :Title "WALL-E" :Director "Andrew Stanton" :Year 2008 :Type "Animation")))

; Add Twilight
(add-movie (make-movie :Title "Twilight" :Director "Catherine Hardwicke" :Year 2009 :Type "Romance"))


(format t "~%~%Added Twilight.~%~%All Three Movies:")

; Should Print All 3 Movies
(print *db*)

; Adding 4th Movie
; Should Return NIL
(format t "~%~%Adding Fourth Movie... Should Print NIL")
(print (add-movie (make-movie :Title "Tangled" :Director "Nathan Greno" :Year 2011 :Type "Animation")))

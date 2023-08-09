(defstruct movie
	title director year type)

(defparameter *size* 3) 

(defvar *db*)

(setf *db* (make-array *size* :initial-element nil))

(defun add-movie (m)
	"Adds a movie to *db* and returns *db*"
	(dotimes (i *size*)
		(when (null (aref *db* i))
			(setf (aref *db* i) m)
			(return *db*))))

(defun in-db? (title)
	"Returns *db* if movie title is in the database; otherwise returns NIL"
	(dotimes (i *size*)
		(when (and (typep (aref *db* i) 'movie)
			(equal (movie-title (aref *db* i)) title))
			(return *db*))))


; Returns The Number Of Movies in The Database
(defun num-movies ()
	"Returns the number of movies in the database"
	; Let N = 0
	(let ((n 0))
		; Loop Through DB
		(dotimes (i *size*)
			; If Item At Current Index Is A Movie
			; Then N = N + 1
			(if (typep (aref *db* i) 'movie)
				(setf n (+ n 1)))) n))
			
(format t "Number Of Movies: ~A~%" (num-movies))

; Add Days Of Summer Of Summer And Wall-E
(add-movie (make-movie :Title "Days of Summer" :Director "Marc Webb" :Year 2009 :Type "Comedy"))
(add-movie (make-movie :Title "WALL-E" :Director "Andrew Stanton" :Year 2008 :Type "Animation"))

; Add Wall-E Again, Should Return NIL
(format t "Added Days Of Summer Of Summer And Wall-E~%")
(format t "Number Of Movies: ~A~%" (num-movies))

; Add Twilight
(add-movie (make-movie :Title "Twilight" :Director "Catherine Hardwicke" :Year 2009 :Type "Romance"))
(format t "Added Twilight.~%")

(format t "Number Of Movies: ~A~%" (num-movies))

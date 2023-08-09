(defstruct movie title director year type)

(defparameter *size* 3) 

(defvar *db*)

(setf *db* (make-array *size*  :initial-element nil))

(defun num-movies ()
	"Returns the number of movies in the database"
	; Count Of Movies
	(let ((count 0))
		; Loop Through DB
		(dotimes (i *size*)
		; When Array Reference Is Not Null, Increment Count
		(when (not (null (aref *db* i)))
				(setf count (+ count 1))))
		; Return Count
		count))
		

(defun add-movie (m)
	"Adds a movie to *db* and returns *db*"
	; Change It To Only Add If There Is Empty Reference In DB And Movie
	; Is Not Already Present
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

(defun delete-movie (title)
	"Deletes a movie from the database"
	(when (in-db? title)
		; Loop I Times
		(dotimes (i *size*)
			; When Movie At Index I Has Title Which We Want To Remove
			(when (equal (movie-title (aref *db* i)) title)
				; Shift Array To Fill Empty Array Reference
				(do ((j i (+ j 1)))
					((= j (- *size* 1)))
					(setf (aref *db* j) (aref *db* (+ j 1))))
				; Set Last Reference In DB to NIL
				(setf (aref *db* (- *size* 1)) NIL)
				; Return DB
				(return *db*)))))


(defun replace-movie (n nm)
	"Replaces a movie with another movie"
	(when (and (in-db? (movie-title n)) (not (in-db? (movie-title nm))))
		; Loop I Times
		(dotimes (i *size*)
			; When Movie At Index I Has Title Which We Want To Replance
			(when (equal (movie-title (aref *db* i)) (movie-title n))
				; Replace Movie At Index I With New Movie
				(setf (aref *db* i) nm)
				; Return True
				(return t)))))

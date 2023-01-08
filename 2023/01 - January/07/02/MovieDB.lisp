(defstruct movie title director year type)

(defparameter *size* 3) 

(defvar *db*)

(setf *db* (make-array *size*  :initial-element nil))


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


(defun replace-movie (n nm)
	"Replaces a movie with another movie"
	; Only When N is in DB and and NM is NOT in DB
	(when (and (in-db? (movie-title n)) (not (in-db? (movie-title nm))))
		; Loop I Times
		(dotimes (i *size*)
			; When Movie At Index I Has Title Which We Want To Replace
			(when (equal (movie-title (aref *db* i)) (movie-title n))
				; Replace Movie At Index I With New Movie
				(setf (aref *db* i) nm)
				; Return True
				(return t)))))
